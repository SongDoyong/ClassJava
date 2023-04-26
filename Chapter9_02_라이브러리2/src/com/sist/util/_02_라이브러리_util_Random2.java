package com.sist.util;

import java.util.Arrays;
import java.util.Random;

public class _02_라이브러리_util_Random2
{
	public static void main(String[] args)
	{
		char[] alpha=new char[10];
		Random r=new Random();
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)(r.nextInt(5)+65);
			if(alpha[i]=='E')
			{
				alpha[i]='F';
			}
			System.out.println((i+1)+"번 학생 성적: "+alpha[i]);
		}
		System.out.println(Arrays.toString(alpha));
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
	}
}
