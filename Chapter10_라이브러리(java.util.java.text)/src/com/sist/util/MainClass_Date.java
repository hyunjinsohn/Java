package com.sist.util;
// Date : 시스템의 현재 날짜 / 시간을 읽어 온다 ===> 오라클 데이터형과 연결 (DATE)
// Date클래스의 단점 : 기능이 빈약함 => 보완 (Calendar) => Date는 날짜 저장용으로 많이 사용함
import java.util.*;
import java.text.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
		Date date=new Date();	// SimpleDateFormat
		/*
		 * 		Format => 변환
		 * 		-------------
		 * 		년도 : yyyy (대소문자 구분)
		 * 		월 : MM , M (대소문자 구분 , 대문자) ==> MM (1~9) ==> 01 02 03 ...  M ==> 1 2 3 ... 
		 * 		일 : dd , d (소문자)
		 * 		-----------------------------------------------------------> 실제 날짜를 계산 할 때는 dd, MM => d, M
		 * 				01 , 02 , 03 , 04 , 05 , 06 , 07 , 08, 09
		 * 												  -------- (오류) => 8진법이어서 08부터는 오류남 / 출력할 때는 상관 X , BUT 계산할 때는 오류
		 * 		시간 : hh , h (소문자) 
		 * 		분 : mm , m (대소문자 구분 , 소문자) => 오라클에서는 MI
		 * 		초 : ss , s
		 */
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년도/M월/d일 hh시:m분:s초");
		while(true)
		{
			Date date1 =new Date();
			String today=sdf.format(date1);	// 스케줄러
			System.out.println(today);
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}
	}
		}
}
