package com.sist.exception;

/*
	finally	=> 생략 가능
			=> try 수행, catch 수행과 관계없이 무조건 수행되는 문장
			=> 파일 닫기, 오라클 연결 해제, 서버 연결 해제 ... 

		try
		{
			<정상수행이 가능한 문장>
			--> 예상하지 못한 에러가 발생할 수 있음 
				ex) 프로그래머의 실수, 사용자의 입력값 오류
		}catch(예상되는 예외클래스)
		{
			<에러가 발생시에 처리>
			--> 에러 확인
			--> 복구를 할 수 있다 --> 오류 메세지도 정송 가능
		}
		finally
		{
			<무조건 수행하는 문장>
			ex) 파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결 .. 
		}
		
		실행순서
		------
		문장 1
		문장 2
		try
		{
			문장 3
			문장 4
			문장 5
		}catch(예외처리 클래스1)
		{
			문장 6
		}catch(예외처리 클래스2)
		{
			문장 7
		}catch(예외처리 클래스3)
		{
			문장 8
		}
		finally
		{
			문장 9
		}
		문장 10
		문장 11
	
	경우 1) try가 정상 수행			: 1 -> 2 -> 3 -> 4 -> 5 ===> 9 -> 10 -> 11
		2) 문장 4에서 에러(1번 에러)	: 1 -> 2 -> 3 -> ===> 6	===> 9 -> 10 -> 11
		3) 문장 5에서 에러(2번 에러)	: 1 -> 2 -> 3 -> 4 => 7 ===> 9 -> 10 -> 11
		 	==> 목적: 에러 발생시, 에러를 제외하고 나머지 문장을 수행하기 위해	
		

*/
public class _05_예외처리_복구5_finally
{
	public static void main(String[] args)
	{
		try {
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
			System.out.println(arr[0]/arr[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e)		// 멀티 블록: 예외처리에서 or 줄 때, | 1개만 + 클래스명 1번만
		{																		// 다중 catch: 여러 번 catch 주기 --> 한 개만 실행됨
			System.out.println("에러발생");
		}
		System.out.println("프로그램 종료!!");
	}
	
}
