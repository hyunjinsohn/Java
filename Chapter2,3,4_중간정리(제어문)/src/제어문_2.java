/*
 * 	메뉴
 */
import java.util.Scanner;
public class 제어문_2 {
		/*
		 * 	if()	== false
		 * 	{
		 * 		1번 문장
		 * 	}
		 *  ----------------------
		 * 	if()	== false
		 * 	{
		 * 		2번 문장
		 * 	}
		 *  else	== 실행 
		 *  {
		 *  	3번 문장
		 *  }
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======== 메뉴 ========");
		System.out.println("1. Home");
		System.out.println("2. 회원가입");
		System.out.println("3. 커뮤니티");
		System.out.println("4. 추천&예약");
		System.out.println("5. 마이페이지");
		System.out.println("6. 종료");
		System.out.println("=====================");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴선택:");
		int menu=scan.nextInt();
		if(menu>=1 && menu<=6)
		{
		if(menu==1)
			System.out.println("Home으로 이동합니다.");
		else if(menu==2)
			System.out.println("회원가입으로 이동합니다.");
		else if(menu==3)
			System.out.println("게시판으로 이동합니다.");
		else if(menu==4)
			System.out.println("추천&예약화면으로 이동합니다.");
		else if(menu==5)
			System.out.println("마이페이지로 이동합니다.");
		else
		{
			System.out.println("종료합니다.");
			System.exit(0);
		}
		}
		else
		{
			System.out.println("존재하지 않는 메뉴입니다.");
		}
		// 1. 경우의 수 (결과값 몇개) 
		// 2. 해당 조건  => 사용자를 유도 
		
	}

}
