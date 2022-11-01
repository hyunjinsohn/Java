/*
 * 		배열 생성, 초기화, for
 * 		데이터값 제어 : 일반 for, 데이터 출력 : forEach
 * 					------- back 	   -------- front
 * 
 * 		1) 데이터 저장
 * 		2) 연산자, 제어문
 * 		3) 결과값 출력
 * 
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳을 저장 ==> 출력 26개 ==> 변수가 다양하므로 for문은 힘듦
		
		char[] alpha=new char[26];	// '\u0000' 로 초기화된 것임
		
		/*
		 * 	new => 메모리 저장공간 확보
		 * 	int => 0
		 *  long => 0L
		 *  float => 0.0F
		 *  double => 0.0
		 *  char => '\u0000'
		 *  boolean => false
		 */
		// 배열에 값을 대입
		// 배열 => 인덱스를 이용한다 => int(0)
		char c='A';
		for(int i=0;i<alpha.length;i++)	// 배열 범위 초과 시, 에러 발생 ==> 에러 방지를 위해서 length 쓰기
		{
			alpha[i]=c++;
		}
		// 출력
		for(char ch:alpha)	// 배열(고정) , 컬렉션(가변)만 사용 가능
		{
			System.out.print(ch+" ");
		}
	}

}
