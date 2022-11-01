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
		int[] arr=new int[5];
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()+100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		double avg=0;
		
		
	}

}
