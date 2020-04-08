
package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

// 선택하면 버튼 내용 출력 1
public class JRadioTest2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
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
	public JRadioTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("선호하는 애완동물은?");
		panel.add(lblNewLabel);
		
		// 1. 버튼을 만들고
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdo1 = new JRadioButton("반달곰");
		rdo1.addActionListener(this);
		panel_1.add(rdo1);
		
		JRadioButton rdo2 = new JRadioButton("사자");
		rdo2.addActionListener(this);
		panel_1.add(rdo2);
		
		JRadioButton rdo3 = new JRadioButton("말");
		rdo3.addActionListener(this);
		panel_1.add(rdo3);
		
		JRadioButton rdo4 = new JRadioButton("치타");
		rdo4.addActionListener(this);
		panel_1.add(rdo4);
		
		JRadioButton rdo5 = new JRadioButton("악어");
		rdo5.addActionListener(this);
		panel_1.add(rdo5);
		
		// 2. 버튼 그룹 생성
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		group.add(rdo4);
		group.add(rdo5);
		
		// 선택 된 버튼 내용 출력
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 선택 된 버튼 내용 출력
		textField.setText(e.getActionCommand());
	}

}
