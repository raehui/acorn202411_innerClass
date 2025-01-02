package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener,PropertyChangeListener {
	// 필요한 필드 정의하기
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	// 생성자
	public MemberFrame(String title) {
		super(title);
		// 레이아웃 설정(BorderLayout)
		setLayout(new BorderLayout());
		// JLabel 2개
		JLabel label2 = new JLabel("이름");
		JLabel label3 = new JLabel("주소");
		// JTextField 2개
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		// JButton
		JButton addBtn = new JButton("추가");
		JButton deleteBtn=new JButton("삭제");
		// 페널에 UI 배치
		// Jpanel로 감싸기
		JPanel panel = new JPanel();
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		// 패널의 배경색 설정
		panel.setBackground(Color.orange);

		// 페널을 프레임의 위쪽에 배치
		// JFrame의 메서드 add 사용
		add(panel, BorderLayout.NORTH);

		// 버튼의 액션 리스너 등록
		// ActionListener를 받아와야 this가 사용 가능해짐(속성 확인해서 판단하기)
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		//버튼에 액션 command 설정
		addBtn.setActionCommand("add");
		deleteBtn.setActionCommand("delete");
		

		// 조회한 데이터가 gui에 나타나도록
		// 회원 목록을 출력할 테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 연결한 모델 객체
		//익명 클래스 활용
		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				//0번째 칼럼은  false 리턴해서 수정 불가능
				if(column==0) {
					return false;
				}else {//그 이외의 경우에는 true를 리턴해서 가능
					return true;
				}
				
			}
		};
		
		model.setColumnIdentifiers(colNames);
		
		model.setRowCount(0);
		// 모델을 테이블에 연결
		table.setModel(model);
		// 스크롤이 가능 하도록 테이블을 JScrollPane에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치한다.
		add(scroll, BorderLayout.CENTER);

		// DB에 있는 내용을 읽어와서 출력

		/*
		 * //JTable에 출력할 sample row 데이터 Object[] row= {1,"김구라","노량진"}; //테이블에 연결된 모델에
		 * row 추가하기 model.addRow(row);
		 * 
		 * Object[] row2= {2,"김구라2","노량진2"}; model.addRow(row2);
		 */

		// row 하나 당 데이터를 불러와서 출력하기
		// dto에 있는 정보가 들어가면 된다.

	
		printMember();
		
		//칼럼의 제목 글자 조정
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD,18));
		table.setFont(new Font("Sans-serif", Font.PLAIN,16)); //데이터 글자 크기14
		table.setRowHeight(25); //각 행의 높이를 조정
	
		//테이블에 값이 바뀌었는지 감시할 리스너 등록
		table.addPropertyChangeListener(this);
		
		
	}// 생성자
	
	public static void main(String[] args) {
		// gui 생성
		MemberFrame f = new MemberFrame("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE); // JFrame(부모)이 가지고 있는 필드
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);

	}

	// 인터페이스 때문에 강제 오버라이드
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 action command 을 읽어오기
		String command=e.getActionCommand();
		//action commande 를 이용해서 분기한다.
		if(command.equals("add")) {//java 에서는 문자열 비교를 .equals()메소드를 이용해서 비교 해야한다.
			// 입력한 이름과 주소를 읽어온다
			// 필드에 넣어기에 다른 메서드에서 사용 가능함(JTextField 의 참조값이 필드에 저장되어 있다.
			// this 가 생략되어 있음(?MemberFrame이 인가?)
			String name = inputName.getText();
			String addr = inputAddr.getText();
			// 입력한 이름과 주소를 MemberDto 객체에 담기
			// dao가 dto 객체만을 받아올 수 있기에
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			// MemberDao 객체를 생성해서
			MemberDao dao = new MemberDao();
			// insert() 메소드를 이용해서 회원정보를 DB에 저장한다.
			dao.insert(dto);		
			
		}else if(command.equals("delete")) {//삭제를 할 때 실행되는 동작 설정
			//선택된 JTable Row 가 있다면 몇번째 row 가 선택되었는지를 읽어와서
			int selectedRow=table.getSelectedRow(); //table을 필드로 만들고 타입 삭제, 아무것도 선택하지 않으면 -1
			if(selectedRow==-1) {
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하세요!"); //알림을 띄울 컴포넌트 (프레임)의 참조값
				return; //메서드를 여기서 끝내기
			}
			//삭제할 회원의 번호(primary key)를 읽어온다.
			//DB에 있는 내용이 삭제되고
			int num=(int)model.getValueAt(selectedRow, 0);
			new MemberDao().delete(num);
		}
		//리프래쉬로 다시 보여주게끔
		printMember();
	}
	
	
	// 회원 목록을 JTable 에 출력하는 메소드
	// 버튼 눌렀을 때나  처음 로딩할 때 
	public void printMember() {
		//기존에 출력된 내용을 초기화 한후에 
		model.setRowCount(0);		

		// 테이블에 출력할 회원 목록 얻어오기
		MemberDao dao = new MemberDao();
		//getList는 새로은 ArrayList를 만들어서 DB에서 조회된 값을 MemberDto를 요소로 넣음
		//결국은 만들어진 list를 리턴한다.
		List<MemberDto> list = dao.getList(); 

		// 반복문 돌면서
		for (MemberDto tmp : list) {
			// MemberDto 객체에 담긴 회원정보를 이용해서 Object[] 에 담은 다음
			Object[] rowData = {tmp.getNum(), tmp.getName(), tmp.getAddr() };
			// 테이블에 연결된 모델에 추가하기
			model.addRow(rowData);
		}
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// 감시하고 있다가 작업을 진행 
		/*
		 * property name이 tableCellEditor 이고
		 * table 이 수정중이 아닐때
		 * 현재 포커스가 있는 곳의 정보를 모두 읽어와서 DB에 수정반영하기
		 */
		if(evt.getPropertyName().equals("tableCellEditor")&& !table.isEditing()) {
			//현재 포커스가 있는 row 의 정보를 DB에 수정 반영한다.
			//변환된 값을 읽어와서 DB에 반영한다
			//수정된 칼럼에 있는 row 전체의 값을 읽어온다.
			//새로 입력된 내용 담기
			int selectedIndex=table.getSelectedRow();
			int num=(int)model.getValueAt(selectedIndex, 0);
			String name=(String)model.getValueAt(selectedIndex, 1);
			String addr=(String)model.getValueAt(selectedIndex, 2);
			//읽어온 내용을 MemberDto에 담고
			MemberDto dto=new MemberDto();
			dto.setNum(num);
			dto.setName(name);
			dto.setAddr(addr);
			//MemberDto 객체를 이용해서 수정 반영한다.
			new MemberDao().update(dto);
			//선택된 포커스 해제
			table.clearSelection();
			
		}
	}
}
