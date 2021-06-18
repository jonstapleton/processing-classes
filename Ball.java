import processing.core.PApplet;

public class Ball {
    // Create instance variables
    int size = 0;

    // this pattern needs to be in every class
    private PApplet canvas;
    public Ball(PApplet s) {
        canvas = s;
    }

    public void grow() {
        size += 1;
    }
    public void display() {
        canvas.circle(250, 250, size);
    }

}
