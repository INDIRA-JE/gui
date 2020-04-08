package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// 이벤트 처리를 위한 클래스를 외부 클래스로 작성하기
class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 감시자
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource()); //지금 현재 이벤트가 일어난 대상을 가져온다
		
		// 버튼위에 있는 글자를 변경
		JButton btn = (JButton) e.getSource();
		btn.setText("버튼이 눌러졌습니다.");
	}
	
}

public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		// 버튼 생성
		JButton btnNewButton = new JButton("버튼을 누르세요");
		panel.add(btnNewButton);
		// 버튼과 리스터를 연동하는 부분
		btnNewButton.addActionListener(new MyListener1());	// 감시자 : ActionListener / 동작 : new MyListener1()
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
	}
}
