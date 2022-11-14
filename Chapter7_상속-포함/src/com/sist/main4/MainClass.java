// 문제 6번
package com.sist.main4;
/*
 * 		A a=new B();
 * 		A a=new C();
 * 
 * 		B b=new D();
 * 		B b=new E();
 * 		B b=new B();
 * 		------------
 * 
 * 		C c=new F();
 */
class A
{
	
}
class B extends A
{
	public void display()
	{
		System.out.println("B:display() Call...");
	}
}
class C extends A
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
}
class D extends B
{
	public void display()
	{
		System.out.println("D:display() Call...");
	}
	// 메소드 추가
	public void ddd()
	{
		System.out.println("D:ddd() Call...");
	}
	
}
class E extends B
{
	public void display()
	{
		System.out.println("E:display() Call...");
	}
}
class F extends C
{
	public void display()
	{
		System.out.println("F:display() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new D();
//		B b1=new E();
//		B b2=new B();
//	 	B b3=(B)new A();	// 생성자가 일치 하지 못함 
//		A a=new B();
//		B b3=(B)a;
		
		B b1=new D();  // 오버라이딩 된 메소드만 접근 가능
		// display()
		b1.display();  // D가 가지고 있는 메소드 호출
		// b1접근 불가능
		// b1.ddd();
		D d=new D();
		// ddd() , display()
		d.display();
		// d 접근 가능
		d.ddd();
		D d1=(D)b1;
		// ddd(0,display())
		d1.display();
		// d1 접근 가능
		d1.ddd();
		new D().display();	// 객체가 필요 없는 경우
		// 접근 가능
		new D().ddd();
		
	}

}
