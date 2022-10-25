//	12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int i=0;
		for(i=1;i<=30;i+=2);
		{
			if(i%2==0);
			{
				System.out.println("1~30까지의 정수 중 짝수:");
			}
		}
		*/
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%5d",i);	// 출력
				if(i%5==0)	  // 다음 줄에 출력
					System.out.println();
			}
		}
	}

}
