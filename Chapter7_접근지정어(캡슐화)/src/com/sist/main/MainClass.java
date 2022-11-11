package com.sist.main;
import com.sist.manager.*;
import com.sist.vo.*;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager m=new MusicManager();
		MusicVO[] music=m.musicListData();
		for(MusicVO vo:music)
		{
			System.out.println(vo.getTitle());
		}
		System.out.println("-------------------------------------");
		Scanner scan=new Scanner(System.in);
		System.out.print("노래 선택(0~99):");		// 클릭
		int index=scan.nextInt();
		String key=m.musicDetailData(index);
		
		try
		{
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+"http://youtube.com/embed/"+key);
		}catch(Exception ex) {}
		
	}

}
