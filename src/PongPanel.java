import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PongPanel extends JPanel implements KeyListener, ActionListener{
	
	private Player player1, player2;
	private Ball ball;
	private int score1=0, score2=0;
	private Pong game;
	
	public PongPanel(Pong pong){
		game=pong;
		player1 = new Player(KeyEvent.VK_UP, KeyEvent.VK_DOWN, (game.getWidth()-40), game.getHeight()/2, game);
		player2 = new Player(KeyEvent.VK_W, KeyEvent.VK_S, 40, game.getHeight()/2, game);
		ball = new Ball(game);
		setFocusable(true);
		addKeyListener(this);
		Timer timer = new Timer(5, this);
		timer.start();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		player1.move(e.getKeyCode());
		player2.move(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		player1.stop(e.getKeyCode());
		player2.stop(e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
	public void update(){
		player1.update();
		player2.update();
		ball.update();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0; i<game.getWidth(); i+=50){
			g.fillRect(game.getWidth()/2, i, 10, 25);
		}
		player1.paint(g);
		player2.paint(g);
		ball.paint(g);
		
	}

}
