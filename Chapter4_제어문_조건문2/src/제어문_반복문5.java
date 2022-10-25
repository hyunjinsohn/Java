import java.util.Scanner;
public class 제어문_반복문5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.print("1. 메모장 , 2. 그림판 , 3. 브라우저 , 4. 종료:");
			int no=scan.nextInt();
			
			if(no<1 || no>4)
			{
				System.out.println("메뉴 선택이 잘못되었습니다.");
				continue;
			}
			switch(no)
			{
			case 1:
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
				break;
			case 2:
				Runtime.getRuntime().exec("c:\\Windows\\System32\\mspaint.exe");
				break;
			case 3:
				Runtime.getRuntime().exec("https://www.naver.com/");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);		// 0(정상종료) , -1(비정상종료)
			}
		}
	}

}
