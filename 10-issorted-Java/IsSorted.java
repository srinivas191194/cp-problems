// isSorted(a) (10 Pts)
// Write the function isSorted(a) that takes a list of numbers and returns True if the list 
// is sorted (either smallest-first or largest-first) and False otherwise. Your function 
// must only consider each value in the list once (so, in terms of big-oh, which we will 
// learn soon, it runs in O(n) time, where n=len(a)), and so in particular you may not sort 
// the list.
import java.util.*;
public class IsSorted {
	public boolean isSorted(double[] list) {
		// Your code goes here
		int s = list.length;
		if(s == 1 || s == 0)
		  return true;
       if(list[0] <= list[1]){
		   for(int i = 1; i < list.length;i++){
			   if(list[i] < list[i-1])
			     return false;
		   }
		   return true;
	   }
	   if(list[0] > list[1]){
		   for(int i = 1; i < list.length; i++){
			   if(list[i] > list[i-1])
			     return false;
		   }
		   return true;
	   }


		



		return false;
	}
}