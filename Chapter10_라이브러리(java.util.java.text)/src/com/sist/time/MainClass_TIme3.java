package com.sist.time;
/*
 * 		Period / Duration 
 * 		------	 ---------
 * 	   날짜 차이	  시간 차이
 * 
 * 		LocalDate d1
 * 		LocalDate d2
 * 
 * 		Period p=d1-d2
 * 		
 * 		LocalTime t1;
 * 		LocalTime t2;
 * 		Duration d=t1-t2
 */
import java.time.*;
public class MainClass_TIme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 22);
		
		Period p=Period.between(date1, date2);
		System.out.println(p.getDays());
		// 0(같은 날) / 음수(이전) / 양수(이후)
	}

}























