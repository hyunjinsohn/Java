// 8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)

/*
 * 		for(초기값; 범위;증가값)
 * 				  2	  100    2
 * 		==> 합을 구해서 출력하는 변수
 * 
 * 		1. 루프변수	==> i , j		
 * 		2. 누적변수	==> sum	==> sum+=i	==> 0으로 초기화	==> 구매할 때 금액 계산 / 성적 계산 등	==> sum(hit)
 * 		3. 프레그변수 ==> flag		==> 111111 2222 111111 2222 111 2222
 */

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int total=0,even=0;
		
		for(int i=2;i<=100;i+=2)
		{
			if(i%2==0)
				{
				even+=i; 	
				System.out.printf("even=%d,i=%d\n",even,i);
				}
			System.out.println("1~100까지 짝수 합:");
		}
		*/
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		
	}

}
