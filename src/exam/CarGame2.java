package exam;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel2() {	// JPanel은 포커ㅓ스를 가질 수 없음
		URL url = getClass().getResource("car.gif");
		try {
			img = ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {
				// 좌표 설정
				img_x = e.getX();
				img_y = e.getY();
				repaint();	// 써줘야 차가 이동 됨
			}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
		
		});
		// 포커스 요청하기
		this.requestFocus();
		setFocusable(true);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);	// 알아서 호출 된다(내가 직접 호출 할 수 없다)
		g.drawImage(img, img_x, img_y, null);
	}
}

public class CarGame2 extends JFrame {
	public CarGame2() {
		setTitle("자동차 움직이기");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());
		
	}
	
	public static void main(String[] args) {
		CarGame2 car = new CarGame2();
		car.setVisible(true);
	}
}
