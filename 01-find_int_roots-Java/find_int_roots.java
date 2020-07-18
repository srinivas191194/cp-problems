// # Write the function bonusFindIntRoots(a,b,c) that takes 
// # the int coefficients a, b, c of a quadratic equation of this form:
// #      y = ax2 + bx + c
// # You are guaranteed the function has 2 real roots, and in fact that 
// # the roots are all integers. Your function should return these 2 int roots as a list
// # in increasing order. How does a function return multiple values? Like so:
// # return root1, root2

import java.util.*;
class find_int_roots {
	public int[] fun_find_int_roots(int a, int b, int c){
		// your code goes here
		int[] sai = new int[2];
		int des =(int) Math.sqrt((b*b)-(4*a*c));
		int x = (int)(-b + des)/2*a;
		int y = (int)(-b-des)/2*a;
		if(x > y){
			sai[0] = x;
			sai[1] = y;
		}	
		return sai;
	}
}