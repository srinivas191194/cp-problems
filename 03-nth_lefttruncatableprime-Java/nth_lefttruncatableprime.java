// # Write the function nthLeftTruncatablePrime(n).
// # A Left-truncatable prime is a prime which in a given base (say 10) does not contain 0 
// # and which remains prime when the leading (left) digit is successively removed. 
// # For example, 317 is left-truncatable prime since 317, 17 and 7 are all prime. 
// # There are total 4260 left-truncatable primes.
// # So nthLeftTruncatablePrime(0) retunearestKaprekarNumber(n)rns 2, and 
// # nthLeftTruncatablePrime(10) returns 53.



class nth_lefttruncatableprime {
	public boolean isPrime(int num,int i){
		if(num <= 2){
			return (num == 2) ? true : false;
		}
		if(num%i ==0){
			return false;
		}
		if(i*i > num){
			return true;
		}
		return isPrime(num,i+1);
	}
	public boolean isLeftTruncatable(int n){
		int number = n;
		int count = 0;
		while(number > 0){
			int t = number % 10;
			count += 1;
			if(t == 0){
				return false;
			}
			number = number/10;
		}
		int power = (int) Math.pow(10,count);
		number = n;
		for(int i = 0; i < count; i++){
			if(isPrime(number,2)){
				power = power/10;
				number = number%power;
			}else{
				return false;
			}
		}
		return true;
	}
	public int fun_nth_lefttruncatableprime(int n){
		int count = -1;
		int guess = 0;
		int result = 0;
		while(count < n){
			guess +=1;
			if(isLeftTruncatable(guess)){
				count +=1;
				result = guess;
			}
		}
		return result;
	}
}

	