// # Write the function hasnoprimes(int[][] arr) that takes a 2d array arr of integers, 
// # and returns True if arr does not contain any primes, and False otherwise.


class hasnoprimes {
	public boolean fun_hasnoprimes(int[][] arr){
        for(int[] eachrow : arr){
          for(int j : eachrow){
			  if(isPrime(j)){
				  return false;
			  }
		  }
		}
		return true;
	}



	public boolean isPrime(int x){
		for(int i = 2; i < x-1; i++){
			if(x%i == 0)
			  return false;
		}
		return true;
	}
}