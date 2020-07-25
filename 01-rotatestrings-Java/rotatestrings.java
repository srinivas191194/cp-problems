// # Write the function rotatestring(s, k) that takes a string s and a possibly-negative integer k. 
// # If k is non-negative, the function returns the string s rotated k places to the left. 
// # If k is negative, the function returns the string s rotated |k| places to the right. So, for example:
// # assert(rotateString('abcd',  1) == 'bcda')
// # assert(rotateString('abcd', -1) == 'dabc')
import java.util.*;
class rotatestrings {
	public String fun_rotatestrings(String s, int n){
		char[] arr = s.toCharArray();
		if(n > 0){
             for(int i = 0 ; i < n; i++){
				 char  first = arr[0];
				 int j;
				 for(j = 1; j < arr.length; j++){
					 arr[j-1] = arr[j];
				 }
				 arr[j-1] = first;
			 }
			
		} 
		else{
			 n  = -1*n;
			 for(int i = 0; i < n ; i++){
				 char last = arr[arr.length -1];
				 for(int j = arr.length-2 ; j >= 0; j--){
					 arr[j+1] = arr[j];
				 }
				 arr[0] = last;
			 }

		}
		String result = new String(arr);
		return result;
	}
}