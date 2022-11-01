import java.util.Arrays;

/*
 * 		1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하고 
 * 			1) 아래와 같이 출력하시오.
				1번 학생 : 100점  
				2번 학생 : 90점  
				3번 학생 : 85점  
	
			2) 학생들의 총점을 출력하시오.
			
			
			1. 배열 저장
				데이터형[] 배열명
				------ 클래스도 가능 (클래스도 변수의 일종 : 사용자 정의)
			2. 배열 데이터 출력 
			3. 배열에 있는 데이터 가공
 * 
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {100,90,85};	
		int[] i=new int[3];
		
		
		int total=0;		
		double avg=0.0;		
		
		// 총합 ==> 
		for(int r:score)
		{
			total+=r;
		}
		System.out.println("총합:"+total);
	}

}
