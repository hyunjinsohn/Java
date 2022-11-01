/*
 * 		초기화 (난수) => {값, ...}
 * 
 */
public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		   int[] arr=new int[5];
		   // arr[0] ~ arr[4] = 0
		   for(int i=0;i<5;i++)
		   {
			   arr[i]=(int)(Math.random()*100)+1;
		   }
		   // 값을 출력
		   // 향상된 for문 ==> 출력 전용 (forEach구문)
		   /*
		    * 	for (데이터형 변수: 배열명)	==> 데이터가 다 출력하면 자동으로 for문 종료
		    * 	     -----------
		    * 	실제 배열에 저장된 값을 읽어온다 (항상 같은 데이터형이나 큰 데이터형을 사용)
		    * 	int[] ==> int, long, double
		    * 	char[] ==> int, long, double, char
		    * 	double[] ==> double
		    * 	long[] ==> long, double
		    */
		   
		   for(int i:arr)
		   {
			   System.out.println(i+" ");
		   }
		   // forEach ==> 배열 / 컬렉션에서 많이 씀 ==> 화면 출력 ==> (웹에 화면 출력시에는 forEach)
		   
		   // 배열 변경 후에 다시 출력
		   	   System.out.println();
		   	  /*
		   	   arr[0]=arr[0]+1;
		   	  arr[1]=arr[1]+1;
		   	  arr[2]=arr[2]+1;
		   	  arr[3]=arr[3]+1;
		      arr[4]=arr[4]+1; 
		      */
		   	  for(int i=0;i<(i+1));
		   			  {
		   				  arr[i]=arr[i+1];
		   			  }
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	}

}
