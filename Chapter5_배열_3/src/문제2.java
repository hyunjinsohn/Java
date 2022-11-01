import java.util.Arrays;

/*
 * 		2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)
 * 			1) 사번별 실적을 출력하시오.
 * 			사원(1) 50
 * 			2) 1월 실적의 총점과 평균을 출력하시오.
 * 			3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50,45,35,12,70};
		// 1) 실적 출력
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("사원("+(i+1)+")"+arr[i]);
		}
		
		// 2) 총점과 평균
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",total/(double)arr.length);
		
		System.out.println(" ");
		
		System.out.println("실적");
		
		// 3) 실적 최대값, 최소값
		int max=arr[0],sabun1=0;
		int min=arr[0],sabun2=0;		// 선언
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				sabun1=i;
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				sabun2=i;
				break;
			}
		}
		System.out.println("실적 가장 큰 사원("+(sabun1+1)+"):"+max);
		System.out.println("실적 가장 작은 사원("+(sabun2+1)+"):"+min);
		
		
		
		
		
	}

}
