// # Background: The Fibonacci numbers are defined by F(n) = F(n-1) + F(n-2). 
// # There are different conventions on whether 0 is a Fibonacci number, 
// # and whether counting starts at n=0 or at n=1. Here, we will assume that 
// # 0 is not a Fibonacci number, and that counting starts at n=0, 
// # so F(0)=F(1)=1, and F(2)=2. With this in mind, write the function 
// # nthfibonaccinumber(n) that takes a non-negative int n and returns the nth Fibonacci number.


class nth_fibonacci {
	int first =0 ;
	int second = 1;
	int temp = 1;
	public int fun_nthfibonaccinumber(int n){
		// your code goes here
		if(n == 0 || n==1){
		  int temp1 = first;
		  int temp2 = second;
		  first = 0;
		  second = 1;
		  temp = 1;
		  return temp1+temp2;
		}
		first = second;
		second = temp;
		temp = first+second;
		return fun_nthfibonaccinumber(n-1);
	}
}