// Here we will rewrite the previous function to be destructive. This version must not just call the nondestructive 
// version from above and then clear and replace the values in the original list. Instead, you must traverse the list 
// once and make the changes to the list as you go. With that in mind, write the destructive function shortenLongRuns(
// L, k) that takes a list L and a positive integer k, and destructively modifies L by removing any values in L that 
// would otherwise produce a run of k consecutive equal values in L. 
// For example:
// L = [2, 3, 5, 5, 5, 3] 
// shortenLongRuns(L, 2)
// assert(L == [2, 3, 5, 3])
// And: 
// L = [2, 3, 5, 5, 5, 3]
// shortenLongRuns(L, 3)
// assert(L == [2, 3, 5, 5, 3])
import java.util.*;
public class DestructiveShortenLongRuns {
	public int[] destructiveShortenLongRuns(int[] arr, int k) {
		// Your code goes here
		ArrayList<Integer> obj = new ArrayList<Integer>();
		int i;
		for(i = 0; i < arr.length;i++){
			int count = 0;
			for(int j = i; j < arr.length; j++){
				if(arr[i] == arr[j])
				  count = count +1;
				else 
				   break;
			}
			if(count < k)
			 obj.add(arr[i]);
		}
		int[] result = new int[obj.size()];
		for(int l = 0 ; l < obj.size(); l++)
			result[l] = obj.get(l);
		return result;	
		
	}
}