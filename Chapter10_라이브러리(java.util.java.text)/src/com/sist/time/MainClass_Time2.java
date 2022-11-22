package com.sist.time;
import java.time.*;
// 비교 => compareTo() => 같으면 0 , 이전 음수 , 이후 양수
// 2022 11 20 - 2022 11 18 ==> 2
// isAfter() , isBefore() , isEqual() ==> boolean 
// 기간 , ~동안 ...
import java.util.*;

public class MainClass_Time2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년 월 일 입력(2022 11 22):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(year, month, day);
		/*
		int result=date2.compareTo(date1);
		System.out.println("result="+result);
		if(result==0)
			System.out.println("마감일 입니다.");
		else if(result<0)		// 음수
			System.out.println("아직 이벤트 기간입니다..");
		else if(result>0)		// 양수
			System.out.println("기간이 지났습니다.");
		*/
		
		// 이벤트 기간 , 특가
		if(date2.isAfter(date1))
			System.out.println("기간이 지났습니다.");
		else if(date2.isBefore(date1))
			System.out.println("아직 이벤트 기간입니다.");
		else if(date2.isEqual(date1))
			System.out.println("마감일 입니다.");
	}

}
