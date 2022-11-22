package com.sist.text;
/*
 * 		Format : 변환 
 * 		***	1) 숫자 변환 (오라클 => TO_CHAR() : DecimalFormat ==> 천단위에 ',' 붙여주기
 * 		***	2) 날짜 변환 : SimpleDateFormat : 원하는 스타일 변경 가능
 * 			3) 선택 변환 : ChoiceFormat (switch case 대신) -> 그냥 이런게 있구나 해라
 * 		***	4) 메세지 변환 (출력 형식) : MessageFormat : 복잡한 출력 형식이 있는 경우에 주로 사용
 * 			---------------------> java.text
 */
import java.text.*;
public class MainClass_Format1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 변환 ==> 오라클 (패턴 9,999,999) , 자바 (패턴 #,###,###)
		DecimalFormat df=new DecimalFormat("##,###,###");
		int value=220045600;
		System.out.println("￦"+df.format(value)+"원");
		System.out.println("=============== ChoiceFormat ================");
		double[] limit= {59,60,70,80,90};
		//  0~59 , 60~69 , 70~79 , 80~89 , 90~
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,80,85,90,45,67,78};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]+":"+cf.format(score[i]));
		}
	}

}
