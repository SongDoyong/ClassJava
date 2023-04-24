package com.sist.exception;

/*	
	예외를 수정하는 것은 아님 --> 에러 발생한 소스를 건너뛰는 것
	
	형식
	---
		try{
			<실행 문장1>
			<실행 문장2>
			<실행 문장3>
		}catch(예외처리 종류)
		{
			<실행 문장4>
		}
			<실행 문장5>
			<실행 문장6>

		---> 실행순서 (에러 없는 경우) : 1 -> 2 -> 3 -> 5 -> 6
		
		try{
			<실행 문장1>
			<실행 문장2>	==> 에러 발생
			<실행 문장3>
		}catch(예외처리 종류)
		{
			<실행 문장4>
		}
			<실행 문장5>
			<실행 문장6>

		---> 실행순서 (에러 발생) : 1 -> ( 2 -> 3 -> ) 4 -> 5 -> 6
		
			try안에서 에러 발생시에 에러난 위치부터 try끝까지 수행하지 않는다!
			=> catch로 이동 후, catch문장 수행

*/
public class _02_예외처리_복구2_형식
{
	public static void main(String[] args)
	{
		System.out.println("문장1");
		System.out.println("문장2");
		try {
		//System.out.println("문장3:" +(10/0));	// 에러 발생 --> 1,2 수행 후 비정상 종료 
		System.out.println("문장4");
		System.out.println("문장5");
		int[] arr=new int[2];
		arr[2]=100;
		System.out.println("문장6:" + arr[2]);
		System.out.println("문장7");
// 	예외와 예외처리하는 클래스를 매칭 (예측 필요)	
//	멀티 catch
		}catch(ArithmeticException e)			// 0으로 나누는 에러에 대해서만 처리	--> 어레이 범위 초과는 캐치 불가능
		{
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("문장 6 에러처리 완료");
		}
	}
}
