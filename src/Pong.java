import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame {
	
	public static final int WIDTH=700, HEIGHT=450;
	
	private PongPanel panel;
	
	public Pong(){
		setSize(WIDTH, HEIGHT);
		panel = new PongPanel(this);
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Pong");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(panel);
//		System.out.println(getWidth());
		
	}
	
	public PongPanel getPanel(){
		return panel;
	}

}
