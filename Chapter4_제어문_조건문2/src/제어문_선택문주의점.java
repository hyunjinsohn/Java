/*
 * 		1. switch()
 * 						↑ 
 * 			정수 / 문자 / 문자열
 * 		2. 변수 선언
 * 			switch(no)
 * 			{
 * 				case 1:
 * 					{
 * 					int a=10;
 * 					}		// a는 사라진다
 * 					break;
 * 				case 2:
 * 					{
 * 					int a=20;								==> 오류 발생 코드
 * 					}		// a는 사라진다
 * 					break;
 * 				case 3:
 * 					{
 * 					int a=30;
 * 					}		// a는 사라진다
 * 					break;						
 * 			}
 * 
 * 			***{
 * 					어떤 위치던 블록은 설정 가능 (변수의 범위 설정)
 * 				  }
 */
public class 제어문_선택문주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=40; 	// main 전체에서 사용 	==> {} 안에서만 사용되는 변수 ==> 지역변수(블록변수)	: 반드시 초기화가 필요하다.
		if(true)
		{
			int a=10;
				if(true)
				{
					int b=20;
					if(true)
					{
						int c=30;
					}	// c
					int c=100; 	// c가 위에서 이미 닫혔으므로 c 새로 생성 가능
				}	// b
				int b=200;
		}	// a
		int a=300;
	}

}
