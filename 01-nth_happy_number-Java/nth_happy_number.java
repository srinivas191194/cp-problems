// # Write the function nthHappyNumber(n) which takes a non-negative integer 
// # and returns the nth happy number (where the 0th happy number is 1). 
// # Here are some test assertions for you:
// # assert(nthHappyNumber(0) == 1)
// # assert(nthHappyNumber(1) == 7)
// # assert(nthHappyNumber(2) == 10)
// # assert(nthHappyNumber(3) == 13)
// # assert(nthHappyNumber(4) == 19)
// # assert(nthHappyNumber(5) == 23)
// # assert(nthHappyNumber(6) == 28)
// # assert(nthHappyNumber(7) == 31)

import java.util.*;
class nth_happy_number {
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
	public int fun_nth_happy_number(int n){
		// your code goes here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(7);
		if(n == 0 || n == 1)
		  return arr.get(n);
		int number =10;
        while(arr.size()-1 !=n){
			if(isCheck(number))
				arr.add(number);
			number++;
			}
		return arr.get(n);	
	}
}