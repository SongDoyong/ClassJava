package com.sist.util;
/*
		Calendar : Date클래스를 보완해서 새롭게 만든 클래스
			1) 생성
				Calendar cal=Calendar.getInstance();
				-------	추상 클래스 					cf) 인터페이스가 아닌 이유? 인터페이스는 메소드 정의가 불가능 but! getInstance()라는 메소드 있음
			2) 날짜 설정 				=> set()
			3) 날짜,요일 읽기 			=> get()
			4) 각 달의 마지막 날 읽기 	=> getActualMaximum()

*/

import java.util.*;
public class _06_라이브러리_util_Calendar1
{
	public static void main(String[] args)
	{
		List list=new ArrayList();
		Calendar cal=Calendar.getInstance();	// --> 오늘 날짜 가져오기
		// 필요시에는 오버라이딩(재정의)하여 사용
		// new를 사용하지 않는 경우? 추상클래스 / 인터페이스
		//	추상클래스 => 기능을 가지고 있음 (구현된 메소드와 구현이 안된 메소드 둘 다 가능)
		//	인터페이스 => 기능을 가질 수 없음 (구현이 안된 메소드만 가능 --> 선언만 가능)
		//		구분 예시) List list=new ArrayList(); ==> 인터페이스 (뒤에 하위클래스가 나온 경우)
		
		System.out.println("년도: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));	// 월의 경우, 0번부터 시작  ->  +1 해주기
		System.out.println("일: "+cal.get(Calendar.DATE));
		System.out.println("시: "+cal.get(Calendar.HOUR));
		System.out.println("분: "+cal.get(Calendar.MINUTE));
		System.out.println("초: "+cal.get(Calendar.SECOND));
		System.out.println("이 달의 마지막 날: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String[] week= {"", "일","월","화","수","목","금","토"};		// week는 1~7로 계산하기 때문에, 앞의 한 칸(인덱스 0번)을 비워둬야함
		System.out.println("요일: "+week[cal.get(Calendar.DAY_OF_WEEK)]);	// cal.get(Calendar.DAY_OF_WEEK)는 1~7을 리턴
		
		
		
	}
}
