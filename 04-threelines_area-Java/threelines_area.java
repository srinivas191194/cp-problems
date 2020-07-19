// # Write the function fun_threelines_area(d1, d2, d3) 
// # that takes length of 3 sides
// # find the area of a triangle(return an int) given its side lengths.
import java.lang.Math.*;
import java.util.*;
class threelines_area {
	public int fun_threelines_area(int a, int b, int c){
		int s = (a+b+c)/2;
		return (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}