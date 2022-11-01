/*
 * 
 * 
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ~ Z ==> for, while
		//char c='A';
		System.out.println("===== for문 =====");
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		
		System.out.println("===== while문 =====");
		// c='Z'+1
		//c='A';
		char c1='A';
		while(c1<='Z')
		{
			System.out.print(c1+" ");
			c1++;
		}
		// c1='['
		System.out.println();
		System.out.println("======= do ~ while =======");
		c1='A';
		do
		{
			System.out.print(c1+" ");
			c1++;
		} while(c1<='Z');
		
	}

}
