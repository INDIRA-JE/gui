package button;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

// 버튼 클릭 지속 상태 & 클릭 출력
public class JToggleTest1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest1 frame = new JToggleTest1();
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
	public JToggleTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("토글버튼");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("토글버튼 클릭");
			}
		});
		tglbtnNewToggleButton.setFont(new Font("굴림", Font.PLAIN, 18));
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("버튼 클릭");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
			}
		});
		contentPane.add(tglbtnNewToggleButton_1, BorderLayout.SOUTH);
	}

}
