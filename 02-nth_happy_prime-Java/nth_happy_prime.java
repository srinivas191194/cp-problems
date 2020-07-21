// # A happy prime is a number that is both happy and prime. 
// # Write the function nthHappyPrime(n) which takes a non-negative integer 
// # and returns the nth happy prime number (where the 0th happy prime number is 7).

import java.util.*;
class nth_happy_prime {
		public boolean isCheck(int n){
			HashSet<Integer> object = new HashSet<Integer>();
			object.add(n);
			int result = n;
			while(result != 1){
				int temp = result;
				result =0;
				while(temp > 0){
					result += Math.pow(temp%10,2);
					temp = temp/10;
				}
				if(object.contains(result))
					 return false;
				
				object.add(result);
			 }
			 return true;
		}
	public boolean isPrime(int n){
		for(int i = 2 ; i < n-1; i++)
		   if(n %i == 0)
			 return false;
		return true;
	}
		
	public int fun_nth_happy_prime(int n){
		// your code goes here
		ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(7);
			if(n == 0)
			  return arr.get(n);
			int number =10;
			while(arr.size()-1 !=n){
				if(isCheck(number))
				  if(isPrime(number))
					 arr.add(number);
				number+=1;
				}
			return arr.get(n);
			
	}
}
