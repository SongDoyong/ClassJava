package com.sist.lang;

/*
		StringBuffer
		------------
		1. String은 고정형 -> 변경(문자열 결합)되면, 새로운 메모리 생성
							=> 원본은 그대로 유지
					ex) String s="Hello Java";	기존값은 메모리에 유지
						s.substring(0,5) --> "Hello" 새로운 메모리 형성
						s=s.substring(0,5); -> 변경하려면 새로 값 저장
							=> 변경시에 리턴형이 String
		
		2. String 보완 --> 가변형 String --> StringBuffer(비동기), StringBuilder(동기)
	
			cf) 동기 : 한 개씩 수행 
				비동기 : 동시에 여러 개 수행
				
			cf) 네트워크 : 클라이언트(요청) / 서버(응답)
						=> 오라클 (자바 (요청 -> SQL) / 오라클 서버)
						=> 웹 (클라이언트 / 서버)
						 	   브라우저	------ JSP/Spring
		
		3. 데이터가 많은 경우 => 문자열 결합 (append)
		4. 문자열 처리에 사용하는 클래스
		5. 처리 속도가 빠름 
		6. 주요 메소드
			length() : 문자 갯수
			toString() : 객체를 문자열로 변환
						 ---------------- (String) / String.valueOf()
			delete() : 삭제
	★★★	append() : 문자열 결합 
		

*/

// append() 문자열 결합

import java.io.*;	// ==> 클래스 CheckedException 예외처리 필수!	
import java.net.*;

public class _01_라이브러리_StringBuffer
{
	public static void main(String[] args)
	{
		try
		{
			StringBuffer sb=new StringBuffer();			// 클래스 생성해야함
			// Buffer : 임시 기억장소
			URL url=new URL("https://www.10000recipe.com/ranking/home_new.html");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			// 서버에 연결
			if(conn!=null)  // 연결되었다면,,
			{
				// Document doc=Jsoup.connet().get() --> 제이습의 get()과 같은 역할
				while(true)  // 한 줄씩 읽기
				{
					BufferedReader br=
							new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
					String msg=br.readLine();
					if(msg==null)
						break;
					sb.append(msg+"\n");
				}
				conn.disconnect(); // 서버 연결 해제
			}
					System.out.println(sb.toString());
		} catch (Exception ex)
		{
			ex.printStackTrace(); 		// 에러난 부분 확인
		}
	}
}
