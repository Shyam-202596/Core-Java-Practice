import java.util.*;
//6. Write a program to sort an integer array without using API methods?

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2, 10, 89, 11, 7};
        sort(arr); 
	}
	//bubble sort
	static void sort(int[] arr){
	    int n = arr.length;
	    for(int i = 0; i < n-1; i++){
	        for(int j = 0; j < n-1-i; j++){
	            if(arr[j] > arr[j + 1]){
	                swap(arr, j, j+1);
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr, int i, int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
    }
}
