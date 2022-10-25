// 1 ~ 10까지 짝수만 출력하라
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)	// 2로 나눠서 나머지가 0이면 2의 배수이기 때문에
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=2;i<=10;i+=2)	// 초기값(어디서부터) , 조건식(어디까지) , 증감식(몇씩 증가할것이냐)
		{
			System.out.println(i+" ");
		}
	}

}
