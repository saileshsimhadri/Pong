import java.awt.Graphics;

public class Player {
	
	private int up, down;
	private int x, y;
	private int deltay=0;
	public static final int WIDTH=10, HEIGHT=50;
	Pong game;
	
	public Player(int u, int d, int x, int y, Pong pong){
		up=u;
		down=d;
		this.x=x;
		this.y=y;
		game=pong;
	}
	
	public void update(){
		if(deltay>0 && y<game.getHeight()-HEIGHT-29||deltay<0&&y>0)
			y+=deltay;
	}
	
	public void paint(Graphics g){
		
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	public void move(int key){
		if(key==up){
			deltay=-1;
		}
		else if(key==down){
			deltay=1;
		}
	}
	
	public void stop(int key){
		if(key==up||key==down){
			deltay=0;
		}
		
	}

}
