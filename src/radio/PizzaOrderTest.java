package radio;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class PizzaOrderTest extends JFrame implements ActionListener {

	private JPanel contentPane, panel, panel_1, panel_5, panel_2, panel_3, panel_4;
	private JRadioButton rdo1, rdo2, rdo3, rdo4, rdo5, rdo6, rdo7, rdo8;
	private JButton btn1, btn2, btn3;
	private JLabel lblLabel4;

	private ButtonGroup bt1, bt2, bt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderTest frame = new PizzaOrderTest();
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
	public PizzaOrderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblTopLabel = new JLabel("왔니?!  피자먹고 가라~");
		lblTopLabel.setForeground(Color.BLUE);
		lblTopLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTopLabel);

		// 상단
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));

		// 종류
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

			rdo1 = new JRadioButton("치츠크러스트");
			rdo1.addActionListener(this);
			panel_2.add(rdo1);
	
			rdo2 = new JRadioButton("콤보");
			rdo2.addActionListener(this);
			panel_2.add(rdo2);

		// 추가 토핑
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		panel_3.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

			rdo3 = new JRadioButton("치즈");
			panel_3.add(rdo3);
	
			rdo4 = new JRadioButton("페퍼로니");
			panel_3.add(rdo4);
	
			rdo5 = new JRadioButton("새우");
			panel_3.add(rdo5);

		// 크기
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

			rdo6 = new JRadioButton("Small");
			panel_4.add(rdo6);
	
			rdo7 = new JRadioButton("Medium");
			panel_4.add(rdo7);
	
			rdo8 = new JRadioButton("Large");
			panel_4.add(rdo8);

		// 하단
		panel_5 = new JPanel();
		contentPane.add(panel_5, BorderLayout.SOUTH);

			btn1 = new JButton("주문");
			panel_5.add(btn1);
	
			btn2 = new JButton("취소");
			panel_5.add(btn2);
	
			JLabel lblLabel4 = new JLabel("금액 : ");
			panel_5.add(lblLabel4);

		// 각각 버튼 그룹 설정 : 하나만 선택 되게 하는 작업
		bt1 = new ButtonGroup();
		bt1.add(rdo1);
		bt1.add(rdo2);
		bt2 = new ButtonGroup();
		bt2.add(rdo3);
		bt2.add(rdo4);
		bt2.add(rdo5);
		bt3 = new ButtonGroup();
		bt3.add(rdo6);
		bt3.add(rdo7);
		bt3.add(rdo8);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		if (btn == btn1) {
//			주문버튼 : 종류, 추가 토핑, 크기의 주문내역 불러오기 "환불은 없습니다"
		} else if (btn == btn2) {
//			취소버튼 : 주문내역 초기화 "꺼지세요"
		}
	}
}
