package com.sist.exception;

/*
		임의발생 : 테스트 목적
		------------------ 배포 전 확인 작업
		형식)
			throw new 예외처리생성자()



*/
public class _11_예외처리_임의발생
{
	public static void main(String[] args)
	{
//		try
//		{
//			Thread.sleep(10);
//		} catch (InterruptedException e)
//		{
//			// InterruptedException < Exception < Throwable 
//		}
//		try
//		{
//			Thread.sleep(10);
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			int a=10;
			if(a%2==0)
			{
				System.out.println("임의로 예외 발생!!");
				throw new NumberFormatException("정수 변환이 안됨");
				// throw --> 사용자 정의 예외처리에서 사용됨
				// getMessage변경 --> 생성자의 매개변수를 이용
				/* class NumberFormatException extends Exception
					{
						private String message="default문자열 --> For input string: " 10"";
						public NumberFormatException()
						{
						}
						public NumberFormatException(String message)
						{
							this.message=message
						}
						getter/setter 존재
					}
					
				*/
				//Integer.parseInt(" 10");	// --> default 문자열: For input string: " 10"
				
			}
		} catch (ClassCastException e)
		{
			System.out.println(e.getMessage());	
		} catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException "+e.getMessage());	
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());	
		}
		
	}
}
