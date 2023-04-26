package com.sist.lang;


// delete, insert	==> 메모리 자체를 변경 (원본 변경)
// substring 		==> 원본 변경 없음 --> 변경하려면 새로운 메모리를 형성해야함
public class _02_라이브러리_StringBuffer_delete_insert
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("홍길동입니다");
		sb.delete(3, 6);	// delete(int s, int e) --> s부터 e-1까지 자르기  
		System.out.println(sb.toString());		// .toString() why? 오브젝트로 리턴하기 때문에
		sb.insert(3, "입니다");					// insert --> 3번부터 뒤에 " " 더해서 출력
		System.out.println(sb.toString()); 
		System.out.println(sb.substring(3));	// substring은 메모리 자체를 변경하지 않음 (새로운 메모리에 저장)
	}
}
