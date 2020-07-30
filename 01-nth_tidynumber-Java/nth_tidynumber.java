// # Write the function nthTidyNumber that takes a non-negative int n and returns the nth Tidy Number. 
// # A tidy number is a number whose digits are in non-decreasing order.
// # fun_nth_tidynumber(0) = 1
// # fun_nth_tidynumber(1) = 2
// # fun_nth_tidynumber(5) = 6
// # fun_nth_tidynumber(15) = 17
// # fun_nth_tidynumber(35) = 46



import java.util.*;
class nth_tidynumber {
	public int fun_nth_tidynumber(int n){
	int result = 0;
	int count = -1;
	int number = 1;
	while(count < n){
        if(isTidy(number)){
			result = number;
			count = count+1;
		}
		number = number +1;
	}
	return result;
	}
	public boolean isTidy(int number){
		int prev = number % 10;
		int temp = number/10;
		while(temp > 0){
			int current = temp % 10;
			if(current > prev){
               return false;
			}
			prev = current;
			temp = temp/10;
		}
		return true;
	}
}