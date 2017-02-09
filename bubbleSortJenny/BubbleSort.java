package bubbleSortJenny;
/**
 * 
 * @author TaiaLeite BubbleSort Class will extend Thread. It will stop the
 *         BubbleSort in each interaction to show with the bars from Display how
 *         the interaction(swap) is been done.
 *
 */

public class BubbleSort extends Thread {
	int[]	arr;
	int		j;
	boolean	flag	= true;	// set flag to true to begin first pass
	int		temp;			// holding variable

	/**
	 * BubbleSort Constructor will initialize the variable ARR
	 * 
	 * @param arr
	 */
	public BubbleSort(int[] arr) {
		super();
		this.arr = arr;
	}
	/**
	 * run() method will start the thread
	 */
	public void run() {
		// sleep();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					sleep();
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	/**
	 * sleep() will stop the bubble in each interaction working with Display
	 * class.
	 */
	public void sleep() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
	

	}

}
