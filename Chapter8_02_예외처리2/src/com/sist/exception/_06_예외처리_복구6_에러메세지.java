package com.sist.exception;

/*
	예외발생시 메세지 확인 --> 자바 지원
		
		getMessage() ==> 에러에 대한 메세지만 전송
		------------> 에러에 대한 숙달 필요 (찾아내기 어려움)
		printStackTrace() ==> 실행하는 과정 -> 어디서 에러가 발생했는지 확인



*/
public class _06_예외처리_복구6_에러메세지
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr=new int[100];
			arr[100]=100;
		} catch (ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.err.println(e.getMessage()); 		// 권장사항 err --> 빨간색으로 출력
		}
	}
}
