// # Write the function nthUglyNumber that takes a non-negative int n and returns the nth Ugly Number. 
// # Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 
// # 9, 10, 12, 15 shows the few ugly numbers. By convention, nthUglyNumber(0) will give 1.


import java.util.*;
class nth_uglynumber {
	public int fun_nth_uglynumber(int n){
	   int count = -1;
	   int number = 1;
	   int result = 0;
	   while(count < n){
		if(isUgly(number)){
			result = number;
			count = count +1;
		}
		number = number +1;
	}
	return result;
}

	public boolean isUgly(int number){
		int a = check(number , 2);
		a = check(a,3);
		a = check(a,5);
		return (a == 1) ? true : false;
	}
	public int check(int number , int b){
		while(number % b == 0){
			number = number / b;
		}
		return number;
	}
}