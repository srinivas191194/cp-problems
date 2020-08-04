// nthAutomorphicNumbers(n) [20 pts]
// In mathematics, an automorphic number is a number whose square "ends" in the same digits as the 
// number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 
// 76 and 890625 are all automorphic numbers.
import java.util.*;
public class NthAutomorphicNumbers {
	public long nthAutomorphicNumbers(int n) {
		// Your code goes here
		int count = -1;
		long result = 0;
		long number = 0;
		while(count < n){
		if(isAutomorphic(number)){
			count = count+1;
			result = number;
		}
		number = number +1;
		}
		return result;
		
	}
	public boolean isAutomorphic(long number){
		Double power = Math.pow(number,2);
		long temp = number;
		int result = 0;
		int place = 1;
		while(power > 0){
		   double a = power % 10;
		   result =(int) a*place+result;
		   if(result == temp)
			  return true;
		   power = power /10;
		   place = place*10;	  
		}
		return false;
	}
	public static void main(String[] args){
	    NthAutomorphicNumbers obj = new  NthAutomorphicNumbers();
	    System.out.println(obj.isAutomorphic(890625));
	}
}