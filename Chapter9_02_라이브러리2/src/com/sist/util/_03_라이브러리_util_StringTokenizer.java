package com.sist.util;

/*
	StringTokenizer : 문자열 분리
	1) split()의 대체 클래스
	2) 빅데이터 / 네트워크 / 웹
	----------------------
		기능
		=> 생성자 (오버로딩 상태)
			StringTokenizer st=new StringTokenizer("구분할 문자열", 구분자);
			StringTokenizer st=new StringTokenizer("구분할 문자열"); => 구분자가 없다면, 공백을 기준으로 자름
			
				ex) String s1="애니메이션/어드벤처/코미디";
					String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
					
					StringTokenizer st=new StringTokenizer(s1, "/");
					StringTokenizer st=new StringTokenizer(s2);
			
			1) countToekns() : 분리된 데이터 갯수 확인
			2) nextToken()	 : 분리된 데이터 읽기
			3) hasMoreTokens() : 분리된 갯수만큼 루프 수행 (while문 활용)
					
*/
import java.util.*;
public class _03_라이브러리_util_StringTokenizer
{
	public static void main(String[] args)
	{
//		String s1="애니메이션/어드벤처/코미디";
//		StringTokenizer st=new StringTokenizer(s1, "/");
//		System.out.println(st.countTokens());			// 분리된 데이터 갯수 확인 .countTokens()
//		
//		for(int i=0;i<st.countTokens();i++)
//		{
//			System.out.println(st.nextToken());			// 앞에서부터 순서대로 잘린 데이터 읽기
//		}
		
		
		String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 ";
		StringTokenizer st=new StringTokenizer(s2);
		while(st.hasMoreTokens()) 					// hasMoreTokens --> 자른 갯수만큼
		{
			System.out.println(st.nextToken()); 	
		}
		
//		System.out.println(st.countTokens());
//		int a=st.countTokens();
//		for(int i=0;i<a;i++)
//		{
//			System.out.println(st.nextToken());
//		}
	}
	
}
