// 1 ~ 100까지 	==>		for(int i=1;i<=100;i++)		==>		총합, 짝수합, 홀수합
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0,even=0,odd=0;		// 합을 구할 때는 항상 0으로 초기화
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				{
				even+=i; 	// even=even+i
				System.out.printf("even=%d,i=%d\n",even,i);
				/*
				 * 		even=0
				 * 		even+=i;		==> i=2 , even=2
				 * 									 i=4 , even=6
				 * 									 i=6 , even=12
				 * 												.
				 * 												.
				 * 												.
				 * 											  even=2550
				 */
				}
			else
			{
				odd+=i;		// 누적
				System.out.printf("odd=%d,i=%d\n",odd,i);
			}
			total+=i;		// 총합 누적
		}
		System.out.println("1~100까지 총합:"+total);
		System.out.println("1~100까지 짝수 합:"+even);
		System.out.println("1~100까지 홀수 합:"+odd);
		System.out.println("======================");
		
		// 3의 배수(a3), 5의 배수(a5), 7의 배수(a7)의 합
		int a3=0, a5=0, a7=0;
		for(int i=1;i<=100;i++)
		{
			// 15, 21, 35 3의 배수, 5의 배수, 7의 배수가 겹치는 부분을 빼지 않게 하기 위해 if문 연달아쓰기. => else if를 쓰면 빼버리기 때문.
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
		}
		System.out.println("1~100까지 3의 배수 합:"+a3);
		System.out.println("1~100까지 5의 배수 합:"+a5);
		System.out.println("1~100까지 7의 배수 합:"+a7);
		
		
	}

}
