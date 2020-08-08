// # Note: please do not start this problem prior to completing previous problem. 
// # Bearing in mind the definition of Kaprekar Number from above problem, write the function 
// # nearestKaprekarNumber(n) that takes an int value n and returns the Kaprekar number 
// # closest to n, with ties going to smaller value. For example, nearestKaprekarNumber(49) returns 45, 
// # and nearestKaprekarNumber(51) returns 55. And since ties go to the smaller number, 
// # nearestKaprekarNumber(50) returns 45. 
// # Note: as you probably guessed, this also cannot be solved by counting up from 0, 
// # as that will not be efficient enough to get past the autograder. 
// # Hint: one way to solve this is to start at n and grow in each direction until you find a Kaprekar number.



class nearestkaprekarnumber {
	public boolean iskarpNumber(long num){
		if(num == 1)
		  return true;
		long square = num*num;
		long a,b,count = 0;
		while(square > 0){
			count += 1;
			square = square /10;
		} 
		square = num*num;
		for(int i = 1; i < count ; i++){
			long equalpart = (long) Math.pow(10,i);
			if(equalpart == num)
			  return false;
			a = square%equalpart;
			b = square/equalpart;
			if(a+b == num){
				return true;
			}  
		}
		return false;
	}
	public long fun_nearestkaprekarnumber(int n){
		long guess1 = (long) n;
		long guess2 = (long) n;
		long lower =0,upper = 0;
		boolean isFound = false;
		while(guess1 > 0 && !isFound){
			guess1 -=1;
			if(iskarpNumber(guess1)){
				lower = guess1;
				isFound = true;
			}
		}
		isFound = false;
		while(!isFound){
			guess2 += 1;
			if(iskarpNumber(guess2)){
				upper = guess2;
				isFound = true;
			}
		}
		long lowerDiff = n-lower;
		long upperDiff = upper-n;
		if(lowerDiff == upperDiff){
			return lower;
		}
		else if(lowerDiff < upperDiff){
			return lower;
		}
		return upper;
	}
}