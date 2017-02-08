package robots;

import processing.core.PApplet;

public class Charlie extends PApplet{
	
	float xCharlieOne = 30; 
	float yCharlieOne = 150;
	float xCharlieTwo = 58;
	float yCharlieTwo = 100;
	float xCharlieThree = 86;
	float yCharlieThree = 150;
	PApplet parent;
	float speedCharlie = 1;

public Charlie(PApplet p){
	parent = p;	
}

public void charlie(){
	parent.fill (255, 128, 0);
	parent.stroke (255, 128, 0);
	parent.triangle (xCharlieOne, yCharlieOne, xCharlieTwo, yCharlieTwo, xCharlieThree, yCharlieThree);
	

}

public void keyPressed() {

	if (parent.key == CODED) {
		if (parent.keyCode == UP) {
			yCharlieOne = yCharlieOne - speedCharlie;
			yCharlieTwo = yCharlieTwo - speedCharlie;
			yCharlieThree = yCharlieThree - speedCharlie;
    
		} else if (parent.keyCode == DOWN) {
			yCharlieOne = yCharlieOne + speedCharlie;
			yCharlieTwo = yCharlieTwo + speedCharlie;
			yCharlieThree = yCharlieThree + speedCharlie; 
      
		} else if (parent.keyCode == RIGHT){
			xCharlieOne = xCharlieOne + speedCharlie;
			xCharlieTwo = xCharlieTwo + speedCharlie;
			xCharlieThree = xCharlieThree + speedCharlie;     
      
		} else if (parent.keyCode == LEFT){ 
			xCharlieOne = xCharlieOne - speedCharlie;
			xCharlieTwo = xCharlieTwo - speedCharlie;
			xCharlieThree = xCharlieThree - speedCharlie;     
              
		}
	}
}
}