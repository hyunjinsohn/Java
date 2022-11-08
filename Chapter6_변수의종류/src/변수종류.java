/*		p246
 * 
 * 		변수의 종류
 * 		--------
 * 		 class ClassName
 * 			{
 * 				------------------------
 * 				멤버변수 (전역변수)
 * 					= 인스턴스변수
 *					= 클래스변수, 공유변수
 * 				------------------------
 * 				void 메소드(--------------매개변수)
 * 				{
 * 				    -----------------------
 * 					지역변수
 * 					-----------------------	
 * 				}
 * 			}
 * 			---------------------------------------------------------
 * 				종류			    선언위치		  		  생성시기 
 * 			---------------------------------------------------------
 * 			  인스턴스변수		클래스 블럭
 * 							class ClassName		
 * 							{
 * 							  -----------
 * 							}
 * 							=> 클래스 영역안에
 * 													인스턴스를 생성
 * 													클래스 변수=new클래스();
 * 															---- 반드시 new 사용시에 생성
 * 															*** 따로 메모리가 생김
 * 													설정)
 * 													class ClassName
 * 													{
 * 														데이터형 변수명;
 * 														데이터형 변수명;
 * 														...
 * 													    예) int score;
 * 														   String name;
 * 														   String sex;
 * 													}
 * 			---------------------------------------------------------
 * 			  클래스변수		클래스 블럭
 * 							class ClassName
 * 							{
 * 							}
 * 
 * 							=> 클래스 영역안에
 * 											컴파일 될 때 자동으로 생성되는 변수
 * 											*** 한개만 생성되기 때문에 모든 객체 공유하는 변수
 * 											class ClassName
 * 											{
 * 												static int a;
 * 												static int b;
 * 												static String c,d,e;
 * 											}
 * 							1) 인스턴스 변수
 * 						    2) 클래스 변수
 * 							------------ 기본 디폴트 초기화
 * 							int => 0
 * 							long => 0L
 * 							float => 0.0F
 * 							double => 0.0
 * 							boolean => false
 * 							클래스 => null (주소가 없는 상태)	: String name; ==> null
 * 							--------------------------
 * 							=> 클래스 변수 : 한번에 모든 객체의 데이터 변경 (공통변수)
 * 							=> 사용법
 * 								1) 인스턴스변수
 * 								   -> 객체명.변수
 * 									  Scanner scan=new Scanner(System.in)
 * 									  scan.nextInt()
 * 								   --------
 * 								2) 클래스변수
 * 								   -> 객체명.변수
 * 								   -> 클래스명.변수
 * 									  Math.random()
 * 			---------------------------------------------------------
 * 			  매개변수			메소드 괄호 안에 선언된 변수
 * 							메소드명(-------------)
 * 											메소드 호출 후에 데이터를 전송했을 경우에 생성되는 변수
 * 											*** 사용자의 요청값을 받는 경우
 * 											void display(int a)
 * 											{
 * 											}
 * 
 * 											=> display(10)
 * 											*** 호출 후에 자동으로 메모리 해제
 * 											*** Stack 영역에 저장 (메모리 자체에서 관리)
 * 			---------------------------------------------------------
 * 			  지역변수			=> 메소드 블럭 안에 선언되는 변수
 * 							메소드명()
 * 							{
 * 							  -----------
 * 							}
 * 											메소드 호출 시마다 생성되는 변수
 * 											display()
 * 											{
 * 											  int a=0;
 * 											}
 * 											*** 루프변수 (반복문)
 * 											*** 반드시 초기화를 해야된다
 * 			  변수 ==> 기본형, 배열, 클래스
 * 					 ---------------- 변수
 * 					 기본형 : 한개의 데이터만 저장 가능
 * 					 배열 : (관련된 데이터)같은 데이터형을 모아서 저장
 * 					 클래스 : (관련된 데이터)다른 데이터형 모아서 저장
 * 			---------------------------------------------------------
 * 			같은 학교에 대한 클래스 설계 
 * 			class Student
 * 			{
 * 				int hakbun;
 * 				String name;
 * 				String subject;
 * 				--------------
 * 				static String schoolName;	// 메모리에 저장된 상태
 * 			}
 * 
 * 			Student s1=new Student(); ==> hakbun, name, subject ==> 메모리에 저장 (12byte)
 * 			s1.hakbun
 * 			s1.name
 * 			s1.subject
 * 			-------------------> 
 * 			s1. schoolName
 * 			Student.schoolName =====> 메소드, 변수 ==> 클래스명으로 접근하면 (static) : Math
 * 			------------------
 * 
 * 			String s="Hello Java";
 * 			s.substring()
 * 			s.trim()
 * 			s.lenth()
 * 			String.valueOf()
 * 
 */
class Card
{
	int number;
	String image;
	int width,height;	//카드 크기
}
public class 변수종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card();
		card1.number=2;
		card1.image="♠";
		card1.width=100;
		card1.height=180;
		
		Card card2=new Card();	// 저장공간이 다르다 (인스턴스변수)
		card2.number=5;
		card2.image="♣";
		card2.width=100;
		card2.height=180;
		
		Card card3=new Card();	// 저장공간이 다르다 (인스턴스변수)
		card3.number=7;
		card3.image="♥";
		card3.width=100;
		card3.height=180;
		
		Card card4=new Card();	// 저장공간이 다르다 (인스턴스 변수) 사용법 : 객체명.변수명
		card4.number=9;
		card4.image="▶";
		card4.width=100;
		card4.height=180;
		
		// 출력
		System.out.println(card1.number);
		System.out.println(card1.image);
		System.out.println(card1.width);
		System.out.println(card1.height);
		
		System.out.println(card2.number);
		System.out.println(card2.image);
		System.out.println(card2.width);
		System.out.println(card2.height);
		
		System.out.println(card3.number);
		System.out.println(card3.image);
		System.out.println(card3.width);
		System.out.println(card3.height);
		
		System.out.println(card4.number);
		System.out.println(card4.image);
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		
		System.out.println("=============================");
		card1.width=300;
		card1.height=350;
		System.out.println("---------- card 2 -----------");
		System.out.println(card2.width);
		System.out.println(card2.height);
		System.out.println("---------- card 3 -----------");
		System.out.println(card3.width);
		System.out.println(card3.height);
		System.out.println("---------- card 4 -----------");
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		// static ==> 메모리 공간이 동일 => 공유메모리
		/*
		 * 	인스턴스변수는 객체가 생성 될 때 객체마다 각기 다른 메모리를 생성하기 때문에 다른 값을 유지 (***)
		 * 	클래스변수는 저장 공간이 1개만 생성되기 때문에 항상 같은 값을 유지
		 */
		
		
	}

}
