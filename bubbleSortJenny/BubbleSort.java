package bubbleSortJenny;

public class BubbleSort {
	int []arr;
	int j;
	boolean flag = true;//set flag to true to begin first pass
	int temp;//holding variable
/*
 * Bubble sort to sort Arrays.
 * @return array sorted
 */
 public void sort(int [ ] num){//Ascending Order 
		for (int i = 0; i < num.length - 1; i++) {
			 
			for (int j = 1; j < num.length - i; j++) {
				
				
				if (num[j - 1] > num[j]) {
					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
					
				}
				
			}
			
		}
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i] + ", ");
		}
	}
	

}
