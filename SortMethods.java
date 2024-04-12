// Connor Nylund
// 4/3/24
// O'Neill
// CSC 111


public class SortMethods{

	public static void selectionSort (int[] intArray){// Sorting using selectionn sort.

		for(int last = intArray.length - 1; last > 0; last--){
			int indexOfLargest = last;
			
			for(int i = 0; i < last; i++){
				if (intArray[i] > intArray[indexOfLargest]){
					indexOfLargest = i;
				} 
			} 
			
			int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
			
			System.out.println("Pass " + (intArray.length - last));			
		} 
	}
    // End of the seletion sort method.


    public static int selectionSortComparisons(int[] intArray){// Keeping track of comparisons of selectionsort 
        
        int comparisons = 0;
        
        for(int last = intArray.length - 1; last > 0; last--){
			int indexOfLargest = last;

			for(int i = 0; i < last; i++){
				if (intArray[i] > intArray[indexOfLargest]){
					indexOfLargest = i;
				} 
                comparisons++;
			} 

            int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
			
		}
        return comparisons;
    }	
    // End of selectionSortComparisons method 


	public static int bubbleSortandComparisons(int[] bubble) {// bubble sort and and the comparisons 
        int comparisons = 0;
        int n = bubble.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++; 
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
        return comparisons;
    }
    // End of bubbleSortandComparisons method


    private static int merge(int[] arr, int left, int middle, int right) {
        int comparisons = 0;
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] A = new int[n1];
        int[] D = new int[n2];

        for (int i = 0; i < n1; ++i)
            A[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            D[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            comparisons++; 
            if (A[i] <= D[j]) {
                arr[k] = A[i];
                i++;
            } else {
                arr[k] = D[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = A[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = D[j];
            j++;
            k++;
        }
        return comparisons;
    }

    private static int mergeSort(int[] arr, int left, int right) {// merge sort method
        int comparisons = 0;
        if (left < right) {
            int middle = (left + right) / 2;

            comparisons += mergeSort(arr, left, middle);
            comparisons += mergeSort(arr, middle + 1, right);
            comparisons += merge(arr, left, middle, right);
        }
        return comparisons;
    }
    public static int mergeSortComparisons(int[] intArray) {// merge sort comparisons 
        return mergeSort(intArray, 0, intArray.length - 1);
    }
	
	public static void printArray(int[] intArray){// prints the arry 
		System.out.print("Array==> ");
		for(int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		} 
		System.out.println(" ");	
	} 
    // End of printArray method
	
	public static int[] randomIntArray(int n, double range){// randoms ints for the array 
		int[] intArray = new int[n];
		
		for(int i = 0; i < n; i++){
			intArray[i] = (int)(Math.random() * range);
		} 		
		return intArray;
		
	} 
    // and of randomIntArray method
	
	public static int[] copyArray(int[] intArray){// copys the array for each method
		int[] copyArray = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++){
			copyArray[i] = intArray[i];
		} 
		return copyArray;
	} 
    // End of copyArray method 
} 