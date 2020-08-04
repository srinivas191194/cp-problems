// nthAutomorphicNumbers(n) [20 pts]
// In mathematics, an automorphic number is a number whose square "ends" in the same digits as the 
// number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 
// 76 and 890625 are all automorphic numbers.
import java.util.*;
public class NthAutomorphicNumbers {
	public long nthAutomorphicNumbers(int n) {
		// Your code goes here
		int count = 0;
		long number = 0;
		long result = 0;
		while(count < n){
			if(isAutomorphic(number)){
			  result = number;
			  count = count+1;
			}
			number = number+1;
		}
		return result;
	}
	boolean isAutomorphic(long N){
		long sq = N*N;
		while(N > 0){
			if(N% 10 != sq % 10)
			  return false;
			N = N/10;
			sq = sq/10;  
		}
		return true;
	}
	
	 public static void main(String[] args){
	     NthAutomorphicNumbers obj = new  NthAutomorphicNumbers();
	     System.out.println(obj.nthAutomorphicNumbers(17));
	 }
}