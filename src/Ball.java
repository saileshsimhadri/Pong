import java.awt.Graphics;

public class Ball {
	
	private Pong game;
	private int x,y,deltax,deltay;
	private static final int WIDTH=10, HEIGHT=10;
	
	public Ball(Pong pong)
	{
		game=pong;
		x=game.getWidth()/2;
		y=game.getHeight()/2;
		deltax=2;
		deltay=2;
		
		
	}
	
	public void update(){
		x+=deltax;
		if(y<0||y>game.getHeight()-HEIGHT-29){
			deltay=deltay*-1;
		}
		if(x<0||x>game.getWidth()-WIDTH-29){
			deltax=deltax*-1;
		}
		y+=deltay;
		
	}
	
	public void paint(Graphics g){
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
}
