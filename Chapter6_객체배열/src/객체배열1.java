/*
 * 		주의점
 * 		한개의 파일(java) => class를 여러개 사용 가능
 * 		** 1. 자바는 항상 => 클래스명과 저장명이 동일
 * 		class A => A.java
 * 		여러개가 있는 경우
 * 		-------------
 * 		class A
 * 		class B
 * 		-------------> A.java, B.java
 * 		class A
 * 		public class B
 * 		-------------> B.java
 * 		** 2. 한 파일 안에서 public class는 한번 사용 가능
 * 		** 3. 가급적이면 한 파일에 class 한 개씩 사용 권장
 * 		** 4. 주의점 : Student.java => 다른 파일에서는 Student를 사용할 수 없음 (같은 src폴더 상에서)
 */
class Student
{
	String name;
	int kor,eng,math;
}
public class 객체배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student(); // hong(주소) ==> name(=null), kor=0, eng=0, math=0
		Student lee=new Student(); // lee(주소) ==> name(=null), kor=0, eng=0, math=0
		Student park=new Student(); // park(주소) ==> name(=null), kor=0, eng=0, math=0 
		// ==> 객체 생성시마다 메모리 따로 만들어지는 변수 (인스턴스변수)
		// 1. 변수에 값 대입
		hong.name="홍길동";
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		
		lee.name="이순신";
		lee.kor=80;
		lee.eng=80;
		lee.math=90;
		
		park.name="박문수";
		park.kor=88;
		park.eng=90;
		park.math=78;
		
		// 출력 / 제어 => 객체배열
		Student[] std={hong,lee,park};
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i].name+" "
							  +std[i].kor+" "
					          +std[i].eng+" "
							  +std[i].math+" "
							  +(std[i].kor+std[i].eng+std[i].math)+" "
							  +(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
		

	}

}
