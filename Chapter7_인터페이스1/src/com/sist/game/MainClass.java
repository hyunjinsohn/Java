package com.sist.game;
interface 동물{
	void eat();		// public abstract void eat();
	void run();
	default void aaa()
	{
		
	}
}
class 말 implements 동물 
{
	public void eat()
	{
		
	}
	public void run()
	{
		
	}
}
class 소 implements 동물
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
