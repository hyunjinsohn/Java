package com.sist.main;
/*
 * 		개발 / 유지보수 
 * 		---(1년) ----(10~15년)	==> 개발 / 유지보수
 * 									SI	   SM		=>  (SI/SM) 
 * 		7장 => 객체지향의 특성 
 * 			  = 유지보수
 * 				----- 재사용 , 수정 , 추가
 * 					  변경 후 사용(상속) / 변경 없이 사용(포함)
 * 					  -------- 오버라이딩 ---------- 오버로딩
 * 					  데이터해킹 방지 / 변질 방지 ==> 캡슐화
 * 					  가독성 / 최적화
 * 					  ----------- 형식 일치 (프레임워크) ==> Spring / MyBatis / JPA
 * 			  클래스 종류 ==> 사용처
 * 
 * 			1) 상속 ==> 교재 p.310
 * 			   기존의 클래스를 재사용해서 새로운 클래스를 만듦
 * 			   --------------- 1) 소스량을 줄일 수 있음 , 신뢰성이 떨어짐 , 코드의 중복 제거
 * 							   2) 메모리가 커짐 => 속도가 늦다
 * 			   ==> extends (확장)
 * 				   class A extends B ==> B클래스를 확장한 클래스 A를 만듦
 * 										 ----- 모든 내용을 가지고 온다 
 * 										 ----- 변수 / 메소드 / 생성자
 * 														   ----- 제외
 * 											   ---------- private
 * 					** 상위클래스 (상속을 내리는 클래스) : this
 * 					** 하위클래스 (상속을 받는 클래스) : 상위클래스의 내용을 제어 할 수 있음 (super) **
 * 												 본인 클래스 제어 가능 (this)
 * 				==> 상속을 받은 후에 변경
 * 					오버라이딩 (덮어씀)
 * 					 => 메소드명 , 리턴형 , 매개변수가 동일 , 접근지정어는 동일하지 않는 경우도 있음
 * 						메소드는 대부분이 public
 * 				==> 데이터 보호 : 캡슐화
 * 					변수 : private , 메소드 통해서 접근 ==> getter / setter
 * 					--- 읽기 / 쓰기					  (읽기)	   (쓰기)
 * 			2) 포함 ==> 재사용 , 변경 ==> 익명의 클래스
 * 				B b=new B()
 * 				{
 * 					오버라이딩
 * 				}
 * 
 * 			3) new => 사용하지 말아라
 * 				   => 대체하는 프로그램 : 리플렉션 ==> 9장
 * 					
 * 
 */
// 디자인 패턴 ==> 싱글턴 패턴 
class A
{
	private static A a;
	public static A newInstance()
	{
		if(a==null)
			a=new A();
		return a;
	}
}
public class MainClass_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=A.newInstance();
		System.out.println("a="+a);
		A b=A.newInstance();
		System.out.println("b="+b);
		A c=A.newInstance();
		System.out.println("c="+c);
		
	}

}
