import java.util.Arrays;

/*
 *  	1~100사이의 정수를 10개 저장 ==> 최대값, 최소값을 구하고 차를 출력 (최대값-최소값)
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 출력
		System.out.println(Arrays.toString(arr));
		// 최대값, 최소값
		// 최대값 => 가장 낮은 값 선택해서 추출
		int max=1; // arr[0]
		// 최소값 => 가장 큰 값 선택해서 추출
		int min=100; // arr[0]
		/*
		 * 	a=1, b=2, c=3, d=4, e=5;
		 * 	max=1;
		 * 	if(max<a)
		 * 	max=a;
		 * 
		 * 	if(max<b)
		 * 	max=b;
		 */
		for(int i:arr)
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				index=i;
				break;
			}
		}
		int index1=0;		// max랑 index 변수이름을 다르게 다시 설정해야함
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				index=i;	break;
						
			}
		}
		System.out.println("최대값:"+max+",저장 위치는 "+(index+1)+"입니다.");
		System.out.println("최소값:"+min+",저장 위치는 "+(index1+1)+"입니다.");
		System.out.println("최대값과 최소값의 차이:"+(max-min));
		
		// 최대값과 최소값의 위치를 구하라 (몇번째 있는지 인덱스번호 구하기)
		
	}

}
