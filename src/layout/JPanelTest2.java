package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest2 extends JFrame {
	public JPanelTest2() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BorderLayout());
		
		// 상단 - 왼쪽, 가운데, 오른쪽
		JPanel upPane = new JPanel();
		JButton bt1 = new JButton("왼쪽");
		JButton bt2 = new JButton("가운데");
		JButton bt3 = new JButton("오른쪽");
		upPane.add(bt1);
		upPane.add(bt2);
		upPane.add(bt3);
		totalPane.add(upPane, BorderLayout.NORTH);
		
		// 왼쪽
		JPanel leftPane = new JPanel();
		JButton bt4 = new JButton("서쪽");
		leftPane.add(bt4);
		totalPane.add(leftPane, BorderLayout.WEST);
		
		// 오른쪽
		JPanel rightPane = new JPanel();
		
		
		// 가운데
		JPanel centerPane = new JPanel();
		
		
		// 하단
		JPanel downPane = new JPanel();
		
		
		add(totalPane);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 화면 출력
		JPanelTest2 jt = new JPanelTest2();
	}
}
