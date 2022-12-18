package logins;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import frame.AppFrame;



public class MemberListFrame extends JFrame {

	private String username; //세션
	private JPanel contentPane;
	private JTable table;
	private JLabel lbTitle;
	private JButton logoutBtn;
	private DefaultTableModel tableModel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberListFrame frame = new MemberListFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MemberListFrame() {
		this(null);
	}
	public MemberListFrame(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1032, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lbTitle = new JLabel("회원정보");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lbTitle.setPreferredSize(new Dimension( 738, 50 ));
		contentPane.add(lbTitle, BorderLayout.NORTH);
		
		//샘플 데이터 가져오기 (나중에 DB에서 가져와야 함)
		Vector<String> memberName = Sample.getMemberName();
		Vector<Member> members = Sample.getMembers();
		
		//tableModel에 열 이름과 행 개수 설정
		tableModel = new DefaultTableModel(memberName,0);
		
		//tableModel에 전체 행 넣기
		for (int i = 0; i < members.size(); i++) {
			Vector<Object> row = new Vector<>();
			row.addElement(members.get(i).getId());
			row.addElement(members.get(i).getUsername());
			row.addElement(members.get(i).getPassword());
			row.addElement(members.get(i).getName());
			row.addElement(members.get(i).getEmail());
			row.addElement(members.get(i).getPhone());
			row.addElement(members.get(i).getCreateDate());	
			tableModel.addRow(row);
		}
		
		//tableModel을 JTable에 넣기
		table = new JTable(tableModel);
		table.setFont(new Font("돋움", Font.PLAIN, 20));
		table.setRowHeight(25);
		
		//JTable에 scroll달아서 add하기
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		logoutBtn = new JButton("랜덤맛집추천");
		contentPane.add(logoutBtn, BorderLayout.SOUTH);
		
		logoutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "랜덤맛집추천 가는중");
				dispose();
				AppFrame.getInstance(); // 앱스타트 클래스실행(random restaurant)
				//new LoginFrame();
			}
		});
		
		if(username == null) {
			JOptionPane.showMessageDialog(null, "인증되지 않은 사용자 입니다.");
			dispose();
		}else {
			setVisible(true);	
		}
		
		
		
		
	    JMenuBar mb = new JMenuBar();
        
        //메뉴 생성
        JMenu jm = new JMenu("메뉴1");
        
        //메뉴 아이템 생성
        JMenuItem mi1 = new JMenuItem("로그아웃");
        JMenuItem mi2 = new JMenuItem("회원가입");
        JMenuItem mi3 = new JMenuItem("랜덤맛집");
 
        //이벤트 리스너 달기
        //mi1.addActionListener(new MenuActionListener());
       // mi2.addActionListener(new MenuActionListener());
      //  mi3.addActionListener(new MenuActionListener());
       
        mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
				dispose();
				new LoginFrame();
			}
		});
        
        mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "회원가입 화면 가기.");
				dispose();
				new JoinFrame();
			}
		});
        
        mi3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "랜덤맛집추천 가는중");
				dispose();
				AppFrame.getInstance();
			}
		});
                   
        //메뉴에 아이템 추가
        jm.add(mi1);
        jm.addSeparator();    //메뉴 아이템의 구분선 생성
        jm.add(mi2);
        jm.add(mi3);
               
        //메뉴바에 메뉴 추가
        mb.add(jm);
        mb.add(new JMenu("메뉴2"));
               
        //프레임에 메뉴바 붙이기
        setJMenuBar(mb);	
	}
	
	
	
	
	
	

}

