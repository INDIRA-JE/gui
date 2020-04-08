package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ButtonDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnLeft, btnMiddle, btnRight;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonDemo frame = new ButtonDemo();
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
	public ButtonDemo() {
		
		setTitle("버튼 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnLeft = new JButton("Disable  Middle button");
		btnLeft.setMnemonic('D');				// Alt + ? 단축키 역할
		btnLeft.setActionCommand("disable");	
		btnLeft.addActionListener(this);
		btnLeft.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/left.gif")));
		panel.add(btnLeft);
		
		btnMiddle = new JButton("Middle Button");
		btnMiddle.setMnemonic('M');				// Alt + ? 단축키 역할
		btnMiddle.setActionCommand("middle");	
		btnMiddle.addActionListener(this);
		btnMiddle.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/middle.gif")));
		panel.add(btnMiddle);
		
		btnRight = new JButton("Enable Middle Button");
		btnRight.setMnemonic('E');				// Alt + ? 단축키 역할
		btnRight.setActionCommand("enable");	
		btnRight.addActionListener(this);
		btnRight.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/right.gif")));
		panel.add(btnRight);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource()  / e.getActionCommand()
		
		String cmd = e.getActionCommand();
		System.out.println(cmd);	// 버튼이 눌리면 내용 입력
		
		if (cmd.equals("disable")) {
			btnMiddle.setEnabled(false);
			btnLeft.setEnabled(false);
			btnRight.setEnabled(true);
		} else {
			btnMiddle.setEnabled(true);
			btnLeft.setEnabled(true);
			btnRight.setEnabled(false);
		}
	}

}
