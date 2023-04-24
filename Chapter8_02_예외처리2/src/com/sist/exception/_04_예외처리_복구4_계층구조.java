package com.sist.exception;

/*
		배열에 데이터를 저장 	=> 배열범위 에러
		나누기 처리			=> 0나누기 에러
		기타 예외처리			=> 통합처리		==> RuntimeException 
		


*/
public class _04_예외처리_복구4_계층구조
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=2;
			System.out.println(arr[0]/arr[1]);
		}  catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열범위 초과");
		} catch (ArithmeticException e)
		{
			System.out.println("0 나누기 금지");
		} catch (RuntimeException e)		// 계층구조가 높은 예외처리를 아래로 내려야 오류발생이 없음.
		{
			System.out.println("예측 못한 에러");
		}
		System.out.println("프로그램 종료");
	}
}
