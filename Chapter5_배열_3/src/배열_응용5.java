import java.util.Arrays;

/*
 * 		
 * 
 */
public class 배열_응용5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬 대상
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 출력
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("정렬 후:");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
