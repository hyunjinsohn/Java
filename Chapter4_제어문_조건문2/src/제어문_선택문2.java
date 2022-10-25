import java.util.Scanner;

/*
 * 		12월, 1월, 2월 => 겨울
 * 		  3월, 4월, 5월 => 봄
 * 		  6월, 7월, 8월 => 여름
 * 	     9월, 10월, 11월 => 가을		교재 page 149
 * 		 ---------------
 */
public class 제어문_선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan=new Scanner(System.in);
	   System.out.print("현재 월을 입력하세요:");
	   int month=scan.nextInt();
	   switch(month)
	   {
	     case 12: case 1: case 2: 	// if(month==12 || month==1 || month==2)
		   System.out.println("겨울입니다.");
		   break;
	     case 3:
	     case 4:
	     case 5: 	// if(month==3 || month==4 || month==5)
	    	 System.out.println("봄입니다.");
	    	 break;
	     case 6: case 7: case 8:	// if(month==6 || month==7 || month==8)
	    	 System.out.println("여름입니다.");
	    	 break;
	     case 9: case 10: case 11:
	    	 System.out.println("가을입니다.");
	    	 break;
	    default:
	    	System.out.println("잘못된 입력입니다.");
	   }
	}

}
