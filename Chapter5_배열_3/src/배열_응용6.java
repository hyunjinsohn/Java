import java.util.Arrays;

/*
 * 		버블 정렬
 * 
 * 		20 30 10 50 40 
 *      -- --
 *      20 30 
 *         -- --
 *         10 30
 *            -- --
 *            30 50
 *            	 -- --
 *               40 50
 *      ----------------- 1 round (for문 1회 실행) 1-4
 *      20 10 30 40 50
 *      -- --
 *      10 20
 *         -- --
 *         20 30
 *            -- --
 *            30 40
 *      ------------------ 2 round (for문 2회 실행) 1-3
 *      10 20 30 40 50
 *      -- --
 *      10 20
 *         -- --
 *         20 30
 *      ------------------ 3 round (for문 3회 실행) 2-2
 *      10 20 30 40 50
 *      -- --
 *      10 20
 *      ------------------ 4 round (for 4회 실행) 3-1
 *      
 *      i+j=4
 *      j=4-i
 */
public class 배열_응용6 {

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
				
		// 버블 정렬 시작
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
							arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
	}

}
