package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JComboTest5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultComboBoxModel<String> model;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest5 frame = new JComboTest5();
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
	public JComboTest5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addActionListener(this);			// 무엇을 할것을 달아 놓음
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		// 버튼 네임 입력
		JButton btnNewButton = new JButton("삭제");
		btnNewButton.addActionListener(this);		// 입력이 됐는지, 안됐는지 확인하고 actionPerformed으로 보내준다
		panel.add(btnNewButton);
		
		// 입력
		model = new DefaultComboBoxModel<String>();
		model.addElement("사과");
		model.addElement("수박");
		comboBox = new JComboBox<>(model); 
		
		// 추가 입력
//		JComboBox comboBox = new JComboBox();
//		panel.add(comboBox);		
		JComboBox<String> comboBox = new JComboBox<>(model);
		panel.add(comboBox);
		
	}

	// 실행(행동)을 보여주는 코딩
	@Override
	public void actionPerformed(ActionEvent e) {
		// textField, button	입력 값들은 추가 시키는 기능
		if (e.getSource() == textField) {
			model.addElement(textField.getText());
		} else {	// JButton → 삭제
			model.removeElementAt(comboBox.getSelectedIndex());
		}
	}

}
