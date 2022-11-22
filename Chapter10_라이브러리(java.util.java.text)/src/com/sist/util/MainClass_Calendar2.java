package com.sist.util;
import java.util.*;		// Scanner , Calendar
public class MainClass_Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2022 11 22):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		// 요일 출력
		Calendar cal=Calendar.getInstance();	// Calendar클래스 생성 (추상클래스)
		cal.set(Calendar.YEAR, year);	// 년도 설정 ==> 설정이 없는 경우 (오늘 날짜)
		cal.set(Calendar.MONTH, month-1);	// 갖고 올 때는 +1이지만 set할 때는 -1
		cal.set(Calendar.DATE, day);
		
		int set_year=cal.get(Calendar.YEAR);
		int set_month=cal.get(Calendar.MONTH)+1;
		int set_day=cal.get(Calendar.DATE);
		int set_week=cal.get(Calendar.DAY_OF_WEEK);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		// 설정된 날짜 출력
		System.out.printf("%d년도 %d월 %d일 %s요일\n",set_year,set_month,set_day,strWeek[set_week]);
	}

}
