// # Write the function fun_nth_palindromic_prime(n) that takes a non-negative int n 
// # and returns the nth palindromic Prime, which is a palidrome number such that 
// # it is also a prime. For example, 313 is a palindrome and it is prime 
// # so 313 is an palindrome Prime. fun_nth_palindrome_prime(0) returns 2

import java.util.*;
class nth_palindromic_prime {
	public int fun_nth_palindromic_prime(int n){
		ArrayList<Integer> obj = new ArrayList<Integer>();
// 		obj.add(2);
// 		if(n == 0)
// 		  return 2;
		if(n >= 0){
		int count = 2;
		while(obj.size() -1 != n){
		  if (isCheck(count)){
			if(isPalindrome(count)){
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
	public boolean isPalindrome(int n){
		
		if(n >= 10){
		String check = "";
		int backup = n;
          while(n > 0){
			  check += (char) n%10;
			  n = n/10;
		  }
		  int temp = Integer.parseInt(check);
		  if(temp == backup)
			return true;
		  else 
		    return false;
		}
		return true;
	}
}
