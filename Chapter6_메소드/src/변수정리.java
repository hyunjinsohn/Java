/*
 * 	p.230
 * 	  절차적 / 객체지향
 * 	  ------------ 완제품 / 레고
 * 	  객체지향
 * 	  -----
 * 		코드를 재사용할 수 있음
 * 		코드 관리가 용이함 (코드가 간결해짐)
 * 		검증된 소스를 사용하기 때문에 신뢰성 뛰어남
 * 		=> 기존 / 신성 ==> 조립식 프로그램
 * 		=> 상속 / 포함 , 기능추가 / 수정 , 데이터 보호 
 * 		   --------   ------------  --------
 * 			재사용성		  다형성        캡슐화
 * 			*** 캡슐화, 오버라이딩, 포함
 * 		class JFrame : 1000줄
 * 		class A extends JFrame
 * 		
 *	  객체지향 제작
 *	  ---------
 *	   클래스 : 데이터를 여러개 묶어서 저장하기 위한 설계(관련된 데이터를 묶는다)
 *	   클래스 구성요소 
 *		데이터 저장 : 변수
 *		데이터 활용 : 메소드
 *		데이터 주입 : 생성자
 *		--------------- 여러개 사용 가능 
 *		***클래스
 *			----
 *				데이터만 가지고 있는 클래스 : 데이터형 클래스 (사용자 정의 데이터형)
 *				메소드만 가지고 있는 클래스 : 액션 클래스 (기능만 가지고 있다)
 *				데이터+메소드 가지고 있는 클래스 : 조립 클래스 (main())
 *     클래스 메모리 저장
 *     	클래스명 변수명=new 클래스명()
 *     	---------------------- new 연산자는 새로운 메모리 만들어 준다 !!
 * 
 * 		1) 변수		( 같이 쓸거다!하면 공유하는 변수, 클래스변수 쓰면되고 / 따로 쓸거다!하면 따로 쓰는 변수, 인스턴스변수 쓰면됨 )
 * 		   인스턴스변수 : new를 이용할 때마다 따로 생성되는 변수 (값저장 시, 다른 데이터값을 가지고 있음) ***** 주로 사용되는 변수 *****
 * 
 * 		   클래스변수 : 컴파일러에 의해 자동으로 생성되는 변수 => 메모리 공간이 한 개이기 때문에 모든 데이터값이 동일함
 * 					 공유할 때 사용
 * 					 static 사용 (static이 보인다? 공유하는 변수다) (네트워크) => 서버 (접속자 정보) => IP
 * 
 * 		   ==> 모든 데이터가 static인 데이터가 있다?!? 바로 오라클이다 !! 
 * 
 * 		   지역변수(매개변수) : 메소드 안에서 선언 => 메소드 호출이 종료되면 자동으로 사라지는 변수
 * 		   ------------ for, while문 루프 돌릴 때 사용
 * 
 * 			의뢰 ====> 요구사항 분석 ====> 데이터베이스 설계 ====> 구현 ====> 테스팅 ====> 배포
 * 			-------------------      -------------      ----     ------
 * 				    PM					  DBA 		    웹프로그래머  테스터
 * 			--------------------------------------		----	 ------
 * 						   클래스 설계						객체 생성	   호출
 * 
 * 
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
