package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dao.ToDoDao;
import test.dto.ToDoDto;

public class TodolistFrame extends JFrame implements ActionListener {
	//필드
	JTextField inputtodo,inputcontent;
	DefaultTableModel model;
	JTable table;
	//생성자
	public TodolistFrame(String title) {
		super(title);
		//레이아웃 설정
		setLayout(new BorderLayout());
		//라벨 2개
		JLabel label1=new JLabel("todo 목록");
		JLabel label2=new JLabel("내용");
		//Jtextfiedl 2개
		inputtodo=new JTextField(10); 
		inputcontent=new JTextField(10);
		
		// JButton
		JButton addbtn=new JButton("추가");
		JButton deletebtn=new JButton("삭제");
		//패널로 감싸주기
		Panel panel=new Panel();
		panel.add(label1);
		panel.add(inputtodo);
		panel.add(label2);
		panel.add(inputcontent);
		panel.add(addbtn);
		panel.add(deletebtn);
		panel.setBackground(Color.yellow);
		
		add(panel,BorderLayout.NORTH);
		
		//화면에 보여주는 테이블 생성하기
		table=new JTable();
		//화면에 보여줄 열이름
		String[] colNames= {"번호", "todo","내용"};
		//테이블과 연결한 모델 객체
		model=new DefaultTableModel();
		model.setColumnIdentifiers(colNames);
		
		model.setRowCount(0);
		//테이블과 모델을 연결
		table.setModel(model);
		
		//스크롤이 가능하도록 JScrollPane로 테이블을 감싼다.
		JScrollPane scroll=new JScrollPane(table);
		//테이블을 감싼 scroll요소를 센터에 가져다 놓음
		add(scroll,BorderLayout.CENTER);
		
		// DB에 있는 내용을 읽어와서 출력 gui에 출력하기
		// 프레임이 만들어지는 시점에 불러와야 함		
		printtodo();
		
		
		//추가 버튼 눌렀을 때
		//ActionListener 받았기에 this 사용 가능함
		addbtn.addActionListener(this);		
		deletebtn.addActionListener(this);
		//버튼에 command 설정
		addbtn.setActionCommand("add");
		deletebtn.setActionCommand("delete");
				
	}//생성자 end
	
	public static void main(String[] args) {
		TodolistFrame f=new TodolistFrame("to_do_list");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//command 에 따라서 수행 명령을 다르게
		String command=e.getActionCommand();
		if(command.equals("add")) {
			// 추가 버튼 눌렀을 때 입력한 내용이 창에 조회되게끔
			// 입력한 데이터가 DB에 저장
			ToDoDao dao=new ToDoDao();
			ToDoDto dto=new ToDoDto();
			
			String todo=inputtodo.getText();
			String content=inputcontent.getText();
			//setTodo, setContent에는 스트링 타입인 textfield에 입력한 값이 들어가야 함
			dto.setTodo(todo);
			dto.setContent(content);
			dao.insert(dto);			
		}else if(command.equals("delete")) {
			int selectedRow=table.getSelectedRow();
			if(selectedRow==-1) {
				JOptionPane.showMessageDialog(this,"삭제할 행을 선택하세요!!");
				return;
			}
			//찐으로 삭제하기
			int num=(int)model.getValueAt(selectedRow, 0);
			ToDoDao dao=new ToDoDao();
			dao.delete(num);
		}
			
		//입력한 값이 화면에 나타나게끔		
		printtodo();
				
	}
	
	public void printtodo() {
		model.setRowCount(0);
		
		ToDoDao dao=new ToDoDao();
		List<ToDoDto> list = dao.getList();
		for (ToDoDto tmp : list) {
			Object[] rowdata = { tmp.getNum(), tmp.getTodo(), tmp.getContent() };
			model.addRow(rowdata);
		}
				
	}//메서드 end
}
