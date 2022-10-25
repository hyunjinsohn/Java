/*
 * 		자바
 * 		------ 변수 / 연산자 / 제어문
 * 
 * 		제어문
 * 		------ 조건문 (교재 page 136)
 * 			1) 프로그램은 코딩 순서로 순차적으로 수행
 * 			2) 필요 시에는 건너뛰고, 같은 문장일 경우에는 반복해서 수행	=> 제어 (제어문)
 * 			   ---------------- 조건문
 * 								------------------------- 반복문 (반복해서 제어)
 * 			3) 제어문 종류
 * 				1)) 조건문
 * 					= 단일 조건문
 * 					  형식) 
 * 						   if(조건)	조건에 필요한 연산자 (true/false) => 부정연산자(!), 비교연산자(==,!=,<,>,<=,>=)
 * 																	논리연산자(&&, ||)
 * 							{
 *								조건이 true일 때만 수행하는 문장 							
 * 							}
 * 					  ==> 독립적인 문장
 * 					  ==> 오류 체크 (코테)
 * 						  문자열을 입력 받아서 좌우 대칭인지 여부 확인
 * 						  점수를 입력받아서 총점, 평균
 * 						  kor ==> if(kor>=0 && kor<=100) ==> 처리가 여려운 부분이 있음(예외처리 => 8장)
 * 						  ==> 항상 견고한 프로그램
 * 					  ==> 글자수가 짝수
 * 					  	  String msg="";
 * 						  if(msg.length()%2==0)
 * 						  {
 * 
 * 						  }
 * 					
 * 					= 선택 조건문	(가장 많이 사용)	=> 삼항연산자
 * 						형식)
 * 						   if(조건)
 * 							{
 * 								조건이 true일 때 수행하는 문장
 * 							}
 * 							else
 * 							{
 * 								조건이 false일 때 수행하는 문장
 * 							}
 * 					
 * 					= 다중 조건문
 * 					 
 */
// 사용자로부터 정수를 받아서 홀수 / 짝수 확인
import java.util.Scanner;	// 여러개 사용이 가능
// 라이브러리 + 사용자 정의 => 다른 폴더에 있는 경우 
// 												--------- java에선 패키지라고 함 (폴더명.폴더명.클래스명)
// 두개의 폴더가 있음 => java(jdk1.0~) / javax(jdk1.2~)   : 	  웹, XML, JSON, ... 
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	// new (클래스를 메모리에 저장) , System.int (키보드 입력값)
		System.out.println("정수 입력:");
		int num=scan.nextInt(); // 정수값 가지고 오기 : nextInt(), 문자열 : next(), 실수 : nextDouble(), 논리 : nextBoolean
		if(num%2==0)
			System.out.println(num+"는(은) 짝수입니다!!");
		if(num%2!=0)
			System.out.println(num+"는(은) 홀수입니다!!");
	}

}
