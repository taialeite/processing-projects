package bubbleSort;
import processing.core.PApplet;



public class BubbleView extends PApplet{
	
	//int arr[] = {80,20,90,30};
	//BubbleModel bubbleModel = new BubbleModel();
	int [] ar = {4,5,1,8};
	
	public void settings(){
		size(1000, 500);
	}

	public void setup(){
		
	}

	public void draw(){
		background(0, 122, 122, 122);
		drawRect(ar);
	}

	public void drawRect(int [] arr){
		
		float x = 30;
		float y = 90;
		float height = 55;
		
		for (int i = 0; i < arr.length; i++){
			rect(x, y, arr[i] * 90, height); //move the 550
			y +=  60;	
		}
	
	}

}
