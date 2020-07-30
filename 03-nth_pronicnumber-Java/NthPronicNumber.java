// nthPronicNumber(n) [20 pts]
// Write the function nthPronicNumber that takes a non-negative int n and returns the nth Pronic 
// Number. Pronic number is a number which is the product of two consecutive integers, that is, a 
// number n is a product of x and (x+1).
import java.util.*;
public class NthPronicNumber {
	public long nthPronicNumber(int n) {
		// Your code goes here
		int number = 0;
		int count = -1;
		long result = 0;
		while(count < n){
			if(isPronic(number)){
			  result = number;
			  count = count +1;
			}
			number = number+1;
		}
		return result;
	}
	public boolean isPronic(int number){
		double b = 1;
		double a = 1;
		double c = -number;
		double des = Math.sqrt(Math.pow(b,b) - (4 *a*c));
		double root1 = Math.floor((-b + des)/2);
		double root2 = (-b - des)/2;
		root2 = Math.abs(root2);
		if((root2 - root1) == 1.0)
		   return true;
		else 
		   return false;
	}
}