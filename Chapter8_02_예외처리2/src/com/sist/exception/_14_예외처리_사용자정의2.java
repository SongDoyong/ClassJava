package com.sist.exception;


import java.util.*;

/*
		클래스 자신의 객체 호출 this // 생성자 this()
	상위 클래스의 객체 호출 super // 생성자 super()
	
	class A
	{
	
	}
	class B extends A
	{
	
	}
	
	B b=new B(); ==> new A() , new B()
					 -------   -------
					 super		this
					--------------------
						-----A-----
						   super
						-----------
					--------------------
						-----B-----
						    this
						-----------
					--------------------
	

*/
class MyRuntimeException extends RuntimeException
{
	public MyRuntimeException(String msg)
	{
		super(msg); 				// RuntimeException에 대한 생성자 super
	}
}

public class _14_예외처리_사용자정의2
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("정수입력: ");
			int input=scan.nextInt();
			if(input < 0)
			{
				throw new MyRuntimeException("음수는 사용할 수 없다.");
				// 장점: 에러 위치 확인 가능
				// 사용자 정의 클래스를 호출할 때 사용
			}
			System.out.println(input +"점 입니다.");
		} catch (MyRuntimeException e)
		{
			System.out.println(e.getMessage());
			System.out.println("-------------에러 발생 위치 확인-------------");
			e.printStackTrace();
			
		}
	}
}
