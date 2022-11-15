package com.sist.game;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

/*
 * 	  인터페이스의 장점
 * 		= 기능이 설정 (설계) : 개발 기간을 단축 할 수 있음
 * 		= 모든 개발자가 같은 메소드를 이용해서 구현 (표준화) => 라이브러리 (모든 개발자가 같은 형식으로 코딩)
 * 														   ----------------------- Spring(프레임워크)
 * 		= 서로 관계없는 클래스를 연결해서 사용 가능하게 만듦
 * 		= 독립적으로 사용 가능
 * 		= 다중 상속 가능하기 때문에 소스코딩이 간결해진다
 * 		= 단점은 인터페이스 메소드 선언 추가하면 => 연결되어있는 모든 클래스 에러 발생 => default 
 * 
 */
public class GameMain extends JFrame implements KeyListener,MouseListener,MouseMotionListener,Runnable {
	private GameView gv=new GameView();
	public GameMain()
	{
		add("Center",gv);
		setSize(1024, 900);
		setVisible(true);
		addKeyListener(this);
		gv.setFocusable(true);
		gv.addMouseListener(this);
		gv.addMouseMotionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void change()
	{
		for(int i=0;i<=8;i++)
		{
			try
			{
				gv.setImage("my_0"+i);
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this)
		{
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				new Thread(this).start();
				gv.x+=5;
				if(gv.x>1024)
					gv.x=0;
				repaint();
			}
			break;
			case KeyEvent.VK_LEFT:
			{
				gv.x-=5;
				if(gv.x<0)
					gv.x=1024;
				repaint();
			}
			break;
			case KeyEvent.VK_UP:
			{
				gv.y-=5;
				if(gv.y<0)
					gv.y=900;
				repaint();
			}
			break;
			case KeyEvent.VK_DOWN:
			{
				gv.y+=5;
				if(gv.y<1024)
					gv.y=1024;
				repaint();
			}
			break;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gv)
		{
			gv.x=e.getX();
			gv.y=e.getY();
			repaint();
			
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gv)
		{
			gv.x=e.getX();
			gv.y=e.getY();
			repaint();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<0;i++)
		{
			gv.setImage("my_0"+i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		gv.setImage("my_00");
	}
	
 
}
