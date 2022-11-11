/*	교재 p.335
 * 		
 * 		1) 패키지(package)
 * 			클래스의 묶음 (관련된 클래스를 그룹단위로 묶어서 관리)
 * 			폴더.폴더...
 * 		2) 패키지를 사용하는 목적 : 찾기 , 다른 클래스에서 불러서 사용하기 편하게 작업
 * 		3) 패키지 단위로 라이브러리 제작 가능 ==> .jar(재사용)
 * 			데이터형 클래스(변수 모아놓은) => ~VO  ==> MovieVO
 * 											  MovieManager
 * 		4) 패키지 선언
 * 		    자바 소스 구조
 * 			-package 선언 ==> 한번만 사용 가능
 * 			-import 설정 ==> 없는 경우 O
 * 					    ==> 여러개 사용 가능
 * 			-public class ClassName{
 * 				-------------------
 * 				 멤버변수 설정
 * 				 = 인스턴스 변수
 * 				 = 공유변수 (static변수)
 * 				-------------------
 * 				 생성자
 * 				-------------------
 * 				 메소드
 * 				-------------------
 * 				==> 클래스 따로 제작
 * 			}
 * 
 * 
 * 
 * 
 * 
 * 
 * 		관련된 클래스를 묶어서 한개의 폴더 안에 저장 관리
 * 		자바에서 지원하는 패키지
 * 		-----------------
 * 		 java.util
 *       java.io
 *       java.net
 *       java.sql
 *       javax		==> jdk1.2
 *       javax.xml
 *       javax.servlet ===> 웹
 *       -------------
 *       
 *       (예) 
 *       	 웹
 *       	 게시판
 *       	 예매
 *       	 추천
 *       	 회원
 *       	 어드민
 *       	 데이터형 ================> import를 사용
 *       -----------------------------------------
 *       폴더명(패키지) com/org => 회사명 => 기능
 *       게시판
 *       	com.sist.board
 *       			 -----
 *       	com.sist.reserve
 *       			 -------
 *          com.sist.recommand
 *          com.sist.member
 *          com.sist.admin
 *          
 *          com.sist.board
 *           => Board
 *           public class Board
 *           {
 *           	int bno;
 *           	String name;
 *           	String subject;
 *           	String content;
 *              ...
 *              ...
 *           }
 *           com.sist.member
 *            => Member
 *            => 사용 불가능
 *            public class Member
 *            {
 *            	 int mno;
 *            	 String name;
 *            }
 */
public class 패키지1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
