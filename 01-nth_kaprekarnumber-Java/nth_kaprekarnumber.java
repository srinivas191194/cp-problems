// # Background: a Kaprekar number is a non-negative integer, the representation of whose square 
// # can be split into two possibly-different-length parts (where the right part is not zero) 
// # that add up to the original number again. For instance, 45 is a Kaprekar number, because 
// # 45**2 = 2025 and 20+25 = 45. You can read more about Kaprekar numbers here. The first several 
// # Kaprekar numbers are: 1, 9, 45, 55, 99, 297, 703, 999 , 2223, 2728,... 
// # With this in mind, write the function nthKaprekarNumber(n) that takes a non-negative int n 
// # and returns the nth Kaprekar number, where as usual we start counting at n==0.



class nth_kaprekarnumber {

	public boolean isKarNumber(long num){
		if(num == 1) return true;
		long square = num*num;
		long a,b,p=0;
		while(square > 0){
			p += 1;
			square = square/10;
		}
		square = num * num;
		for(int i = 1; i < p ; i++){
			long equalpart = (long) Math.pow(10,i);
			if(equalpart == num) 
			  continue;
			a = square%equalpart;
			b = square/equalpart;
			if(a+b == num){
				return true;
			}  
		}
		return false;
	}
	public long fun_nth_kaprekarnumber(int n){
		long index = -1;
		long guess = 0;
		long result = 0;
		while(index < n){
			if(isKarNumber(guess)){
				index++;
				result = guess;
			}
			guess +=1;
		}
		return result;
	} 
}