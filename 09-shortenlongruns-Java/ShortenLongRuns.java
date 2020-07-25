// shortenLongRuns(L, k) [15 pts]
// Write the non-destructive function shortenLongRuns(L, k) that takes a list L and a positive integer k, and 
// non-destructively returns a similar list, only without any run of k consecutive equal values in L. This means that 
// any values that would otherwise produce a consecutive run of k elements are not present. 
// For example: 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 2) == [2, 3, 5, 3]) 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 3) == [2, 3, 5, 5, 3]) 
// Note: your function may not just create a copy of L and call the destructive version of this function (below) on 
// that copy and return it. Instead, you must directly construct the result here.
// shortenLongRuns(L, k) [15 pts]
// Write the non-destructive function shortenLongRuns(L, k) that takes a list L and a positive integer k, and 
// non-destructively returns a similar list, only without any run of k consecutive equal values in L. This means that 
// any values that would otherwise produce a consecutive run of k elements are not present. 
// For example: 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 2) == [2, 3, 5, 3]) 
// assert(shortenLongRuns([2, 3, 5, 5, 5, 3], 3) == [2, 3, 5, 5, 3]) 
// Note: your function may not just create a copy of L and call the destructive version of this function (below) on 
// that copy and return it. Instead, you must directly construct the result here.
import java.util.*;
public class ShortenLongRuns {
	public int[] shortenLongRuns(int[] arr, int k) {
		// Your code goes here
		ArrayList<Integer> obj = new ArrayList<Integer>();
		int len = arr.length;
		int i;
		for( i = 0; i < len; i++){
			int count = 0;
			for(int j = i ; j < len; j++){
				if(arr[j] == arr[i])
				   count = count +1;
				else   
			        break;	  
			}
		if(count < k)
		  obj.add(arr[i]);
// 		return obj;
		}
		int[] result = new int[obj.size()];
		for(int l =0; l < obj.size(); l++ ){
		    result[l] = obj.get(l);
		}
		return result;
	}
	public static void main(String[] args){
		ShortenLongRuns  obj = new ShortenLongRuns();
		int[] arr = {2,3,5,5,5,3};
		System.out.println(Arrays.toString(obj.shortenLongRuns(arr,2)));
	}
}