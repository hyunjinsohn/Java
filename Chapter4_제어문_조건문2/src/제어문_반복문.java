/*
 * 		**반복문  :  같은 형태 여러개인 경우에 사용하는 제어문
 * 					***= for  :  반복 횟수가 지정되어 있을 때
 * 							★형식	  1        2
 * 							 	for(초기값;조건식;증감식)		==> 화면 UI  ==> Front-end에 사용 빈도수 많음 
 * 								{
 * 									반복 수행 문장
 * 								}
 * 							for(;;)
 * 							while(true)
 * 					***= while  :  반복 횟수가 지정되어있지 않고 무제한인 경우 (데이터베이스)		==> Back-end에 사용 빈도수 많음
 * 							초기값				----- 1
 * 							★형식
 * 							while(조건식)	----- 2
 * 							{
 * 								수행문장
 * 								증감식
 * 							}
 * 						-------------------------------------------------------- 수행을 안할 수 있다
 * 						= do~while  :  한번 이상을 반드시 수행할 떄
 * 								초기값
 * 							★형식
 * 							  do
 * 								{
 * 									 실행문장 ==> 2
 * 									 	증가식 ==> 3
 * 								} while(조건식);
 * 	
 * 							조건 검색 ==> 선 조건, 후 조건
 * 							
 * 			교재 page156
 * 			for => 일반 for
 * 						forEach (웹에서 사용) => map / foreach / for of / for in
 * 						--------------------배열 / 컬렉션이 들어갔을 때
 * 
 * 			for 
 * 				1) 형식
 * 										false => for문 종료
 * 							   1  →   2        4
 * 					 for(초기값;조건식;증감식)
 * 					       				↓			↗
 * 								 반복수행문장 3
 * 					1부터 10번 수행
 * 
 * 					for(int i=1;i<=10;i++)
 * 					{
 * 						  반복문장
 * 					}
 * 					**100번 수행
 * 					for(int i=0;i<100;i++)
 * 					for(int i=1;i<=100;i++)
 * 
 * 					**A~Z까지 수행	
 * 					for(char c='A';c<='Z';c++)
 * 
 * 					**무한 루프 for(;;)
 * 
 * 					int[] arr={1,2,3,4,5,6,7}
 * 					for(int a:arr)
 * 				2) 동작 순서
 */
// 2 ~ 9까지 정수 입력을 받아서 해당 단을 출력하는 프로그램 => 9바퀴

public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=(int)(Math.random()*8)+2;	// 2 ~ 9
		System.out.println(dan+"단");
		for(int i=1;i<=9;i++)	// i++ , i+=2 , i+=3 ...
		{
			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*i);
			//System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}
