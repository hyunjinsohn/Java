//	16) 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

import java.util.Scanner;
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12) >> ");
		int month=scan.nextInt();
		
		/*if(month>=3 && month<=5)
			System.out.println("봄");
		else if(month>=6 && month<=8)									==> if문 ==> 범위가 정해져있을 떄
			System.out.println("여름");
		else if(month>=9 && month<=11)
			System.out.println("가을");
		else if(month==12 || month==1 || month==2)
			System.out.println("겨울");
			*/
		
		/*
		 * 	switch(문자 , 문자열 , 정수)
		 * {
		 * 		case '' , "" , 1:
		 * 			출력;
		 * 			break; 	
		 * 			default:	(생략가능)
		 * }
		 */
		
		// *** case 라벨: 라벨은 중복 사용 X 
		//						   실수 사용 X				=> 게임 , 메뉴 사용 多						
		/*switch(month)
		{
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");							==> switch문 (범위가 클 때는 안씀, 즉 웹에서는 잘안씀)
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
			default:
				System.out.println("가을");
		}
		*/
	}

}
