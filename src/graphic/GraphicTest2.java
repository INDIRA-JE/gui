package graphic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// 도화지 역할
class MyCanvas2 extends JPanel implements MouseMotionListener {
	private int x = 50, y = 50;
	
	public MyCanvas2() {
		addMouseMotionListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
		// 도화지 위에 무엇인가를 그릴 때 사용되는 메소드
//		g.drawString("윈도우 창을 줄이거나 늘려 보세요", 50, 80);
//		System.out.println("paintComponent 메소드 실행");
		
		// 별표를 그려달라는 메소드
		g.drawString("*", x, y);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}

public class GraphicTest2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicTest2 frame = new GraphicTest2();
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
	public GraphicTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// 붙이기
		add(new MyCanvas2());
	}

}