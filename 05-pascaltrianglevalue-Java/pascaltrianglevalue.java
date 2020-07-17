// # Write the function pascalsTriangleValue(row, col) 
// # that takes int values row and col, and returns the 
// # value in the given row and column of Pascal's 
// # Triangle where the triangle starts at row 0, and 
// # each row starts at column 0. If either row or col 
// # are not legal values, return None, instead of crashing. 

class pascaltrianglevalue {
	public int fact(int x){
		if(x == 0)
		 return 1;
		return x*fact(x-1);
	}
	public int fun_pascaltrianglevalue(int row, int col){
		// your code goes here
		if(row >0 && col < row+1)
		   return (fact(row))/(fact(col)*fact(row-col));	
		else
		   return 0;
	}
}