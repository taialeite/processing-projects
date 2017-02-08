package bubbleSort;
import processing.core.PApplet;


/**
 *@author TaiaLeite
 *Controller will connect BubbleModel and Bubble View
 *Initialize the PApplet
 *Create a new Bubble Sort object
 *Sort it
 *Display it as it is sorted (without breaking up the sort algorithm)
 */
public class BubbleController extends PApplet {


	BubbleModel bubbleModel = new BubbleModel();
	BubbleView bubbleView = new BubbleView();
	
	
	public void connecting(int [] arr){

		bubbleModel.sort(arr);
		//bubbleView.drawRect();
		



	}


}
