package com.sist.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// mvnrepository.com  => spring 
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
// 어노테이션 ==> 구분자
public class MusicVO {
	@Getter
	@Setter
	private int mno;
	@Getter
	@Setter
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;
	
}
