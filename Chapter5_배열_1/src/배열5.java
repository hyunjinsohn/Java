/*
 * 		int[] arr=new int[15];
 * 	
 * 		for(int i=0;i<15;i++)
 * 		{
 * 
 * 		}
 * 			==> X (수정하기 어려움)
 * 			==> 배열의 개수를 읽어 온다 : length
 * 			==> arr.length
 * 
 */
public class 배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70,80,90};
		System.out.println("배열의 개수:"+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
