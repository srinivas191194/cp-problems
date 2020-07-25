// isMostlyMagicSquare(a) [15 pts]
// Write the function isMostlyMagicSquare(a) that takes an 2d list of numbers, which you may assume is an NxN square 
// with N>0, and returns True if it is "mostly magic" and False otherwise, where a square is "mostly magic" if:
// Each row, each column, and each of the 2 diagonals each sum to the same total.
// A completely magic square has additional restrictions (such as not allowing duplicates, and only allowing numbers 
// from 1 to N2), which we are not enforcing here, but which you can read about here. Note: any magic square is also 
// a "mostly magic" square, including this sample magic square:
// Read for more: https://en.wikipedia.org/wiki/Magic_square
// Here is another mostly-magic square:
// [ [ 42 ]]
// That square is 1x1 and each row, column, and diagonal sums to 42! And finally, here is a not-mostly-magic square:
// [ [ 1, 2],
//   [ 2, 1]]
// Each row and each column add to 3, but one diagonal adds to 2 and the other to 4.
import java.util.*;
public class IsMostlyMagicSquare {
	public boolean isMostlyMagicSquare(int[][] a) {
		// Your code goes here
		int sum=0;
		for(int i=0; i < 1; i++){
			for(int j = 0; j < a[0].length; j++)
			 sum += a[i][j];
		}
		if(isCheck(a,sum)){
			return true;
		}
		return false;
	}
	public boolean isCheck(int[][] a,int sum){
		for(int i = 0 ; i < a.length; i++){
			int result =0;
			for(int j = 0; j < a.length;j++){
				result += a[i][j];
			}
			if(result != sum)
			  return false;
		}
		for(int i = 0; i < a.length; i++){
			int result = 0;
			for(int j = 0 ; j < a.length;j++){
				result += a[j][i];
			}
			if(result != sum)
			  return false;
		}
		int result1 = 0;
		for(int i = 0,j = 0; i < a.length && j < a.length; i++,j++)
		   result1 += a[i][j];
		if(result1 != sum)
		   return false;
		int result2 = 0;
		for(int i= 0,j = a.length-1; i < a.length && j >= 0; i++,j--)
			result2 += a[i][j];
		if(result2 != sum)
		   return false;	
	return true;         
	}
}
