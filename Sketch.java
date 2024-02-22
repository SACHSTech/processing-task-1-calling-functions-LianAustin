import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
  * A program that uses java processing to create a remote control
  * @author: Austin L
  */
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Sets background to light green
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Create cshapes
    stroke(255);
    rect(295, 225, 30, 200);

    stroke(255);
    square(200, 350, 220);
    fill(0, 0, 0);

    stroke(255);
    fill(255, 0, 0);
    ellipse(310, 460, 150, 150);


  }
}