package com.sist.main;
/*
 * 	 객체지향프로그램 (권장 사항)
 * 		1) 데이터 보호
 * 		    변수 => private
 * 			메소드 => 접근이 가능하게 만듦 ==> getXxx() / setXxx() (getter, setter)
 * 									   ------------------- 변수의 기능 (메모리에 저장 , 메모리에서 읽기)
 * 		2) 데이터 기능별 분리 
 * 		----------------------------- 캡슐화
 * 		3) 재사용 기법
 * 			= 상속 (is-a) : 변경해서 사용할 때 (메소드(기능))
 * 				형식)
 * 					 class SubClass extends SuperClass
 * 									------- 확장
 * 					 => 기존의 클래스를 확장해서 새로운 클래스 제작
 * 					 => 기능 추가 , 변수 추가 , 기능 변경 , 변수값 변경
 * 										  ---- 메소드 => 오버라이딩
 * 					 => 단일 상속을 기본으로 함 
 * 					 => 객체 생성하는 방법 
 * 						 하위클래스 a=new 하위클래스() ==> 기본형식 (상위클래스를 확장) => 상속 받은 클래스를 주로 이용함
 * 							=> 상위클래스 a=new 상위클래스() ==> 거의 사용 X
 * 						 상위클래스 a=new 하위클래스() : 인터페이스 , 추상클래스 , Spring , 데이터베이스
 * 								  --------------  -----------------
 * 												   객체 생성을 할 수 X
 * 												  (미완성 클래스 => 사용자 완성해서 사용)
 * 												  *** 인터페이스 (Spring의 기반) : 기술면접 95%나옴
 * 					 	*** 객체생성 시 => 생성자명이 틀리다 (인터페이스 , 패턴)
 * 						Calendar c=Calendar.getInstance()
 * 						Date d=new Date();
 * 						List list=new ArrayList()
 * 						Map map=new HashMap()
 * 						----------------------------------
 * 						하위클래스 a=(하위클래스)상위클래스;   ==> 라이브러리
 * 						new => 가급적이면 new를 사용 X
 * 							   new => 결합성이 높은 프로그램
 * 										|-> 다른 클래스에 영향이 얼마인가?
 * 									  ---- 응집성 (메소드 => 한가지 기능을 수행)
 * 						상위클래스 > 하위클래스 (데이터형) ==> 범위가 더 큼
 * 						------------------------------------------ 공통적인 내용이 어느 클래스가 더 많은가?
 * 						상위클래스 < 하위클래스 (메모리크기) ==> 상속 받은 것 + 본인 것(추가)
 * 						float > long
 * 						  4       8   ==> 표현할 수 있는 수?
 * 						1 ==> 1.000000
 * 							  1.000001
 * 							  1.000011
 * 							  1.000111
 * 						-------------------- 형변환
 * 						클래스는 상속 / 포함을 해야 크기를 정한다
 * 						class A
 * 						{
 * 							int a,b;
 * 						}
 * 						class B extends A
 * 						{
 * 							int a,b;
 * 						}
 * 
 * 						A>B
 * 
 * 						class A
 * 						{
 * 							int a;
 * 						}
 * 						class B
 * 						{
 * 							A aa=new A();
 * 						}
 * 
 * 						A<B
 * 
 * 						==> 형변환이 가능 (상속,포함)
 * 
 * 			= 포함 (has-a) : 기존의 클래스를 포함해서 사용 => 변경없이 사용 시에 多사용  *** 훨씬 많이 씀
 * 
 * 				class A , class B , class C , class D
 * 				class E
 * 				{
 * 					A a=new A();
 * 					B b=new B();
 * 					C c=new C();
 * 					D d=new D();
 * 				}
 * 				---------------------------- 재사용 기법
 * 				*** 자바의 모든 클래스는 Object를 상속
 * 						--------- 1) 소멸자 , 2) 문자열 변환 , 3) 메모리 복제
 * 								  finalize()  to String	 	 clone()
 * 									=> 우리 눈엔 보이지 않음 => 자동첨부가 된다는 뜻 => extends Object (모든 클래스는 object상속)
 * 									=> 기본 생성자 첨부
 * 									=> return(void)
 * 									=> import java.lang.*;   => 자동첨부
 * 											  ----------- String , Math , System , ...
 * 									=> 자바의 모든 클래스는 예외처리를 가지고 있음 (생략을 할 뿐)
 * 									   컴파일		인터프리터 
 * 									   javac	java
 * 									  (예외처리)	(예외처리 생략 가넝)
 * 				변경해서 사용 => 오버라이딩 (덮어쓰다)
 * 					* 오버라이딩 조건
 * 						1) 상속이 있어야함 (기존의 기능을 변경) 
 * 						2) 메소드명이 동일해야함
 * 						3) 매개변수가 동일함 (개수 , 데이터형 동일)
 * 						4) 리턴형이 동일함
 * 						5) 접근지정어를 축소할 수 없다 , 확대는 가능
 * 							private < default < protected <  public
 * 							
 * 							(예)
 * 								class A
 * 								{
 * 									void display(){}
 * 								class B extends A
 * 								{
 * 									public void display(int a){}
 * 									// 오버로딩
 * 								}
 */
class 동물 // 동물 
{
	public void eat()	
	{
		System.out.println("먹는다");
	}
}
class 개 extends 동물		// 동물 , 개 둘 다 사용 가능
{	
	/*
		void eat()
		{
			System.out.println("먹는다");
		}
	*/
	public void eat()
	{
		System.out.println("개같이 먹는다");
	}
}
class 소 extends 동물		// 동물 , 소 둘 다 사용 가능
{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void eat()
	{
		System.out.println("소같이 먹는다");
	}
}
class 돼지 extends 동물	// 동물 , 돼지 둘 다 사용 가능
{
	public void eat()
	{
		System.out.println("돼지같이 먹는다");
	}
}
// 상속 => 클래스를 1개로 객체 생성 가능 => 관련된 클래스 여러개를 모아서 관리해줌 

public class MainClass_다형성1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		동물 ani=new 개();	// 변수는 클래스 타입
		//		--------
		ani.eat();
		ani=new 소();
		//	--------
		ani.eat();
		ani=new 돼지();
		//  -------- 메소드는 생성자가 가지고 있는 메소드를 호출함
		ani.eat();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
