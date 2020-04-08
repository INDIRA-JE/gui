package radio;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;

// 여러 버튼 중 하나만 선택 가능
public class JRadioTest1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest1 frame = new JRadioTest1();
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
	public JRadioTest1() {
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
		
		JRadioButton rdo1 = new JRadioButton("고양이");
		panel_1.add(rdo1);
		
		JRadioButton rdo2 = new JRadioButton("강아지");
		panel_1.add(rdo2);
		
		JRadioButton rdo3 = new JRadioButton("말");
		panel_1.add(rdo3);
		
		JRadioButton rdo4 = new JRadioButton("치타");
		panel_1.add(rdo4);
		
		JRadioButton rdo5 = new JRadioButton("악어");
		panel_1.add(rdo5);
		
		// 2. 버튼 그룹 생성 (하나만 선택 하기 위함)
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		group.add(rdo4);
		group.add(rdo5);
		
		
	}

}
