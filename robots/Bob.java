package robots;
import processing.core.PApplet;

public class Bob extends PApplet{

	float xBobOne = 50;
	float yBobOne = 150;
	float xBobTwo = 78;
	float yBobTwo = 100;
	float xBobThree = 106;
	float yBobThree = 150;
	float speedBobX = random (0, 10);
	float speedBobY = random (0, 10);
	PApplet parent;

	public  Bob(PApplet p){
		parent = p;

	}

	public void bob(){
		parent.fill (0, 128, 128);
		parent.stroke (0, 128, 128);
		parent.triangle (xBobOne, yBobOne, xBobTwo, yBobTwo, xBobThree, yBobThree); 

		xBobOne = xBobOne + speedBobX;
		xBobTwo = xBobTwo + speedBobX;
		xBobThree = xBobThree + speedBobX;

		yBobOne = yBobOne+ speedBobY;
		yBobTwo = yBobTwo + speedBobY;
		yBobThree = yBobThree + speedBobY;

		if ((xBobOne > 500 || xBobTwo > 500 || xBobThree > 500)|| (xBobOne < 0 || xBobTwo < 0 || xBobThree < 0)){
			speedBobX = -1 * speedBobX;
		}

		if ((yBobOne > 500|| yBobTwo > 500 || yBobThree > 500)|| (yBobOne < 0 || yBobTwo < 0 || yBobThree < 0)){
			speedBobY = -1 * speedBobY;
		} 
	}
}