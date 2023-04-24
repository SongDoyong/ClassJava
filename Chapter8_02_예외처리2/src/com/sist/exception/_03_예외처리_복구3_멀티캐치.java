package com.sist.exception;

/*
	문자열로 2개의 정수를 받아서, 정수로 변환한 후에		==> NumberFormatException 예상
	배열에 저장 후,								==> ArrayIndexOutOfBoundsException 예상
	나누기 한 값을 구한다.							==> AritmeticException 예상


*/

import java.util.*;
public class _03_예외처리_복구3_멀티캐치
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수:");
		String num1=scan.next();
		System.out.println("두 번째 정수:");
		String num2=scan.next();
		
		int[] arr=new int[2];
		// 다중 catch문 ==> 예상되는 에러가 많은 경우 
		// catch절은 한 개 수행 (3개를 동시에 수행하지 않음) ==> Like 다중 조건문
		try
		{
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			arr[0]=n1;
			arr[1]=n2;
			System.out.println(arr[0]/arr[1]);
//			double div=(double)arr[0]/arr[1];
//			System.out.printf("%.2f\n",div);
		} catch (NumberFormatException e)
		{
			System.out.println("정수변환 에러 발생!!");
		}catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("배열 범위 초과 에러 발생!!");
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다!!");
		}
		System.out.println("프로그램 종료!!");	// 출력된다면, 정상종료
	}
}
