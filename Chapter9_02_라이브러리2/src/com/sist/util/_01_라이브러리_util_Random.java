package com.sist.util;

import java.util.Arrays;
import java.util.Random;

/*
	java.util : 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
		=> 반드시 import 사용
		
		1) Random : 난수 발생
		2) Date/Calendar : 날짜 / 시간
		3) StringTokenizer : 문자분리
		
		4) Collection (★★★★★★★★★★★★★★★★★★★★ 매우중요)
		
			1| List : 순서 존재 / 데이터의 중복을 허용			=> 데이터베이스
				-ArrayList
			2| Set : 순서 x / 데이터 중복 허용x				=> 장르
				-HashSet
			3| Map : 순서 x / 저장시 key, value 2가지 저장	=> 클래스 관리
				-HashMap
					
			Arrays => 배열을 제어하는 기능
			------ 	toString() 	: 배열 데이터 출력 
					sort()		: 정렬
					asList()	: 배열을 ArrayList로 변경
					
			Random => nextInt()		=> int범위
				   => nextInt(5) 	=> 0~4
				   => nextInt(101)	=> 0~100
				   => nextInt(100)+1 => 0~100

*/
public class _01_라이브러리_util_Random
{
	public static void main(String[] args)
	{
		Random r=new Random();	// 먼저, 클래스이기때문에, 생성을 한 뒤 사용 like Scanner
		int a=r.nextInt(100)+1;	// 0~100
		System.out.println(a);
		
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=r.nextInt(100)+1;
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(numbers));
		System.out.println("===== 정렬 후(ASC) =====");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("===== 정렬 후(DESC) =====");	// 내림차순 지원x 
		System.out.print("[ ");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println("]");
		
	}
}
