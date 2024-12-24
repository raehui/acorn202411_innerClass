package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame03 extends JFrame implements ActionListener {
	//필드
	int count=0;
	JButton countbtn;
	
	//생성자
	public MyFrame03() {
		//프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x,y,width,height)
		setBounds(100,100,500,500);
		//종료 버튼을 눌렀을 때 프로세스(앱) 전체가 종료 되도록 한다
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이아웃 매니저 객체 생성
		//인라인 요소처럼 배치가 된다
		FlowLayout layout =new FlowLayout(FlowLayout.CENTER);
		//프레임의 레이아웃 매니저 설정
		setLayout(layout);
		//JButton 객체 생성
		//생성자에 선언한 지역 변수는 이 생성자 안에서만 사용할 수 있다.
		//객체가 생성되는 시점에 참조값이 들어가는 것임
		countbtn=new JButton("0");
		//프레임의 add()메서드 호출하면서 JBUtton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(countbtn);
		//MyFrame03 클래는 implements ActionListener 인터페이스를 구현했기 때문에 this 전달 가능
		countbtn.addActionListener(this); //ActionListener가 아닌데 왜 받아줌
		
		//화면상에 실제 보이도록 한다.
		setVisible(true);				
	}//생성자 end
	
	//main 메서드
	public static void main(String[] args) {
		new MyFrame03();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼을 눌렀네?");
		count++;
		countbtn.setText(Integer.toString(count));
	}
}
