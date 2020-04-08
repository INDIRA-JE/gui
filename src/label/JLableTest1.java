package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// 클릭 하면 사진이 나옴
public class JLableTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLableTest1 frame = new JLableTest1();
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
	public JLableTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("이미지를 보려면 버튼을 눌러라");
		panel.add(lblNewLabel);
		
		JButton btnClick = new JButton("클릭");
		btnClick.addActionListener(this);
		panel.add(btnClick);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon dog = new ImageIcon(getClass().getResource("pu.jpg"));
		lblNewLabel_1.setIcon(dog);
	}

}
