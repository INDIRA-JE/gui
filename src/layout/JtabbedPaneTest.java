package layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JtabbedPaneTest extends JFrame{
	public JtabbedPaneTest() {
		setTitle("JTabbedPane");
		setSize(500, 500);
		setVisible(true);
		
		JTabbedPane jtp = new JTabbedPane();
		// tab 이 보여질 위치 지정
		jtp.setTabPlacement(JTabbedPane.LEFT);
		
		// 탭에 보여줄 패널 추가
		JTabbedPane first = new JTabbedPane();
		first.setBackground(Color.BLUE);
		jtp.addTab("첫번째", first);
		
		// 탭에 보여줄 패널 추가
		JTabbedPane second = new JTabbedPane();
		second.setBackground(Color.GRAY);
		jtp.addTab("두번째", second);
		
		// 탭에 보여줄 패널 추가
		JTabbedPane a = new JTabbedPane();
		a.setBackground(Color.BLACK);
		jtp.addTab("세번째", a);
		
		add(jtp);
	}
	
	public static void main(String[] args) {
		JtabbedPaneTest jtpt = new JtabbedPaneTest();
	}
}
