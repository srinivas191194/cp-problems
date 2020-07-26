// # Without using iteration and without using strings, 
// # write the recursive function onlyEvenDigits(L), 
// # that takes a array L of non-negative integers 
// # (you may assume that), and returns a new array of 
// # the same numbers only without their odd digits 
// # (if that leaves no digits, then replace the number with 0). 
// # So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844]. 
// # Also the function returns the empty array if the original array is empty. 
// # Remember to not use strings. You may not use loops/iteration in this problem.
import java.lang.Math; 
import java.util.*;
public class recursion_onlyevendigits {
	public int[] fun_recursion_onlyevendigits(int[] l){
		if(l.length == 0){
		   int[] arr1 ={};
		   return arr1;
		}
		ArrayList<Integer> obj = new ArrayList<Integer>();
		recursion(l,0,obj);
		int[] arr = new int[obj.size()];
		for(int i = 0; i < obj.size(); i++)
		   arr[i] = obj.get(i);
		return arr;   
	}
	public void recursion(int[] l , int index, ArrayList<Integer> obj){
		if(index >= l.length)
		   return;
		int result = 0;
		int temp = l[index];
		int placeValue = 1;
// 		while(temp > 0){
// 			int a = temp % 10;
// 			if(a % 2 == 0){
// 			  result = a*placeValue + result;
// 			  placeValue =placeValue*10;
// 			}
// 			temp = temp/10;  
// 		}
        int value = recursion2(temp,placeValue,result);
		obj.add(value);
		recursion(l,index+1,obj);
	}
	public int recursion2(int number,int place,int result){
	    if(number == 0)
	      return result;
	    int a = number % 10;
	    if(a % 2 == 0){
	      result = a*place + result;
	      place = place*10;
	    }
	    number = number /10;
	    return recursion2(number ,place,result);
	}
	public static void main(String[] args){
		recursion_onlyevendigits   object = new recursion_onlyevendigits();
		int[] arr ={43,23265,17,58344};
 System.out.println(Arrays.toString(object.fun_recursion_onlyevendigits(arr)));
	}
}


