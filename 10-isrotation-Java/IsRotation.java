// isRotation(x, y) [15 pts]
// Write the function isRotation(x, y) that takes two non-negative integers x and y, both 
// guaranteed to not contain any 0's, and 
// returns True if x is a rotation of the digits of y and False otherwise. For example, 
// 3412 is a rotation of 1234. Any number 
// is a rotation of itself.
import java.util.*;
public class IsRotation {
	public boolean isRotation(int x, int y) {
		// Your code goes here
		String number1 = Integer.toString(x);
		String number2 = Integer.toString(y);
		if(number1.length() == number2.length()){
		number1 += number1;
		return (number1.contains(number2)) ? true : false;
		}
		else {
			return false;
		}

	}
}