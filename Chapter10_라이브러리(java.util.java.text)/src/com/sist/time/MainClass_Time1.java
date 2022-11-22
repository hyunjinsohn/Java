package com.sist.time;
// Date , Calendar 에서 처리가 아니되는 기능 => 보완
/*
 * 		오라클 => 날짜 저장 => Date
 * 		MYSQL => 날짜 => LocalDateTime
 * 
 * 		LocalDate
 * 	  +	LocalTime
 * 		------------- 
 * 		LocalDateTime
 */
import java.time.*;
public class MainClass_Time1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 날짜 (시스템)
		LocalDate date=LocalDate.now();
		System.out.println(date);
		// 현재 시간 (시스템)
		LocalTime time=LocalTime.now();
		System.out.println(time);
		// 현재 날짜 & 시간 동시에 읽을 때
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		// of => static = 날짜 설정
		date=LocalDate.of(2022, 12, 1);		// 날짜 설정 ==> 생년월일 , 예약일 등록 , ...
		System.out.println(date);
		// 24
		time=LocalTime.of(15, 30,45);
		System.out.println(time);
	}

}
