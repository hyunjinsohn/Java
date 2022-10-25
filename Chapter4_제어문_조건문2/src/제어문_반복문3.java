// updown 게임 만들기
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;		// 1~100
		
		for(;;)		// 무한 루프 while(true)
		{
			System.out.println("1~100까지 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다.");
				// 처음부터 다시 실행한다
				continue;	// 증가식으로 돌아간다
			}
			
			if(com>user)
			{
				System.out.println("입력값보다 큰 수를 입력하세요.");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 작은 수를 입력하세요.");
			}
			else
			{
				System.out.println("Game over!");
				System.exit(0);
			}
		}
	}

}
