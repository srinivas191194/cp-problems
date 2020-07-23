import java.util.*;
class QuickSort {
	public int[] quicksort(int[] arr){
		// Your code goes here
		int start = 0;
		int end  = arr.length-1;
		quicksort1(arr,start,end);
		return arr;
	}
	public void quicksort1(int[] arr, int start, int end){
		if(start < end){
			int r = partition(arr,start,end);
			quicksort1(arr,start,r-1);
			quicksort1(arr,r+1,end);
		}
	}
	public int partition(int[] arr, int start, int end){
		int pivot = arr[start];
		int temp = start;
		while(start < end){
			while(arr[start] <= pivot){
				start++;
			}
			while(arr[end] > pivot){
				end--;
			}
			if(start < end){
				swap(arr,start,end);
			}
		}
		arr[temp] = arr[end];
		arr[end] = pivot;
		return end;
	}
	public void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}