// # Write the function nthSmithNumber that takes a non-negative int n 
// # and returns the nth Smith number, where a Smith number is a composite (non-prime) 
// # the sum of whose digits are the sum of the digits of its prime factors (excluding 1). 
// # Note that if a prime number divides the Smith number multiple times, its digit sum 
// # is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is 
// # counted twice, thus making 4 a Smith Number.
// # so fun_nthsmithnumber(0) should return 4
// # so fun_nthsmithnumber(1) should return 22

// # Write the function nthSmithNumber that takes a non-negative int n 
// # and returns the nth Smith number, where a Smith number is a composite (non-prime) 
// # the sum of whose digits are the sum of the digits of its prime factors (excluding 1). 
// # Note that if a prime number divides the Smith number multiple times, its digit sum 
// # is counted that many times. For example, 4 equals 2**2, so the prime factor 2 is 
// # counted twice, thus making 4 a Smith Number.
// # so fun_nthsmithnumber(0) should return 4
// # so fun_nthsmithnumber(1) should return 22

import java.util.*;
public class nth_smithnumber {
	public int fun_nth_smithnumber(int n) {
	    int count = -1;
        int result = 0;
        int number = 2;
	    while(count != n){
		if(isnotprime(number)){
		    int sumofgivenumber = isSum(number);
		  //  System.out.println(sumofgivenumber);
			int sumofprime = primefactors(number);
 			// System.out.println(sumofprime);
			if(sumofgivenumber == sumofprime){
                 result = number;
                 count = count+1;
			}
		}
		
		number = number + 1;
		// System.out.println(number);
	} 
	return result;
	}
	public int isSum(int n){
		int result = 0;
		while(n >= 1){
			result += n % 10;
			n = n/10;
		}
		return result;
	}


	public boolean isnotprime(int n){
		int count = 0; 
		for(int i = 1; i <= n;i++){
			 if(n % i == 0)
			   count= count +1;
		}
		if(count >= 3)
		   return true;
		else 
			return false;
		
	}
	public int primefactors(int n){
		int factorsvalue = 0;
		int temp = n;
		while(temp > 1){
		  //  System.out.println(temp);
			for(int i = 2 ; i <= n/2 ; i++){
				if(isnotprime(i) == false){
				if(temp % i == 0){
					factorsvalue += isSum(i);
				// 	System.out.println("sai " + factorsvalue);
					temp = temp /i;
				// 	System.out.println("sai " + temp);
					break;
				}
			  }
			}
		}
		return factorsvalue;
	}
	// public static void main(String[] args){
	//     nth_smithnumber obj = new nth_smithnumber();
	//     System.out.println(obj.fun_nth_smithnumber(5));
	// }

}
