package test.main;

import javax.swing.JFrame;

public class MainClass06 {
	public static void main(String[] args) {
		JFrame f=new JFrame("나의 프레임");
		//.setBounds(x,y,width,height)
		f.setBounds(100,100,600,600);
		//창의 닫기 버튼을 눌렀을때 프로세스가 종료되도록(app 이 종료되도록)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 보이도록 한다.
		f.setVisible(true);
		
		
	}
}