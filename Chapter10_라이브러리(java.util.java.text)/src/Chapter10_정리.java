/*
 * 		날짜 / 시간 (10장)
 * 
 * 		***	Date		     ==> 저장용 (현재 시스템의 날짜, 시간을 읽어 온다) => 오라클 => 기능이 거의 X
 * 		***	Calendar		 ==> Date클래스 확장 => 제어가 쉽게 만들어 준 클래스(추상클래스)
 * 			--------
 * 			  생성 : Calendar cal=Calendar.getInstance()
 * 			  읽기 : cal.get(Calendar.YEAR)
 * 					cal.get(Calendar.MONTH)
 * 					cal.get(Calendar.DATE)
 * 					cal.get(Calendar.DAY_OF_WEEK)
 * 
 * 			  쓰기 : cal.set(Calendar.YEAR,2022)
 * 					cal.set(Calendar.MONTH,11-1)	// 0~11
 * 					cal.set(Calendar.DATE,22)
 * 				*** cal.getActualMaximum(Calendar.DATE) ==> 설정된 달의 마지막 날짜를 알아보는 방법
 * 	
 * 		***	SimpleDateFormat ==> 교재 p.544 (Date를 변환해서 출력)
 * 				년도: yyyy
 * 				월 : MM , M
 * 				일 : dd , d
 * 				시간 : hh
 * 				분 : mm
 * 				초 : ss , s
 * 
 * 		***	DecimalFormat 	 ==> 교재 p.541 => 1,000 => ###,###
 * 				DecimalFormat df=new DecimalFormat("#,###,###,###")
 * 				System.out.println(df.format(12345678)) ==> 12,345,678 => 쇼핑몰 상품 나열 , 예약 최종 금액
 * 
 * 			MessageFormat	 ==> 데이터베이스 : 출력 형식을 만듦
 * 				String pattern="{0},{1},{2},...";
 * 				Object[] obj={};
 * 				MessageFormat.format(pattern , obj)
 * 		***	LocalDate : 날짜
 * 				LocalDate.now() : 현재 날짜
 * 				LocalTime.of(년 , 월 , 일) : 날짜 지정해서 설정
 * 			LocalTime : 시간 
 * 				LocalTime.now()
 * 				LocalTime.of(시간 , 분 , 초) => 24시간
 * 		***	LocalDateTime : 날짜
 * 				LocalDate+LocalTime
 * 
 * 		==============> isAfter() , isBefore() , isEqual()
 * 		==============> between
 * 		
 */
public class Chapter10_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
