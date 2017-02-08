package snow;
import processing.core.PApplet;

public class Snow extends PApplet {
	
	int quantity = 500;
	float[] xPosition = new float[quantity];
	float[] yPosition = new float[quantity];
	int[] flakeSize = new int [quantity];
	int minFlakeSize = 1;
	int maxFlakeSize = 5;
	int [] direction = new int [quantity];

	public static void main (String[]args){
		PApplet.main("snow.Snow");

	}
	public void settings(){
		size(1000, 500);
	}

	public void setup(){
		for(int i = 0; i < quantity; i++){
			xPosition[i] = random(0, width);
			yPosition[i] = random(0, height);
			flakeSize[i] = round(random(minFlakeSize, maxFlakeSize));
			direction[i] =  round(random(random(0,1)));

			}
	} 
	public void draw(){
		background(0);
		for(int i = 0; i < xPosition.length; i++){
			ellipse(xPosition[i], yPosition[i], flakeSize[i], flakeSize[i]);
			yPosition[i] += flakeSize[i];
			if(yPosition[i] > height + 5){
				yPosition[i] = -5;
			}
			if(direction[i] ==0){
				xPosition[i] += (float)flakeSize[i]/10;
			}else{
				xPosition[i] -= (float)flakeSize[i]/10;
			}
			if(xPosition[i] > width + flakeSize[i] || xPosition[i] < flakeSize[i] 
					|| yPosition[i] > height + flakeSize[i] ){
				xPosition[i] = random(0, width);
				yPosition[i] = -flakeSize[i];
				
			}
		}
		

	}
}

//if going right value of X increase if going to left value of X decrease 
