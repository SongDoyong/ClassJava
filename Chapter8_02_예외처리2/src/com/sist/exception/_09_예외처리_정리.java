package com.sist.exception;

/*
	
		형식)
			method() throws 예외처리클래스, 예외처리클래스 ... (순서가 없다)
					-------------------	선언
			=> method()를 호출하는 프로그래머가 예외처리 후에 사용
				-> 예외 떠맡기기 
				  1) 예외 떠맡기기
				  2) try~catch로 처리 가능
				  3) 라이브러리 --> 사용자에게 떠맡긴다.
			ex)
			1	void method() throws ArrayIndexOutOfBoundsException,
									 NumberFormatException
				void 예외처리() throws ArrayIndexOutOfBoundsException,
									 NumberFormatException
				{
					method();
				}
			2	void 예외처리()
				{
					try
					{
					}catch(ArrayIndexOutOfBoundsException e)
					{
					}catch(NumberFormatException e2)
				}
			3	void 예외처리()
				{
					method();
				}
	예외처리
	=> 직접처리 : 프로그래머가 직접 처리
				--> 예외에 대한 복구 가능 (catch절에서)
				try ~ catch ~ finally
	=> 간접처리 : JVM에서 처리
				--> 예외를 복구할 수 없음 (건너뛰기)
				throws (에러발생을 알려만 줌)
	=> 사용자 정의 예외처리 : 지원하지 않기 때문에 직접 예외처리 제작
						  --> 거의 없음 (if문을 사용하는 것이 더 좋음)
			ex)
				class MyException extends Exception
				{
				}
					==> 자동 호출시에 자바는 자바에서 만든 예외처리만 호출된다.
						--> 임의로 발생해서 찾는다 (throw) 




*/
public class _09_예외처리_정리
{
	public static void method() throws ArrayIndexOutOfBoundsException,
										NumberFormatException
	{
		
	}
	public static void execute() throws ArrayIndexOutOfBoundsException,
	NumberFormatException
	{
		method();
	}
	public static void execute2()
	{
		try
		{
			method();
		} catch (ArrayIndexOutOfBoundsException e)
		{
			
		} catch (NumberFormatException e)
		{
			
		}
		
	}
	public static void execute3()
	{
		try
		{
			method();
		} catch (RuntimeException e)
		{
			
		} 
		
	}
	public static void execute4()
	{
		try
		{
			method();
		} catch (Exception e)
		{
			
		} 
		
	}
	public static void execute5()
	{
		try
		{
			method();
		} catch (Throwable e)
		{
			
		} 
		
	}
	public static void main(String[] args)
	{
		method(); 	// -->  실행시 에러이기 때문에, 예외처리를 생략할 수 있음.
	}
}
