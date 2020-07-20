// hasDuplicates(L) [15 pts]
// Write the function hasDuplicates(L) that takes a 2d list L of arbitrary values, and returns True if L 
// contains any duplicate values (that is, 
// if any two values in L are equal to each other), and False otherwise.
import java.util.*;
public class HasDuplicates {
	public boolean hasDuplicates(int[][] arr) {
		// Your code goes here
		HashSet<Integer> object = new HashSet<Integer>();
		for(int i = 0 ; i < arr.length;i++){
			for(int j = 0 ; j < arr.length;j++){
				if(object.contains(arr[i][j]))
					return true;
				else  
				   object.add(arr[i][j]);	
			}
		}
		return false;
	}
}