class BinarySearch {
	public int binary_search(int[] arr, int value){
        // Your code goes here
       int start = 0;
       int end = arr.length;
        while(start <= end){
                int mid = (start+end)/2;
                if(arr[mid] == value)
                   return mid;
                else if(arr[mid] < value)
                   start = mid +1;
                else if(arr[mid] > value)
                   end = mid-1;
        }
        return -1;
	}
}