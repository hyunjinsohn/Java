/*
 * 	교재 page 182
 * 
 * 	***배열 ==> 여러개의 변수를 하나로 묶어서 관리하는 역할
 *  ------> 일차배열, 다차원배열, 가변배열
 *          ------
 *  ***배열의 장단점
 *  	장점) 변수 여러개를 한개의 이름으로 제어 (반복문을 사용하기 쉽다)
 *  		 연속적으로 메모리 배치 (인덱스 번호를 이용해서 처리 가능)
 *  	단점) 고정적이다 ==> 가변형 (컬렉션 ==> 12장)
 *   		 같은 데이터형만 모아서 관리
 *           ----------
 * 
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=80, b=70, c=50, d=60, e=100;
		int max=0;
		// if문 => 5번 반복
		if(max<a)
			max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		// 출력 => 5번 반복
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("max="+max);
		*/
		
		//같은 데이터가 3개 이상 ==> 배열 이용 (int[] arr)
		
		
		int[] arr= {80,70,50,60,100};
		/*		arr    
		 * 		------                 ----------------------------------------------------
		 * 		100번지					   80        70        50         60        100
		 * 		------				   |---------|--------|----------|----------|----------
		 * 							  100		104		 108		112		   116
		 * 							 arr+0*4	   arr+1*4	arr+2*4	   arr+3*4	  arr+4*4
		 * 								arr[0]	   arr[1]	 arr[2]		arr[3]		arr[4]
		 * 								------		  ---
		 * 								배열명		메모리 위치(인덱스)
		 * 											----------------> 순차적으로 생성 ==> for문
		 * 								배열의 개수보다 1개 적음 (인덱스부번호는 0부터 시작)
		 * 								*** 주의점 : 인덱스 번호 초과시 에러 발생 !!!
		 * 							   
		 */
		int max=0;
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("max="+max);
	}

}
