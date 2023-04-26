package com.sist.util;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
		네트워크
		
		String s="red|green|blue|black|yellow";
			=> split / StringTokenizer 
				StringTokenizer st=new StringTokenizer(s,"|");	=> 일반 문자열
				---------------------------------------------
				String[] colors=s.split("\\|");					=> 정규식이라 \\|로 처리
						=> 원형 : split(String regex)	-> regex : regularExpression (정규식) 
						
			cf) 클래스를 확인할 때, regex인지 str인지 확인하면서 할 것

			cursor시작
			---------------------
			->	before First
			---------------------
					red		=> nextToken()
			---------------------
					green	=> nextToken()
			---------------------	
					blue	=> nextToken()
			---------------------
					black	=> nextToken()
			---------------------
					yellow	=> nextToken()
			---------------------
				after Last	=> nextToken() => false(읽기 종료)
			---------------------

			**갯수 초과시 오류 --> hasMoreTokens 사용할 것



*/
public class _04_라이브러리_util_StringTokenizer2
{
	String s="red|green|blue|black|yellow";
	String[] colors=s.split("\\|");
	StringTokenizer st=new StringTokenizer(s,"|");
	public static void main(String[] args)
	{

		String s="red|green|blue|black|yellow";
		String[] colors=s.split("\\|");
		StringTokenizer st=new StringTokenizer(s,"|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());		// --> NoSuchElementException 토큰갯수 초과 오류
		
	}
	
}
