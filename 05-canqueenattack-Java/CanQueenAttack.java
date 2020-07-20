// canQueenAttack(qX, qY, oX, oY) [15 pts]
// Given the position of the queen (qX, qY) and the opponent (oX, oY) on a chessboard. The task is to determine 
// whether the queen can attack the opponent or not. Note that the queen can attack in the same row, same column and 
// diagonally.
import java.util.*;

public class CanQueenAttack {
	int[][] chess = new int[8][8];
	public boolean canQueenAttack(int x, int y, int a, int b) {
		// Your code goes here
		chess[x][y] = 1;
		chess[a][b] = 1;
		if(checkFunction(x,y)){
			for(int i = 0; i < 8; i++)
			  for(int j = 0; j < 8; j++)
			    chess[i][j] = 0;
			   
			return true;
		}
		else {
			for(int i = 0; i < 8; i++)
			  for(int j = 0; j < 8; j++)
			    chess[i][j] = 0;
			return false;
		}
	}

	public 	boolean checkFunction(int x ,int y){
		   for(int z = 0; z < 8; z++){
			   if(z !=y){
			   if(chess[x][z] ==1){
				   return true;
			   }
			}   
		   }
		   for(int z = 0; z < 8 ; z++){
			   if(z !=x){
				   if(chess[z][y] == 1){
					   return true;
				   }
			   }
		   }
		   for(int i = x-1 ,j = y-1; i >=0 && j >=0; i--,j--){
				 if(chess[i][j] ==1)
				    return true;
		   }
		   for(int i = x+1,j = y+1; i < 8 && j < 8; i++,j++){
			   if(chess[i][j] == 1)
			     return true;
		   }
		   for(int i = x-1,j = y+1; i>=0 && j < 8; i--,j++){
			   if(chess[i][j] == 1)
			     return true;
		   }
		   for(int i = x+1,j= y-1; i < 8 && j>=0 ; i++,j--){
			   if(chess[i][j] == 1)
			     return true;
		   }
		
		return false;
	}
}