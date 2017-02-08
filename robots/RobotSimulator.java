package robots;

import processing.core.PApplet;

public class RobotSimulator extends PApplet{
		Bob bob1;
		Charlie charlie1;
		Alice alice1;	
		
	public static void main(String[]args){
		PApplet.main("robots.RobotSimulator");
			
	}

	public void settings(){
		size (500,500);	
			
	}

	public void setup(){
		bob1 = new Bob(this);
		charlie1 = new Charlie(this);
		alice1 = new Alice(this);
//		
	}
	
	public void draw (){ 
		background (255);
		bob1.bob();
		charlie1.charlie();
		charlie1.keyPressed();
		alice1.alice();

	
	}
}
