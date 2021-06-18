import processing.core.PApplet;

public class Main extends PApplet{

	// Create the Ball object
	Ball b = new Ball(this);
	
	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		background(255);
		b.grow();
		b.display();
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
	}
}