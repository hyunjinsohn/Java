// 	13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//				==> 짝수일 때 빼고, 홀수일 때 더해주는중
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=10;i++)
		{
			
		}
		*/
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(" 1-2+3-4+5-6+7-8+9-10:"+sum);

	}

}
