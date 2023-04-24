package com.sist.exception;

/*
	예외처리 방법
	---------
	1. 예외 복구: try ~ catch ~ finally (사용 빈도 높음)
	2. 예외 회피: throws				  (주로 라이브러리)
	3. 임의 발생: throw
	4. 사용자정의: 지원하지 않는 경우에 직접 제작 (사용 빈도 낮음)
					if문으로 처리하므로 ..



*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class _07_예외처리_복구7_부분예외처리_업다운게임 extends JFrame implements ActionListener
{
	private JTextField tf;
	private JButton b1, b2;
	private int com;
	public _07_예외처리_복구7_부분예외처리_업다운게임()		// 생성자 --> 초기화 및 시작과 동시에 처리하는 내용
	{
		tf=new JTextField(20);				// 한 줄 입력창 만들기
		b1=new JButton("Start");			// 버튼 만들기
		b2=new JButton("End");				// 버튼 만들기
		tf.setEnabled(false);				// 버튼 비활성화
		
		JPanel p=new JPanel();				// 프레임 창 만들기
		p.add(tf);p.add(b1);p.add(b2);		// 프레임에 버튼 2개, 입력창 추가
		add("Center",p);
		
		setSize(390, 100);
		setVisible(true);
		
		
		b1.addActionListener(this);
		// b1번을 클릭하면, actionPerformed를 호출 --> 이벤트 등록
		// this는 소속된 클래스 
		b2.addActionListener(this);
		tf.addActionListener(this);
		// tf에서 엔터를 누르면, actionPerformed를 호출 --> 이벤트 등록
	}
	public static void main(String[] args)
	{
		new _07_예외처리_복구7_부분예외처리_업다운게임();
	}
	
	// 버튼 처리하는 메소드 ==> 버튼이 무슨 용도인지 모르기 때문에, interface로 설정
	// 호출은 해줌 (자동호출) --> 구현은 사용자가 해야함 --> 인터페이스!
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)	// b2번을 클릭했다면,
		{
			System.exit(0);		// 프로그램 종료
		}
		else if(e.getSource()==b1)	// b1번을 눌렀다면,
		{
			com=(int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);					// 시작 누른 후, 시작버튼 비활성화하기
		}
		else if(e.getSource()==tf)
		{
			String strNum=tf.getText();				// 입력창에서 텍스트값 가져오기
			if(strNum.trim().length()<1)					// 입력받은 값의 공백을 제거한 후 값이 없다면
			{
				JOptionPane.showMessageDialog(this, "1~100 사이의 정수를 입력하세요");
				tf.requestFocus();
				return; 								// 메소드 종료
			}
			
			int num=0;
			try
			{
				num=Integer.parseInt(strNum);			// 문자열을 정수형으로 변경		// 정수를 문자열로 바꾸기: valueOf()
			} catch (NumberFormatException ex)
			{
				// 잘못 입력된 경우, 복구
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다.");
				tf.setText("");							// 입력된 문자 없애기 ex) 문자, 카톡 등등 --> 입력값을 보내면 입력창 초기화
				tf.requestFocus();
				return;
			}
			//비교
			if(com>num) 
			{
				JOptionPane.showMessageDialog(this, "Up!!!");
				tf.setText("");							
				tf.requestFocus();
			}
			else if(com<num)
			{
				JOptionPane.showMessageDialog(this, "Down!!!");
				tf.setText("");							
				tf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Game Over!");
				tf.setText("");		
				tf.setEnabled(false);
				tf.setEnabled(true);
			}
		}
		
		
	}
}
