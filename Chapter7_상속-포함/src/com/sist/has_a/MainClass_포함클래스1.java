package com.sist.has_a;
class Board
{
	public void insert()
	{System.out.println("Board:insert Call ... : 게시물 첨부");
	}
	public void list()
	{
		System.out.println("Board:List Call ... : 게시물 목록 출력");
	}
	public void update()
	{
		System.out.println("Board:update Call ... : 게시물 수정");
		
	}
}
class ReplyBoard
{
	/*public void insert()
	{System.out.println("ReplyBoard:insert Call ... : 게시물 첨부");
	}
	public void list()
	{
		System.out.println("ReplyBoard:List Call ... : 게시물 목록 출력");
	}
	public void update()
	{
		System.out.println("ReplyBoard:update Call ... : 게시물 수정");
	}
	*/
	Board board=new Board() 	// 포함클래스
	{
		public void update()
		{
			System.out.println("ReplyBoard:update Call ... : 게시물 수정");
		}
	};	// extends 없이 오버라이딩 가능 ==> 익명의 클래스
	public void reply()
	{
		System.out.println("ReplayBoard:replay Call ... : 댓글올리기");
	}
	// 재사용
	// 변경해서 사용 (상속), 있는 그대로 사용(포함) ***
}
public class MainClass_포함클래스1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplyBoard rb=new ReplyBoard();
		rb.board.list();
		rb.board.insert();
		rb.board.update();
		rb.reply();
	}

}
