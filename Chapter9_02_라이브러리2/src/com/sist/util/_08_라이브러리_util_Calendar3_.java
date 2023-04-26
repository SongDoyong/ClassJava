package com.sist.util;


import java.text.SimpleDateFormat;
import java.util.*;
public class _08_라이브러리_util_Calendar3_
{	
	public static void log()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("mm분 ss초");
		long start=System.currentTimeMillis();	// for문 1000만 바퀴에 걸리는 시간 측정해보기
		Date date1=new Date(start);
		System.out.println(sdf.format(date1));
		for(int i=0;i<300;i++)
		{
				try
				{
					Thread.sleep(10);
				}catch(Exception e)
				{
					
				}
		}
		long end=System.currentTimeMillis();
		long res= end-start;
		System.out.println(res); 					// 계산에 얼마나 걸렸나 확인 3초 (1/1000초 단위)
		Date date2=new Date(end);
		System.out.println(sdf.format(date2));
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		long a=System.currentTimeMillis();		// 시스템의 시간은 long형으로 읽어옴 --> Date로 읽을 수 있음
		Date date=new Date(a);
		System.out.println(date);
		
		log();
	}
}
