// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 

class get_kth_digit {
	public int fun_get_kth_digit(int digit, int k){
		// your code goes here
		int count = -1;
		while(digit>0){
			int temp = digit%10;
			count++;
			if(count == k)
			  return temp;
			digit = digit/10;  
		}
		return 0;
	}
}