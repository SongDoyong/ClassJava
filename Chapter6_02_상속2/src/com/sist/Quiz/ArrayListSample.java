package com.sist.Quiz;

import java.util.ArrayList;

public class ArrayListSample
{
	public static void main(String[] args)
	{
		ArrayList pitches = new ArrayList();			// ArrayList 배열명 = new ArrayList();
		pitches.add("137");								// 배열명.add(인덱스 번호, 데이터) ==> 인덱스 번호를 주지 않으면, 순서대로 
		pitches.add("129");								// 같은 인덱스 번호를 추가하면, 앞선 데이터가 뒤로 밀림
		pitches.add("141");								
		pitches.add(0, "14");							
		pitches.add(0, "15");							// 배열명.contains(데이터) --> true / false로 포함되는지 확인
														 
		
		System.out.println(pitches);
		System.out.println(pitches.get(3));				// 배열명.get(index) -> index번째의 값 불러오기 
		System.out.println(pitches.size()); 			// 배열명.size() --> 배열의 데이터 갯수
		System.out.println(pitches.contains("14")); 	// 배열명.contains(데이터) --> true / false로 포함되는지 확인	
		System.out.println(pitches.remove(0)); 			// 배열명.remove(index) --> index번째 데이터 삭제 후, 삭제된 항목 표시
		System.out.println(pitches.remove("141"));		// 배열명.remove(object) --> object를 리스트에서 제거 후, true/false 표시
		System.out.println(pitches.size()); 			// 2개의 데이터를 삭제했으므로, size 3으로 줄어듦.
		
	}
}
