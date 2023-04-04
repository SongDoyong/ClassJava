/*
		반복문 : 유사한 내용이 여러번 반복할 때, 주로 사용
			ex) 영화목록, 맛집목록, 메인화면 .... 상세보기 (f5)
				페이징 작업

			!! 유의할 점: 반복문의 형식 / 순서 / 변수의 위치

		반복문의 종류
		
			1. 반복 횟수가 정해져 있는 경우: for
		
			2. 반복 횟수가 정해지지 않은 경우: while
		
			3. 한 번 이상 수행이 가능한 경우:	do~while
			-------------------------------------
			자바에서 출력, 제어 => for (2차, 중첩)
			데이터베이스, 네트워크 => while (1차)  ==> 몇 명이 할지 모르기 때문에.. 무한루프 多
		
		반복문의 형식

			1. for
				for( 초기값 ; 조건식 ; 증감식 )
				{
					반복 수행문장
				}
			
			2. while
			----------------------
				초기값				(1)
				while(조건문)			(2)	==> 조건이 시작부터 false라면, 수행을 못할 수 있음.
				{
					반복 수행문장		(3)
					증감식			(4)  ==> 2번 이동 (true일 경우 수행 / false면 종료)
				}
			----------------------	
			
			3. do~while
				초기값				(1)
				do{
					반복 수행문장		(2)	==> 조건과 상관없이 반복문을 최소 1회 수행
					증감식			(3)
				}while(조건문);		(4)
				
			4. for(2차)





*/
public class _01_반복문_형식공부 {
	public static void main(String[] args) {
//		String[] food= {
//				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
//				"아삭아삭한 고추된장박이",
//				"달콤 짭조름♡ 떡 베이컨 간장조림♡",
//				"누텔라 견과류 토스트 만들기",
//				"등갈비김치찜 김치넣고 푹푹 익히기만 하세요 복잡한건 정말 싫으네요"
//		};
//		String[] chef= {
//				"루던",
//				"돌하우스",
//				"요블리",
//				"dddd516",
//				"즐거운날랄라"
//		};
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(food[i]+" ("+chef[i]+")");
//		}
		
/*			 1 		2	4		
		for(초기값;조건식;증감식)		1-2-3-4-2-3-4-2-3-4-2-3-4 ...-2 (2번이 false가 되면) 종료
		{									초기값의 int i 는 { }까지만 사용 가능	(블록변수, 지역변수) --> 스택에 저장 --> 메모리에 의해 자동 삭제
																							// 따라서, 멤버 변수 (클래스에 저장하여, 삭제되지 않도록) 필요
			반복 수행문장	3					for문에서 사용한 i를 { } 밖에서도 사용하려면, int i를 for 밖에서 선언한 후 -> 초기값에서 i의 값을 지정할 것
		}			
*///		int i=0;
//		for(i=1;i<=10;i++)
//		{
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.println(i);
//		
		System.out.println("============for==========");
		
		// A~Z 출력
		
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		// A를 26개 출력
		
		
		for (int i =0; i<26;i++)
		{
			char c = 'A';					// char c를 계속 'A'로 선언하기 때문에 c++이 되었더라도 다시 'A'로 돌아옴.
			System.out.print(c++ +" ");
		}
		System.out.println("\n=====================");
		
		System.out.println("========while========");
		
		
	/*
		 while 형식:
		 	
		 		초기값				(1)
				while(조건문)			(2)	==> 조건이 시작부터 false라면, 수행을 못할 수 있음.
				{
					반복 수행문장		(3)
					증감식			(4)  ==> 2번 이동 (true일 경우 수행 / false면 종료)
				} 
				
				1-2-3-4
				  2-3-4
				  2-3-4
				  2-3-4
		 		 -- 2번 false면 종료
		 		==> 무한루프 (네트워크 서버, 데이터베이스 값 읽기, 파일 읽기)
		 		==> 파일읽기 => -1(EOF) 
		 		
		 	// 1~10까지 출력(while)	
	*/
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");	
			i++;  						// 무한루프 제어
		}
		System.out.println("\n========while========");
		
		
		//알파벳 출력(while)
		char c='A';
		i=1;
		
		while(i<=26)
		{
			System.out.print(c++ + " ");
			i++;
		}
		
		/*
				do~while: 후조건 => 무조건 1번은 수행
				
			형식)
				
				초기값				(1)
				do{
					반복 수행문장		(2)	==> 조건과 상관없이 반복문을 최소 1회 수행
					증감식			(3)
				}while(조건문);		(4) : true면 2번으로 이동 / false면 종료
		
		*/
		System.out.println("\n========do~while=========");
		i = 1;
		do 
		{
			System.out.print(i+" ");
			i++;
			
		}while(i<=10);
		
		System.out.println("\n========do~while=========");
		
		c='A';
		i=0;
		do {
			System.out.print(c++ + " ");
			i++;
		}while(i<26);
		
		System.out.println("\n=========================");
		
		
		
		
	}
}
