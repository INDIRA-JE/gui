package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class MyCanvas5 extends JPanel implements ActionListener {
	private int lightNumver = 0;
	
	public MyCanvas5() {
		setLayout(new BorderLayout());
		JButton btnCg = new JButton("traffic light turn on");
		btnCg.addActionListener(this);
		add(btnCg, BorderLayout.SOUTH);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// 기본틀 만듬
		g.drawOval(50, 50, 100, 100);
		g.drawOval(50, 150, 100, 100);
		g.drawOval(50, 250, 100, 100);
		
		// 색이 바뀌게 만들어줌
		if (lightNumver == 0) {
			g.setColor(Color.RED);
			g.fillOval(50, 50, 100, 100);
		} else if (lightNumver == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(50, 150, 100, 100);
		} else {
			g.setColor(Color.BLUE);
			g.fillOval(50, 250, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (++lightNumver > 2) {
			lightNumver = 0;
		}
		repaint();
	}
}

public class GraphicTest5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicTest5 frame = new GraphicTest5();
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
	public GraphicTest5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		add(new MyCanvas5());
		
//		버튼 만들어주고 위로 올린다
//		JButton btnCg = new JButton("traffic light turn on");
//		contentPane.add(btnCg, BorderLayout.SOUTH);
	}
}
