package bubbleSortJenny;

import processing.core.PApplet;
/**
 * @author TaiaLeite
 * Class Display is responsible for creating the bars according to the 
 * Array
 */

public class Display extends PApplet{

	float height;
	PApplet parent;//This variable gives accesses to PApplet Class
	
	public Display(PApplet p){	
	height = 55;
	parent = p;
	}
	/**
	 * 
	 * @param arr takes the array sorted and display the bars
	 */
	public void show(int [] arr){
		float x = 30;
		float y = 90;
		
		for (int i = 0; i < arr.length; i++){
			parent.fill(204, 102, 0);
			parent.rect(x, y, arr[i] * 90, height); 
			y +=  70;	
		}
	
	}

}
