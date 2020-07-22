// median(a) (10 pts)
// Write the non-destructive function median(a) that takes a list of ints or floats and returns the median value, 
// which is the value of the middle element, or the average of the two middle elements if there is no single middle 
// element. If the list is empty, return None.

public class Median {
	public int median(double[] list) {
		// Your code goes here
		
		int len = list.length;
		if(len == 0)
		 return 0;
		double sum = list[len-1]+list[0];
		int result = (int) (sum/2);
		return result;
	}
}




