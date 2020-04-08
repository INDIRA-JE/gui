package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class RockScissorPaper extends JFrame implements ActionListener{
	
	private JTextField textField;		// 출력
	private JButton rock, scissor, paper;
	
	private static final int ROCK=0;	// 바위
	private static final int PAPER=1;	// 보
	private static final int SCISSOR=2;	// 가위
	
	public RockScissorPaper() {
		setTitle("가위바위보");
		
		JLabel lblNewLabel = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();	// 출력 text
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton rock = new JButton("");
		rock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/rock.png")));
		rock.setFont(new Font("굴림", Font.BOLD, 20));
		rock.setActionCommand("?");
		rock.addActionListener(this);
		panel.add(rock);
		
		JButton scissor = new JButton("");
		scissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/scissor.png")));
		scissor.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(scissor);
		
		JButton paper = new JButton("");
		paper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/exam/paper.png")));
		paper.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(paper);
		
		
		setVisible(true);
//		pack();
		
	}

	public static void main(String[] args) {
		RockScissorPaper rock = new RockScissorPaper();
			}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//컴퓨터의 가위,바위,보 생성하기
		Random random = new Random();
		// random.nextInt(3) : 괄호안의 숫자는 미포함해서 0,1,2 중에서
		// 나오게 함
		int computer = random.nextInt(3);
		
		
		//사용자가 누른 버튼의 값을 가져온 후
		//가위,바위,보를 해서 누가 이겼는지 
		//textField 에 보여주기
		
		// 나를 만들어 놓고
		String user = e.getActionCommand();
		
		if (user.equals(ROCK)) {
			if (computer == SCISSOR) {
				textField.setText("내가 이김");
			} else if (computer == SCISSOR) {
				textField.setText("비김");
			} else {
				textField.setText("너가 이김");
			}
		} else if ( ) {
			
		}
	}
}







