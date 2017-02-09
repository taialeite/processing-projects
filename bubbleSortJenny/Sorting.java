package bubbleSortJenny;
import processing.core.PApplet;

public class Sorting extends PApplet {
	
	Display display;
	int [] arr = {2,7,1,10,3,9};
	
	public static void main(String[] args) {
		PApplet.main("bubbleSortJenny.Sorting");//Initializing PApplet
	}
	public Sorting(){
		BubbleSort bubbleSort = new BubbleSort(arr);
		bubbleSort.start();
		
		
	}
	
	public void settings(){
		size(1000, 500);
	}

	public void setup(){
	background(0, 122, 122, 122);
	display = new Display(this);
		
	}

	public void draw(){
		display.show(arr);
		
	}


}
