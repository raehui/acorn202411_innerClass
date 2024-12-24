package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mypractice extends JFrame {
	int count=0;
	
	//생성자
	public Mypractice() {
				//프레임의 제목 설정
				this.setTitle("나의 연습");
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
				
				JButton countbtn=new JButton("0");
				//프레임의 add()메서드 호출하면서 JBUtton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
				add(countbtn);
				
				
				//버튼에 전달한 ActionListener은 인터페이스 타입이다
				ActionListener listener=new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						count++;
						countbtn.setText(Integer.toString(count));
						
					}
				};
				
				countbtn.addActionListener((event)->{
					
				});
								
				setVisible(true);
	}
	
	//main 메서드
	public static void main(String[] args) {
		new Mypractice();
	}
		
}
