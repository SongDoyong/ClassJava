package com.sist.exception;

/*


*/

import java.io.*;
// Checked Exception --> 반드시 예외처리를 해야함
public class _08_예외처리_복구8_파일읽기
{
	public static void main(String[] args)
	{
		int i=0;
//		FileReader fr=null;				// 초기값을 지정해야 아래의 fr이 활성화 됨
//		try
//		{
//			fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter8_02_예외처리2\\src\\com\\sist\\exception\\_01_예외처리_복구1_이론.java");
//			while((i=fr.read())!=-1)
//			{
//				System.out.print((char)i);
//			}
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//				fr.close();
//			} catch (IOException e2)
//			{
//				
//			}
//		}
		
		// resource-with	=>	fr을 자동으로 닫음 --> finally를 사용하지 않음
		try(FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter8_02_예외처리2\\src\\com\\sist\\exception\\_01_예외처리_복구1_이론.java")){
			i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);			// 숫자로 읽어오는걸 char로 변환
			}
		}catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
