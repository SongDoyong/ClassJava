package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
	예외 떠맡기기, 예외 회피 ...
	
	==> 메소드 읽기 --> JVM에 이런 예외가 발생할 수 있음 (알려만 주는 것) --> 예외선언 --> 예외를 넘긴채 진행
	==> 메소드 호출시에 반드시! 직접처리 or 선언
	==> RuntimeException --> 생략 가능 (예외처리 하지 않아도 됨) 
	
		상위 클래스를 이용해서 전체 처리 가능 
			Throwable (Exeception / Error --> 모두 처리 가능)
				|
		-----------------------------
		|							|
	  Error						Exception
(프로그래머 영역x)						|
					Check							UnCheck
					-----------------------------------------
					|										|
				IOException							RuntimeException
				SQLException								|
				..									NumberFormatException / Array... 
				..									
				(순서 없음)

		==> Exception 하나만 넣으면, 거의 모든 예외처리가 가능하기 때문에, 다중catch등은 보통 사용되지 않음.
		
			ex)
				void method() throws RuntimeException
				void method() throws Exception								==> Check이므로, 반드시 예외처리
				void method() throws NumberFormatException, CLassCastException
				void method() throws IOException							==> Check이므로, 반드시 예외처리 
				void method() throws SQLException, NumberFormatException	==> Check이므로, 반드시 예외처리
				


*/
public class _10_예외처리_회피1_
{
	public static void methods() throws Exception
	{
		// 예외처리 대상
	}
	public static void method1() throws Exception	// 간접처리(JVM이 처리)ㅇ
	{
		methods();
	}
	public static void method2()
	{
		try
		{
			methods();
		} catch (Throwable e)	// 직접 예외처리를 할 경우, 예외처리 클래스는 예외처리할 문장의 범주와 같거나 커야함
		{
			// TODO: handle exception
		}
	}
	public static void method3() throws IOException, SQLException, ClassCastException
	{
		
	}
	public static void method4() throws IOException, SQLException, ClassCastException
	{
		method3();				// ==> method3은 Check 예외이므로, 반드시 처리를 해야함 --> 상위 클래스던가, 같던가
	}
	public static void method5() throws Exception
	{
		method3();
	}
	public static void main(String[] args)
	{
		
	}
}
