package com.sist.program;
// VO -> DAO -> 전송 -> 관련된 데이터는 무조건 묶어서 보낸다

import java.util.*;
import java.io.*;
public class SeoulSystem
{
	private static SeoulLocationVO[] datas = new SeoulLocationVO[273];
	// 모든 사용자가 데이터를 공통으로 사용
	// 페이지의 경우, 새로 고침을 할 때마다 첫 번째 페이지로 돌아가지 않도록 멤버변수로 잡아둘 필요가 있음
	private int curpage;		// 현재 페이지 --> 프로그램 종료까지 유지
	private int totalpage;		// 전체 페이지 --> 총 페이지 수가 변하지 않도록 해야하기 때문에 멤버변수로..
								// 검색어의 경우, 사용된 뒤에 버려야하므로 지역변수
								// 프로그램 종료시까지 유지되는 변수와 사용하고 버릴 변수를 구분해야함
	static 
	{
		// 데이터를 읽어서 메모리에 저장 => 초기화
		try
		{
			StringBuffer sb=new StringBuffer();				// 버퍼로 데이터 모아오기
			int i=0;
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			//System.out.println(sb.toString());
			String[] locations=sb.toString().split("\n");			// 문서 1줄씩 잘라서 배열 저장
			int k=0;
			for(String s:locations)
			{
				//System.out.println(s);
				StringTokenizer st=new StringTokenizer(s,"|");
				datas[k]=new SeoulLocationVO();
				datas[k].setNo(Integer.parseInt(st.nextToken()));
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
				
			}
		} catch (Exception e)
		{
			
		}
		

	}
	// 페이지별 데이터 출력
	public SeoulLocationVO[] seoulList(int page)
	{
		SeoulLocationVO[] data=
				new SeoulLocationVO[10];
		int j=0;						// 10개씩 나눠주는 변수
		int start=(page*10)-10;			// 시작점 잡기
		/*
			1page -> 0~9
			2page -> 10~19
			3page -> 20~29		--> page에 1값이 들어오면, start는 0부터 (배열의 인덱스) -> for문의 시작점
		*/
		int k=0;
		for(int i=0;i<datas.length;i++)
		{
			if(j<10 && i>=start)
			{
				data[k]=datas[i];
				k++;
				j++;
			}
		}
		return data;
		
	}
	public int seoulTotalPage()
	{
		return (int)(Math.ceil(datas.length/10.0));		// 총 페이지 --> 10개씩 나누면, 27.3 --> ceil 올림으로 28
	}
	
	// 메뉴만들기
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("========메뉴=========");
		System.out.println("1. 목록 출력 (페이지별)");
		System.out.println("2. 상세보기");
		System.out.println("3. 명소 검색");
		System.out.println("4. 주소 검색");
		System.out.println("9. 종료");
		System.out.println("====================");
		System.out.print("메뉴 선택:");
		return scan.nextInt();
	}
	// 검색 --> 이름
	public SeoulLocationVO[] nameFind(String fd)				// 리턴값이 배열 자체
	{
		int count=0;
		for(SeoulLocationVO vo : datas)
		{
			if(vo.getName().contains(fd))						// VO내의 name중에 검색어 fd가 포함되었다면, 카운트 증가 (갯수 확인을 위해)
			{
				count++;
			}
		}
		// 고정형이기 때문에, 위와 같은 과정을 거쳐야 함(배열 설정시, 배열의 인덱스를 고정해야하므로) 
																//--> 가변형 (Collection)을 사용하면 번거롭게 카운트를 셀 필요 없음
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];		// 갯수가 몇 개인지 정확히 확인해서, 검색된 배열을 확인할 때, 만드는 배열의 갯수에 넣어주기
		int i=0;
		for(SeoulLocationVO vo : datas)
		{
			if(vo.getName().contains(fd))						
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;				// 배열이 리턴형이므로, 배열 이름만 리턴하면 됨
	}
	// 주소검색
	public SeoulLocationVO[] addrFind(String addr)				
	{
		int count=0;
		for(SeoulLocationVO vo : datas)
		{
			if(vo.getAddress().contains(addr))						
			{
				count++;
			}
		}
		
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];		
		int i=0;
		for(SeoulLocationVO vo : datas)
		{
			if(vo.getAddress().contains(addr))						
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;				
	}
	// 상세보기
	public void process() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("★★★★★★★★★ SIST 영화 ★★★★★★★★★");
		while(true)
		{
			int menu=menu();
			try {
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==3)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("검색어 입력: ");
				String name=scan.next();
				SeoulLocationVO[] data=nameFind(name);
				System.out.println("\""+name+"\" 검색 결과\n총 " + data.length+"건입니다.");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+". "+vo.getName());
				}
			}
			else if(menu==4)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("주소 입력: ");
				String addr=scan.next();
				SeoulLocationVO[] data=addrFind(addr);
				System.out.println("\""+addr+"\" 검색 결과\n총 " + data.length+"건입니다.");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+". "+vo.getName());
				}
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					System.out.println("페이지 입력(1~28): ");
					curpage=scan.nextInt();					// 멤버변수의 페이지 수 저장
					if(curpage<1 || curpage>28)
					{
						System.out.println("없는 페이지입니다.");
						continue;
					}
					break;
				}
				totalpage=seoulTotalPage();				// 토탈페이지 저장 
				System.out.println(curpage+" page / "+totalpage+" pages");
				SeoulLocationVO[] data=seoulList(curpage);
				for(SeoulLocationVO vo:data)
				{
					if(vo!=null)										// null일 경우에만 출력하도록 --> 10개씩 잡혀있기 때문에,
					{
					System.out.println(vo.getNo()+ ". "+vo.getName());
					}
				}
				
			}
			else if(menu==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("상세 볼 명소 번호 입력(1~273):");
				int no=scan.nextInt();
				System.out.println("번호: "+ datas[no-1].getNo());
				System.out.println("명소: "+ datas[no-1].getName());
				System.out.println("주소: "+ datas[no-1].getAddress());
				System.out.println("소개: "+ datas[no-1].getContent());
				
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
	
	public static void main(String[] args)
	{
		
		
		
//		SeoulSystem ss=new SeoulSystem();
//		for(SeoulLocationVO vo:datas)
//		{
//			System.out.println(vo.getNo());
//			System.out.println(vo.getName());
//			System.out.println(vo.getAddress());
//			System.out.println("=================");
//			
//		}
	}
}
