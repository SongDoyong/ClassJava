package com.sist.exception;


import java.util.*;

// 사용자 정의 ==> Exception을 상속 받아서 사용
class MyException extends Exception
{
	public MyException(String message)
	{
		super(message);
	}
}

public class _13_예외처리_사용자정의
{	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int input = scan.nextInt();
		try
		{
			if(input%2==0)
			{
				throw new MyException("짝수입니다!");	// 사용자 정의는 반드시 예외를 임의로 발생해야함
			}
		} catch (MyException e)
		{
			System.out.println(e.getMessage());
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
