/*
	4page : 자바 실행과정
	A.java ==========> A.class ==============> 	  화면에 결과값 출력
		   컴파일(javac)			인터프리터(java) ==> 동시에 처리 (이클립스의 ctrl+ f11)
	
	5page : 운영체제의 독립적 (운영체제마다 같은 번역을 함)

	19page : 
		1) 파일명과 클래스명이 동일해야함  (바꿀 경우, src의 파일 이름을 바꿀 것 --> refactor -> rename)
											-> 다른 클래스에서 사용된 이름까지 한 번에 바뀜
		2) 가급적이면 한 개의 파일에 한 개의 클래스를 사용하는 것을 권장 (만약 파일 내에 여러 개의 클래스가 존재할 경우, 파일명은 public 클래스를 따라감)
														(public 클래스가 없을 경우, main 메소드를 찾을 것)
														(main 메소드도 없을 경우, 아무 클래스나 상관 없음)
		3) 클래스명은 대문자로 시작할 것
		4) 실행을 위해 main method가 필요
	
		자바에 화면 출력 메소드
		-----------------
		System.out.print()		=> 이어서 출력 
		System.out.println()	=> \n을 포함 (줄바꿈)
		System.ou.printf()		=> 출력 형식을 만들 경우
	
	22page : 들여쓰기
		-코딩 시작할 때, 괄호를 항상 닫을 것
		-코딩 위에 주석을 통해 어떤 내용인지, 누가 한 내용인지 써둘 것
	
	23page : 주석 - 번역이 안되는 부분 //
	
	25page : 변수 -> 한 개의 데이터만 저장하는 메모리 공간
				 -> 데이터 값을 변경할 수 있음
	
	26page : 변수 선언 규칙
			 데이터형 변수명 = 초기값;
			 ex) int a = 10;
 
 	

*/
public class 정리_책페이지별내용 {
	public static void main(String[] args) {
		
	}
}
