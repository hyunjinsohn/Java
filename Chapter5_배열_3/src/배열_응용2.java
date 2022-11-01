import java.util.Arrays;

public class 배열_응용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 필요한 데이터를 배열에 대입
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 배열의 초기화
		System.out.println(Arrays.toString(arr));
		
		// 최대값, 최소값 구하기
		int max=arr[0];
		int min=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		// 데이터 가공
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
