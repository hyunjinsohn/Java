/*
 * 		switch()
 * 		{
 * 			case 1: 
 * 				switch()
 * 				{
 * 				}
 * 		}
 */
import java.util.Scanner;
public class 제어문_선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		// 컴퓨터 (난수 발생)
		int com=(int)(Math.random()*3);  // 0~2  ==> 0.0*3~0.99*3 ==> 0~ 2.999 => 근데 random이라 소수점 지워져서 0~2
		/*String[] res= {"가위","바위","보"};
		System.out.println("컴퓨터:"+res[com]);
		System.out.println("사용자:"+res[user]]);
		*/
		switch(com)
		{
		case 0:
			System.out.println("컴퓨터:가위");
			break;
		case 1:
			System.out.println("컴퓨터:바위");
			break;
		case 2:
			System.out.println("컴퓨터:보");
			break;
			}
		
		switch(user)
		{
		case 0:
			System.out.println("사용자:가위");
			break;
		case 1:
			System.out.println("사용자:바위");
			break;
		case 2:
			System.out.println("사용자:보");
			break;
			}
		
		// 결과값 출력
		switch(com)
		{
		case 0:		//가위
			switch(user)
			{
			case 0:	
				System.out.println("Draw!");
			case 1:	// 바위
				System.out.println("사용자 Win!");
			case 2:	// 보
				System.out.println("컴퓨터 Win!");
			}
			break;
		
		case 1: //바위
			switch(user)
			{
			case 0:		//가위
				switch(user)
				{
				case 0:	
					System.out.println("컴퓨터 Win!");
				case 1:	// 바위
					System.out.println("Draw!");
				case 2:	// 보
					System.out.println("사용자 Win!");
				}
		
			case 2: // 보
			switch(com)
			{
				case 0:	 // 가위
					System.out.println("사용자 Win!");
				case 1:	// 바위
					System.out.println("컴퓨터 Win!");
				case 2:	// 보
					System.out.println("Draw!");
				}
		}
	}


