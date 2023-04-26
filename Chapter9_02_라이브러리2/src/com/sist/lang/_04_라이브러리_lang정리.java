package com.sist.lang;

import java.util.ArrayList;
import java.util.List;

/*
	java.lang => 기본 (가장 많이 사용되는 클래스의 집합) / import 생략 
	---------
	  Object : 최상위 클래스 => 모든 클래스는 Object 상속
	  		   ---------- 데이터형으로 사용 (가장 큰 데이터형)
	  		   			Object o=10;
	  		   			o=10.5;
	  		   			o="";
	  		   			o='A';
	  		   			------------
	  		   			리턴형 / 매개변수 -> 대부분 Object ==> 형변환해서 사용
	  		   		=> 기능
	  		   			1) clone : 복제 (새로운 메모리 만들기)
	  		   			2) toString : 객체의 문자열화
	  		   			3) finalize : 소멸자
	  		   			4) equals : 객체 비교 (기본은 주소값 비교 / 실제 값 비교는 오버라이딩 필요)
	  		   			
	  String : 문자열 저장 클래스
	  		-length()
	  		-substring()
	  		-trim()
	  		-charAt()
	  		-replace()
	  		-equals()
	  		-startsWith()
	  		-endsWith()
	  		-contains()
	  		-indexOf()
	  		-lastIndexOf()
	  		-valueOf()
	  StringBuffer : append() 문자열 결합
	  Wrapper : 기본형 데이터의 클래스화
	  			-> 기본형을 개게형으로 저장 / 문자열을 기본형으로 변환
	  				parseXxxx()
	  Math : 수학
	  		random() : 난수발생 (0.0~0.99)
	  		ceil()	: 올림 메소드  -> 총페이지 구하기
	  		round() : 반올림 메소드 -> 평균, 통계
	  System
			-System.currentTimeMillis() : 실제시간을 long으로 --> log파일 만들 때 (최적화시에 사용)
			-System.gc() : 가비지 컬렉션 호출 (메모리 회수)
			-System.out : 화면 출력 (outputStream)
			-System.in : 키보드 입력값, 파일 (inputStream)	



*/
class A
{
	
}

public class _04_라이브러리_lang정리
{
	public static void main(String[] args)
	{
		List list=new ArrayList<>();
		list.add("aaa");
		list.add(1);
		String a=(String)list.get(0);
		int b=(Integer)list.get(1);
		System.out.println(a);
		System.out.println(b);
		
		
		//int aa=new Integer(10); 사용이 가능하지만, 경고 (굳이
		
	}
}	
