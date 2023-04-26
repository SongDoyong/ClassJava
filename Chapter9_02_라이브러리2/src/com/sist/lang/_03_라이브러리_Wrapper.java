package com.sist.lang;

import java.util.ArrayList;
import java.util.List;

/*
	Wrapper : 전체를 감싼다
	------- CSS 
	프로그램 개발 => 기본형 데이터형을 객체단위로 저장할 때 사용
	
	List<int> 		-> 오류
	List<Integer>	-> 기본형의 클래스화 (Wrapper)
	
		1) 종류
			   기본형		   클래스형
			1| int		=> Integer
			2| long		=> Long
			3| byte		=> Byte
			4| double	=> Double
			5| boolean	=> Boolean
			
		2) 사용처
			=> 문자열을 원하는 데이터형으로 변경할 때, 주로 사용
			=> 모든 데이터형이 문자열로 이루어져있으므로, 이를 기본형 데이터로 바꿔서 처리하도록 만든 클래스
			
		3) 사용법
			클래스명.parse기본형
			Integer.parseInt(String s)
			Long.parseLong()
			Double.parseDouble()
			Boolean.parseBoolean()...
			
		4) 오토박싱 / 언박싱
			오토박싱
			기본 클래스를 생성할 때, 사용하는 방법 --> Interger i = new Integer(10); 
			기본형처럼 사용하는 오토박싱		   --> Integer i=10;  /   String s=" ";
				=> 클래스에 해당 데이터값 설정
			언박싱
			기본형에 클래스 객체를 설정 			--> int aa=i; 
			 	=> 기본형에 클래스형이 호환 (언박싱)
			
		5) 사용이유(목적)
			1| 문자열을 해당 데이터형으로 변환하기 위해서
				문자열 -> 정수형 / 문자열 -> 실수형 / 문자열 -> 논리형
			2| 객체 단위 저장의 필요성 (자료구조 Collection)


*/
public class _03_라이브러리_Wrapper
{
	public static void main(String[] args)
	{
		String s="4.3";
	//	double d=(double)s;	--> 오류
		double d=Double.parseDouble(s);		// 문자열을 double로 변경
		String s1="13";
		int i=Integer.parseInt(s1);
		System.out.println(i);
		
		Integer ii=100;
		int a=ii;
		System.out.println(ii);
		System.out.println(a);
		
		List<Integer> list = new ArrayList<Integer>();
			
		
	}
}
