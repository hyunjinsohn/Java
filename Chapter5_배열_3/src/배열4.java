import java.util.Arrays;

/*
 * 	O, X ==> 10개 저장 (난수)
 * 
 * 	1. 데이터 저장 : 변수, 배열
 * 	2. 초기화
 * 	3. 제어 (사용자 요청) ===>
 * 	4. 제어 결과값 출력 ===>
 * 
 * 	데이터 저장 == 데이터 가공 == 출력 (도스, 브라우저, 모바일)
 * 				  |
 * 				메소드화
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char[] munjae=new char[10];
	char[] user=new char[10];
	
	for(int i=0;i<munjae.length;i++)
	{
		int a=(int)(Math.random()*2);
		if(a==0)
			munjae[i]='O';
		else
			munjae[i]='X';
	}
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<user.length;i++)
	{
		System.out.print((i+1)+"번째 O,X 입력:");
		char answer=scan.next().charAt(0);
		if(!(answer=='O' || answer=='X'))
		{
			System.out.println("잘못된 입력입니다.");
			i--;
			continue;	// 증가식으로 올라간다
		}
		user[i]=answer;
	}
	System.out.println(Arrays.toString(munjae));
	System.out.println(Arrays.toString(user));
	// 확인
	int count=0;
	for(int i=0;i<user.length;i++)
	{
		if(munjae[i]==user[i])
			count++;
	}
	System.out.println("정답:"+count+"개입니다.");
	}

}
