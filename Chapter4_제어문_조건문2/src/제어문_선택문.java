/*
 * 		90~100점이면 A
 * 		80~89점까지 	B
 *		70~78 까지 		C
 *		60~69까지 		D
 *		59 ~   		   		F
 *      ----------------
 *      
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 정수(국어, 영어, 수학) 입력받아서 출력
		// 평균, 학점 구하기
		Scanner scan=new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수 입력(80 80 80):");
		int kor=scan.nextInt();	// => 값을 입력받아서 정수값을 대입한다. 라는 뜻의 scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		// 총점
		int total=kor+eng+math;
		//평균
		double avg=total/3.0;
		//학점
		char score='A';
		switch((int)(avg/10))		// int로 바꿔주는 이유는, 문자, 문자열, 정수 밖에 못들어가기 때문. 실수 (double)은 들어갈 수 없다. 
		{
		// if(avg==10 || avg==9)
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.1f\n",avg);
		System.out.println("학점:"+score);
		
		
		
	}

}
