package com.sist.util;

import java.util.*;
public class _07_라이브러리_util_Calendar2_달력제작
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력: ");
		int year=scan.nextInt();
		System.out.println("월 입력: ");
		int month=scan.nextInt();
		System.out.println("일 입력: ");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);		// set을 써야 지정한 날짜로 나옴 
		cal.set(Calendar.MONTH, month-1);		// set을 안쓰면 오늘 날짜가 나옴	// !!월 등록때는 -1
		cal.set(Calendar.DATE, day);
		
		System.out.println("===========설정된 날짜============");
		System.out.println("년도: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));				// !!값 가져올 떄는 +1
		// 읽기시
		System.out.println("일: "+cal.get(Calendar.DATE));
		String[] week= {"", "일","월","화","수","목","금","토"};
		System.out.println("요일: "+week[cal.get(Calendar.DAY_OF_WEEK)]);	// week배열에서 처음의 공백""을 넣지 않으려면, -1 넣기
		
	}
}
