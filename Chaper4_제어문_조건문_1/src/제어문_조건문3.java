// 2개 정수, 1개 연산자를 받아서 4칙연산 처리 ==> if 4개
import java.util.Scanner;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 첫번째 정수
			System.out.print("첫번째 정수 입력:");
			int num1=scan.nextInt();
		// 두번째 정수
			System.out.print("두번째 정수 입력:");
			int num2=scan.nextInt();
		// 연산자
			System.out.print("연잔자 입력(+, -, *, /):");
		    char op=scan.next().charAt(0);
		    
		    if(op=='+')
		    	System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		    if(op=='-')
		    	System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		    if(op=='*')
		    	System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		    // 중첩 조건문
		    // if안에 if를 다시 주는 것
		    /*	if()
		    	{
		    		if()
		    		{
		    			
		    		}
		    	}
		    	*/
		    if(op=='/')
		    {
		    	if(num2==0)
		    		System.out.println("0으로 나눌 수 없습니다.");  // 오류 처리
		    	else
		    		System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
		    }
		    	
	}

}
