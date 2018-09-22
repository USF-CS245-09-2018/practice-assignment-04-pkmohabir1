public class SelectionSort implements SortingAlgorithm{

	public int min(int i, int [] arr){
	
		int min = i; 
		
		for(int j= i+1; j< arr.length; j++){
		
			if(arr[j]<arr[min]){
				min = j;
			}//if
			
		}//for
		
		return min;
	}//min(int i, int [] arr)
	
	
	public void sort(int [] a){
		for(int i = 0; i<a.length-1; i++){
			swap(i,min(i,a),a);
		}
	}

	public void swap(int a, int b, int [] arr){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
}//main