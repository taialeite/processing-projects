package bubbleSort;
import processing.core.PApplet;

/**
 *@author TaiaLeite
 *BubbleTest start the application
 */

public class BubbleTest extends PApplet{
	
	public static void main(String[] args) {	
		int [] ar = {4,5,1,8};
		
		BubbleController bubbleController  = new BubbleController();
		bubbleController.connecting(ar);
		
		PApplet.main("bubbleSort.BubbleView");//Initializing PApplet

	}

}
