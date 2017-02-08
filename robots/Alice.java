package robots;
import processing.core.PApplet;

public class Alice extends PApplet{
	
	float xAliceOne = 30; 
	float yAliceOne = 50;
	float xAliceTwo = 58;
	float yAliceTwo = 10;
	float xAliceThree = 86;
	float yAliceThree = 50;
	float angle;
	int counter = 1;
	PApplet parent;
	


public Alice(PApplet p){
 parent = p;

	
}


public void alice(){
	counter++;
	parent.fill (255, 128, 192);
	parent.stroke (255, 128, 192);  
 
	parent.translate(width/2, height/2);
	parent.rotate(counter*TWO_PI/360);
	parent.triangle (xAliceOne, yAliceOne, xAliceTwo, yAliceTwo, xAliceThree, yAliceThree);     

}
}