// longestDigitRun(n) [20 pts]
// Write the function longestDigitRun(n) that takes a possibly-negative int value n and returns 
// the digit that has the longest consecutive 
// run, or the smallest such digit if there is a tie. So, longestDigitRun(117773732) returns 7 (
// because there is a run of 3 consecutive 7's), 
// as does longestDigitRun(-677886).
import java.util.*;
public class LongestDigitRun {
	public int longestDigitRun(int n) {
		// Your code goes here
		int result = 0;
		int prev = 0;
		int count1 = 1;
		int count  = 0;
		while(n >0  || n < 0){
			int a = n % 10;
			if(a == prev){
				count++;
				if(n > 0){
			     	if(count > count1){
				      count1 = count;
				      result = a;
				    }
			   }else{
				   if(count >= count1){
					   count1 = count;
					   result = a;
					}
				}
			}else{
				prev = a;
				count = 1;
				// result = a;
			}
			n = n/10;
		}
		if(result != 0 || count1 > 1)
		   return Math.abs(result);
 		else 
 		   return Math.abs(prev);   
	}
	public static void main(String[] args){
		LongestDigitRun  obj = new  LongestDigitRun();
		System.out.println(obj.longestDigitRun(117773732));
		System.out.println(obj.longestDigitRun(11455567));
		System.out.println(obj.longestDigitRun(12345));
		System.out.println(obj.longestDigitRun(-677886));
		System.out.println(obj.longestDigitRun(44332211));
		System.out.println(obj.longestDigitRun(3330001));
// 		System.out.println(obj.longestDigitRun(12345));
// 		System.out.println(obj.longestDigitRun(12345));
		
		
	}
}