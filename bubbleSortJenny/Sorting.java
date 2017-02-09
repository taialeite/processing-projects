package bubbleSortJenny;
import processing.core.PApplet;
/**
 * 
 * @author TaiaLeite
 * Sorting Class is the Main class for the application. It initialize the Library
 * Processor and draw the shapes into the 
 * Screen connecting Display and BubbleSort class.
 */

public class Sorting extends PApplet {
	
	Display display;
	int [] arr = {9,7,6,2,3,1};

	public Sorting(){
		BubbleSort bubbleSort = new BubbleSort(arr);
		bubbleSort.start();

	}
	
	public void settings(){
		size(1000, 500);
	}

	public void setup(){
	display = new Display(this);
		
	}

	public void draw(){
		background(0, 122, 122, 122);
		display.show(arr);
		
	}
	public static void main(String[] args) {
		PApplet.main("bubbleSortJenny.Sorting");//Initializing PApplet
	}

}
