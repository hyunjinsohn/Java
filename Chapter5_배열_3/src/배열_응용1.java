import java.util.Arrays;

// 5개 점수를 저장한 다음, 총합과 평균을 구하시오. ==> 교재 p.196
// 응용 ==> 학생 3명의 국어, 영어, 수학 ==> 총점 / 평균 / 학점 구하고 등수 구하기 (응용)
// 숫자 야구 게임
public class 배열_응용1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];		// 선언
		for(int i=0;i<score.length;i++)		// 필요한 값을 저장
		{
			score[i]=(int)(Math.random()*71)+30;	// 30~100
			// 				0~79 ==> 30~100
		}
		System.out.println(Arrays.toString(score));
		// 총합 / 평균
		
		int total=0;		
		double avg=0.0;		// 초기화 시키기
		
		// 총합 ==> 
		for(int i:score)
		{
			total+=i;
		}
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",total/(double)score.length);
	}

}
