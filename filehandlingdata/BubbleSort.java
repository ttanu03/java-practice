package filehandlingdata;


	public class BubbleSort {

	    public static void main(String[] args) {

	        int[] arr = {3,60,35,2,45,320,5}; 
//chack adjacnet element and swap them if 
	        for (int i = 0; i < arr.length - 1; i++) {

	            for (int j = 0; j < arr.length - 1 - i; j++) {

	                if (arr[j] > arr[j + 1]) {

	                    // swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted array:");

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


