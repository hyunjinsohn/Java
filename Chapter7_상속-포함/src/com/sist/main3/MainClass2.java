package com.sist.main3;
/*
 * 	 super : 상위클래스의 객체 , this : 자신의 객체
 * 		=> 생성자 , 인스턴스메서드에서 사용이 가능 (static메소드에서는 사용 X)
 * 	 super() : 상위클래스의 생성자 , this() : 자신의 생성자를 호출 시에 사용
 * 	 --------------------------------
 * 		생성자에서만 사용 가능
 * 		=> 꼭 !! 첫 줄에 사용해야됨  / this와 super는 같이 쓸 수 없는 존재임
 * 
 * 		class A
 * 		{
 * 			int a,b,c;  ==> super
 * 			public A(){}
 * 			public A(int a, int b){this.a=a;this.b=b;}
 * 			public A(int a, int b, int c){}
 * 		}
 * 		class B
 * 		{
 * 			int a,b,c;  ==> this
 * 			public B()
 * 			{
 * 				super(); ==> public A(){}
 * 				super(10,20); ==> public A(int a, int b)
 * 				super(10,20,30); ==> publicA(int a, int b, int c){}
 * 				super를 사용하지 않는 경우에는 자동으로 super()	==> 교재 p.332
 * 			}
 * 			public B(int a)
 * 			{
 * 			//	this();
 * 				super(100,200);		// A => a=100, b=200, c=0
 * 			}
 * 			// 자신 외에 상위클래스의 변수, 메소드 제어도 가능함
 * 			   --	  -------
 * 			   this    super
 * 				=> super는 가끔
 * 				=> this는 자주 나옴
 * 			
 * 			
 * 		}
 */
class F
{
	int a,b,c;
	public F()
	{
		this.a=10;	// 지역변수 => 멤버변수
//		a=10;		// 충돌이 없는 상태면 this. 생략 가능 => 지역변수 / 매개변수가 우선 순위임
		b=20;
		c=30;
	}
	public F(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	public F(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
}

// =========================================================

class G extends F
{
	int a,b,c;
	public G()
	{
		a=100;
		b=200;
		c=300;
	}
	public G(int a, int b, int c)
	{
		super(a,b,c);		// 매개변수를 호출하지 않으면 default값임 ==> super() 자동 호출
		this.a=a;										//		------- 상위클래스 생성자를 super()라고 함
		this.b=b;
		this.c=c;
	}
	public void print()
	{
		System.out.println("this.a="+this.a);	// G 클래스가 가지고 있는 a,b,c 라는 변수
		System.out.println("this.b="+this.b);
		System.out.println("this.c="+this.c);
		
		System.out.println("super.a="+super.a);	// F 클래스가 가지고 있는 a,b,c 라는 변수
		System.out.println("super.b="+super.b);
		System.out.println("super.c="+super.c);
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		G g=new G(1000,2000,3000);	// F f=new F();
//		g.print();
		
		Object obj=new Object();
		A a=new A();	// A, Object
		B b=new B();	// B, Object
		
		if(a instanceof Object)
			System.out.println(true);
		
		if(b instanceof Object)
			System.out.println(true);
		
		if(b instanceof A)
			System.out.println(true);
		
		if(b instanceof B)
			System.out.println(true);
		
		if(a instanceof B)
			System.out.println(false);  // 미수행
		
//		String s="";
//		if(s instanceof StringBuffer)
		
		// A는 Object다
		// B는 Object다
		// B는 A다  
		
		// A는 B다 => 인간은 남자다. => 축소 되어서 얘는 false => 미수행
		/*
		 *   동물(Object)
		 *    |
		 *   인간 (A)
		 *    |		  |
		 *   남자 (B)  여자
		 *   
		 */
		
			
	}

}
