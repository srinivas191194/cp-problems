// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2
// # Write the function fun_nth_additive_prime(n) that takes a non-negative int n 
// # and returns the nth Additive Prime, which is a prime number such that 
// # the sum of its digits is also prime. For example, 113 is prime and 1+1+3==5 and 5 
// # is also prime, so 113 is an Additive Prime. fun_nth_additive_prime(0) returns 2

import java.util.*;
public class nth_additive_prime {
	public int fun_nth_additive_prime(int n){
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(2);
// 		if(n == 0)
// 		  return 2;
		if(n > 0){
		int count = 3;
		while(obj.size() -1 != n){
		  if (isCheck(count)){
			int a = 0;
         int num = count;
			while(num > 0){
			  a += num%10;
			  num = num/10;
			 // System.out.println(num);
			}
			if(isCheck(a)){
				obj.add(count);
            // System.out.println(count);
            if(obj.size() -1 == n){
               int x = obj.size();
				   return obj.get(x-1);
             }
			}
           // count = count + 1;
		}
         count = count +1;
	}
	}
	else {
	    return 2;
	}
	return 1;
	}
	public boolean isCheck(int n){
      int count=0;
		for(int i = 1 ; i <= n; i++){
			if(n % i == 0)
			  count++;
		}
      if(count==2) 
		  return true;
      else 
        return false;
	}
	// public static void main(String[] args){
	//     nth_additive_prime obj = new nth_additive_prime();
	//    // System.out.println(obj.fun_nth_additive_prime(0));
	//    // System.out.println(obj.fun_nth_additive_prime(1));
	//     System.out.println(obj.fun_nth_additive_prime(5));
	//     System.out.println(obj.fun_nth_additive_prime(7));
	//    // System.out.println(obj.fun_nth_additive_prime(20));
	//    // System.out.println(obj.fun_nth_additive_prime(25));
	// }
}