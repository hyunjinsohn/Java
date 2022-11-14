package com.sist.main;
class Super2
{
	int a=10;
	int b=20;
	public void display()
	{
		System.out.println("Super:display() Call...");
	}
	// 상속 안됨 => 생성자 , 초기화블록 , static(상속이 아니라 공유가 안됨)
	// 상속은 됨. 단, 접근 불가 => private (==> getter/setter 해야됨)
}
class Sub2 extends Super2 
{
	int c=300;
	public Sub2()
	{
		a=100;
		b=200;
	}
	/*
	 * 	==> 메모리 상에만 저장이 됨 => 메모리가 상속 내린 클래스 , 상속 받은 클래슨 => 따로 생성 됨
	 *  ==> 단일 상속만 적용됨
	 *  ==> 상위클래스가 하위클래스보다 데이터형은 더 크다
	 *  ==> 상위클래스가 하위클래스보다 메모리 공간이 크다
	 *  (예)
	 *  		class A
	 *  		{
	 *  			int a,b;
	 *  		}
	 *  		class B extends A
	 *  		{
	 *  			int a,b;	// => 상속받음
	 *  			int c;
	 *  		}
	 *  
	 *  		A a=new A();	a.a , a.b
	 *  	 ***B b=new B();	b.a , b.b , b.c
	 *  	 ***A c=new B();	c.a , c.b , c.c  ==> 오류 (접근 불가)
	 *  									--- 접근 X  => 상위클래스로 메모리 할당 시에는 상위클래스가 갖고 있는 변수만 접근 가능
	 *  		=> 인터페이스나 추상클래스에서 등장
	 *  		   --------------- 미완성 클래스 => 완성해서 사용
	 *  	 ***B d=(B)new A();	 ==> 오류 (형변환의 오류발생) ==> 하위클래스 b가 갖고 있는 변수에 접근 가능
	 *  		=> 라이브러리클래스에서 주로 사용 多 !!!
	 *  
	 *  		A>B => 범위를 따짐 => 어느 클래스가 공통점을 많이 가지고 있는 지에 따라 크기 결정
	 * 
	 * 			B b=new B();
	 * 			int		int
	 * 			A c=new B();
	 * 			double	int
	 * 			B d=n(B)new A(); ==> 오류
	 * 			int  double ==> X
	 * 			int a=(int)10.5;
	 * 			--------------------
	 * 	int a;
		int b;
		public void display()
		{
			System.out.println("Super:display() Call...");
		}
	 */
}
public class MainClass_상속2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 하위클래스
		Sub2 sub=new Sub2();	// Sub2 => a,b,c	메소드 => Sub2
		System.out.println("sub.a="+sub.a);
		System.out.println("sub.b="+sub.b);
		System.out.println("sub.c="+sub.c);
		// 상위클래스
		Super2 sup=new Sub2();		// 생성자를 하위클래스껄로 사용해도됨 (Sub2)	/  Super2 => a,b,   메소드 => Sub2
		System.out.println("sup.a="+sup.a);
		System.out.println("sup.b="+sup.b);
		//System.out.println("sup.c="+sup.c);	==> c 값은 Super2 클래스에 존재하지 않으므로 오류 발생
		
		Super2 sup2=new Sub2();		// a,b,c ==> ClassCastException
		Sub2 sub2=(Sub2)sup2;
		System.out.println("sub2.a="+sub2.a);
		System.out.println("sub2.b="+sub2.b);
		System.out.println("sub2.c="+sub2.c);
		
		// 변수는 클래스형 / 메소드는 생성자타입 따라감
	}

}
