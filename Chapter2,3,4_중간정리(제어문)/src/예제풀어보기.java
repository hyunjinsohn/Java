/*
 * 	1부터 10까지의 숫자 중 3의 배수의 합
 * 
 * 	2+4+6+....100까지의 정수의 합을 구하고 출력하라	
 * 
 */
public class 예제풀어보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%3==0)
//			{
//				sum+=i;
//			}
//		}
//		System.out.println("sum:"+sum);
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		
	}

}
