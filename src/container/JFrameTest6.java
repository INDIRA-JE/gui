package container;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameTest6 extends JFrame {
	public JFrameTest6() {
		// 해상도를 가져와서 중간을 찾는다
		setTitle("여섯번째 프로그램");
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// 화면 중간에 JFrame 띄우기
		Toolkit kt = Toolkit.getDefaultToolkit();
		Dimension screenSize = kt.getScreenSize();

		int x = (screenSize.width - getWidth()) / 2;
		int y = (screenSize.height - getHeight()) / 2;
		setLocation(x, y);

		// 아이콘 변경
		URL url = getClass().getResource("icons8.gif");
		setIconImage(new ImageIcon(url).getImage());
	}

	public static void main(String[] args) {
		// 컨테이너 생성
		JFrameTest6 f = new JFrameTest6();
	}
}
