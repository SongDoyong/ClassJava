package com.sist.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Sawon {
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
}



public class _02_접근지정어
{
	public static void main(String[] args)
	{
		Sawon sa =new Sawon();
		// sa --> sabun, name, dept, loc, pay 저장 중
		sa.setSabun(1);
		sa.setName("Chandier");
		sa.setDept("개발부");
		sa.setLoc("서울");
		sa.setPay(3000);
		
		System.out.println(sa.getSabun());
		System.out.println(sa.getName());
		System.out.println(sa.getDept());
		System.out.println(sa.getLoc());
		System.out.println(sa.getPay());
		
	}
}
