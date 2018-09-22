public class BubbleSort implements SortingAlgorithm{

	public void sort(int [] a){
			
			boolean swap = true;
			//int last_index = 0; 
			while(swap == true){
				swap = false;
				for(int i = 0; i<a.length-1; i++){
					if(a[i+1]<a[i]){
						swap(i, i+1, a);
						swap = true;
					}//if
				}//for
			//	++last_index;
			}//while
			
		}//sort(int [] a)



	public void swap(int a, int b, int [] array){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	}
	
}//main

