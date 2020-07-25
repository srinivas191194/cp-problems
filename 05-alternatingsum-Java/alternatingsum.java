// # Write the function alternatingSum(a) that takes a list of numbers and returns the 
// # alternating sum (where the sign alternates from positive to negative or vice versa). 
// # For example, alternatingSum([5,3,8,4]) returns 6 (that is, 5-3+8-4). If the list is empty, return 0.

import java.util.*;
class alternatingsum {
	public int fun_alternatingsum(int[] s){
		boolean flag1 = true;
		// boolean flag2 = false;
		int result = 0;
		int len = s.length; 
	    if(len > 0){
			for(int i = 0; i < len; i++){
				if(flag1 == true){
					result += s[i];
					flag1 = false;
					// flag2 = true;
				}
				else{
				   result += (-1*s[i]);
				   flag1 = true;
				}
			}
			return result;
		}
		else{
			return result;
		}
	}
}