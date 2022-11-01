import java.util.Arrays;

/*
 * 		1. 선언
 * 			알파벳 대문자 전체를 저장 ==> 선언 ==> 시작과 동시에 메모리를 확보
 * 			char[] alpha=new char[26]; ==> ' '
 * 			정수를 10개 저장
 * 			int[] arr=new int[10]; ==> 0
 * 			실수를 10개 저장
 * 			double[] arr=new double[10]; ==> 0.0
 * 			true/false => 10개 저장 ==> 빈공백
 * 			boolean[] seat=new boolean[100] ==> false
 * 			---------		   ------------ 메모리 저장 개수 지정 ==> 자동 초기화
 * 		2. 초기화 
 * 			1) 명시적인 초기화
 * 				정수 5개 저장 
 * 				int[] arr={10,20,30,40,50};
 * 				int[] arr=new int[5];
 * 				arr[0]=10;
 * 				arr[1]=20;
 * 			2) 난수	==> 로또
 * 				int[] arr=new int[5];
 * 				arr[0]=(int)(Math.random()*100)
 * 				.
 * 				.
 * 				.
 * 			3) 입력값
 * 				int[] arr=new int[3];
 * 				arr[0]=scan.nextInt()
 * 				.
 * 				.
 * 				.
 * 			4) 웹에 데이터 읽기	: Jsoup ==> 예외처리, String
 * 		3. 출력
 * 			일반 for ==> 데이터 변경이 가능 (인덱스 번호 이용해서 변경)
 * 			for(int i=0;i<갯수;i++)
 * 			{	
 * 				앞에서부터 ~~
 * 			}
 * 			for(int i=개수-1;i>=0;i--)
 * 			{
 * 				뒤에서부터 ~~ ==> 거꾸로 출력, 이진법
 * 			}
 * 			forEach(향상된 for) ==> jdk1.5이상에서 실행 ==> read only(읽기 전용) 
 * 			==> 값을 읽을 때 0번부터 읽기 시작 
 * 			데이터형[] arr=new 데이터형[10];
 * 			------
 * 				=
 * 				------
 * 			for(데이터형 변수명:배열명)	: 출력용으로 주로 사용
 * 			{			    ----- 배열명 ==> 실제 저장된 데이터를 읽어온다
 * 				
 * 			}
 * 		4. 배열 개수
 * 			배열명.length
 * 		--------------------- 관련된 데이터
 * 
 * 		교재 p.211까지만 공부해도 충분 ㅎ_ㅎ
 * 
 */
public class 배열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char[] alpha={'A','B',...}
		char[] alpha=new char[26];
		// 초기화
		char c='A';
		for(int i=0;i<alpha.length;i++) // 배열 => 반드시 인덱스를 이용하게
		{
			alpha[i]=c;
			c++;
		}
		// 출력
		for(char ch:alpha) // 데이터 변경이 불가능(배열에 저장된 데이터)
		{
			//ch=(char)(ch+32)
			System.out.println(ch);
		}
		// 값을 소문자로 변경
		System.out.println();
		// 배열에 있는 데이터를 변경 => 인덱스
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)(alpha[i]+32);
		}
		
		/*
		 * 	char c='A';
		 * 	c='a'
		 * 
		 * System.out.println(alpha[0]);
		 * 
		 * 	 배열에 있는 실제 데이터값 변경 => 인덱스를 이용한다 => for은 일반 for
		 *   배열에 있는 실제 데이터값만 읽는다 => for은 forEach (실제 데이터 변경이 불가능) readonly
		 *   예외) 클래스는 값 변경 가능
		 * 
		 */
		
		System.out.println();
		// 정수 30개 저장 (0,1,2)
		int[] arr=new int[30];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*3);
		}
	System.out.println(Arrays.toString(arr));	
	
	int a=0, b=0, d=0;
	for(int i:arr)
	{
		if(i==0) a++;
		else if(i==1) b++;
		else if(i==2) d++;
	}
	System.out.println("0=>"+a);
	System.out.println("1=>"+b);
	System.out.println("2=>"+d);		// ==> 빈도수 구하는 법 (통계)
	
	// 교재 p191 참고!! 
	
										
	}

}
