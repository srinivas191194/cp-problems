// Recursion-Only powersOf3ToN(n) [15 pts]
// Write the function powersOf3ToN(n) that takes a possibly-negative float or int n, and returns a list of the 
// positive powers of 3 up to and including n. As an example, powersOf3ToN(10.5) returns [1, 3, 9]. If no such powers 
// of 3 exist, you should return the empty list. You may not use loops/iteration in this problem. 
import java.util.*;
public class PowersOf3ToN {
	public int[] powersOf3ToN(double n) {
		// Your code goes here
        int value = (int) n;
		if(value <= 0)
		  return new int[0];
		ArrayList<Integer>  obj = new ArrayList<Integer>();
		recursion(3,0,value,obj);
		if(obj.size() > 0){
			int[] arr = new int[obj.size()];
			for(int i = 0; i < arr.length; i++){
				arr[i] = obj.get(i);
			}
			return arr;
		}
		return new int[0];
	}
	public void recursion(int m,int power,int n, ArrayList<Integer> obj){
		if((int)Math.pow(m,power) > n)
		   return;
		obj.add((int)Math.pow(m,power));
		recursion(m,power+1,n,obj);
	}
}