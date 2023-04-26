package com.sist.util;

import java.text.SimpleDateFormat;

/*
		    Date 
		  1) 시스템의 현재 시간 / 날짜 읽어오는 클래스
		  2) 단점 : 기능 빈약 ==> 날짜만 저장하는 클래스 (오라클의 데이터형과 호환)
		 	  |
		 	 보완 => Calendar
		  3) SimpleDateFormat (java.text) --> 원하는 스타일로 날짜 변경
		  4) 사용처 : 웹에서 등록일 설정할 때



*/ 

import java.util.*;
public class _05_라이브러리_util_Date
{
	public static void main(String[] args)
	{
		Date date=new Date();
		System.out.println(date);		// 그냥 날짜만 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
// 		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");	--> 형식은 자유롭게 바꿀 수 있음
		
		System.out.println(sdf.format(date)); 				// SimpleDateFormat을 활용하여, 가독성이 좋은 형태로 바꿀 수 있음
		/*
		
		년도	: yyyy(2023), yyy(023)
		월	: MM(01), M(1)
		일	: dd(01), d(1)
		시간	: hh, h
		분	: mm, m
		초	: ss, s
		
		Date => 호환, 날짜만 저장하는 기능 / 오라클과 호환됨	=> DATE
		
		*/	
	}
}
