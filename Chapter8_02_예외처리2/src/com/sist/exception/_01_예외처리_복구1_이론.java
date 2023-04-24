package com.sist.exception;

/*
 	267page	=> try~catch(예외복구)
 	
 	try: 정상 실행하는 코딩
 	catch: 예외가 발생했을 때 처리하는 부분 (여러개 사용이 가능 => 순서, 계층구조 존재)
 	---------------------------------------------------------------------
 	예외처리 => 소스 상에서 수정이 가능한 에러 (가벼운 에러)
 	------ 목적: 사전에 에러를 방지하는 프로그램
 				비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 						계층구조
 						-----
 						Object : 모든 클래스의 상위 클래스 (모든 클래스는 object 상속을 받고 있음)
 						  |
 						Throwable : 에러의 최상위 클래스
 							|
 		-----------------------------------------
 		|										|
 	  Error									Exception
 	  -----									---------
 	처리 불가능								=> 0으로 나누는 경우
 	=> 메모리 부족								=> 정수변환의 문제
 	=> 윈도우 충돌								=> 현변환, 파일명이 틀린 경우
											=> Web에서 URL/IP 틀린 경우
											=> 객체가 null일 때, 주소에 접근하는 경우
											
											
					Exception: 예외처리의 최상위 클래스
					---------
					|
				1) CheckedException	: 컴파일시에 예외처리를 했는지 여부 확인
										반드시 예외처리를 해야 함
				2) UncheckedException : 컴파일시에 예외처리를 확인하지 않음
										필요시에만 예외처리
										
							Exception
								|
		------------------------------------------------------
		1. CheckedException
				|
			1) IOException : 파일 입출력, 메모리 입출력, 네트워크 입출력
				(java.io)
			2) SQLException: 오라클 연결(오라클이 인식하는 언어)
				JDBC -> DBCP -> ORM (MyBatis, JPA)
				Web에서 핵심(데이터베이스 연동)
				(java.sql)
			3) MalformedURLException : IP / Web URL
				(java.net)
			4) ClassNotFoundException : 클래스 이름으로 메모리 할당 => 클래스명, 패키지명이 틀린 경우
				=> Wrapper: 기본형을 사용하기 쉽게 클래스형으로 제작
							boolean => Boolean
							int 	=> Integer
							double	=> Double
						Integer.parseInt(" 10");	=>	윈도우 / Web (문자열만 사용)
							웹에서 전송된 데이터를 받는 경우
							-------------------------
								String getParameter() => 상수
							Jsoup -> 데이터수집(String)
			5) ArrayIndexOutOfBoundsException : 배열범위 초과
				--------------------------- 컬렉션
			6) ArithmeticException : 0으로 나눌 경우 발생
			7) NullPointerException : 객체나 배열에 주소가 없는 경우 
				A a; --> null, int[] arr; --> null
			8) ClassCastException : 클래스 형변환이 잘못된 경우 
			
			
		예외처리의 기본
		try ~ catch
		형식)
			try
			{
				<정상수행이 가능한 문장>
			}catch(예외처리 종류 설정)
			{
				<수행과정에서 오류발생시 처리되는 부분>
			}
			
			try ~ catch => 소스 전체 처리 => 종료
						   -----------
						   	부분 처리	==> 제외
				
				
				
				
				
				
				
				
				
				
				
				
				

-

*/
public class _01_예외처리_복구1_이론
{
	public static void main(String[] args)
	{
		//try												예외가 발생하자마자 for문이 중단됨
		//{
		
			for(int i=1;i<=10;i++)
			{
				try {										// for 문을 전부 수행하면서 예외처리
				int j=(int)(Math.random()*3);	// 0,1,2
				int k=i/j;
				System.out.println("i="+i+", k="+k);
				}catch(Exception ex) {
					System.out.println("0으로 나눌 수 없다");
					
				}
				
			}
		//}catch(Exception ex)	
		//{
		//}
	}
}
