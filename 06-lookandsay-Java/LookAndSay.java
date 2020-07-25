// First, you can read about look-and-say numbers here. Then, write the function lookAndSay(a) that takes a list of 
// numbers and returns a list of numbers that results from "reading off" the initial list using the look-and-say 
// method, using tuples for each (count, value) pair. For example:
// lookAndSay([]) == []
// lookAndSay([1,1,1]) == [(3,1)]
// lookAndSay([-1,2,7]) == [(1,-1),(1,2),(1,7)]
// lookAndSay([3,3,8,-10,-10,-10]) == [(2,3),(1,8),(3,-10)]
// lookAndSay([3,3,8,3,3,3,3]) == [(2,3),(1,8),(4,3)]
// class Tuple{
// 	int count;
// 	int number;
// 	Tuple(int count,int number){
// 		this.count = count;
// 		this.number = number;
// 	}
// }
// First, you can read about look-and-say numbers here. Then, write the function lookAndSay(a) that takes a list of 
// numbers and returns a list of numbers that results from "reading off" the initial list using the look-and-say 
// method, using tuples for each (count, value) pair. For example:
// lookAndSay([]) == []
// lookAndSay([1,1,1]) == [(3,1)]
// lookAndSay([-1,2,7]) == [(1,-1),(1,2),(1,7)]
// lookAndSay([3,3,8,-10,-10,-10]) == [(2,3),(1,8),(3,-10)]
// lookAndSay([3,3,8,3,3,3,3]) == [(2,3),(1,8),(4,3)]
// class Tuple{
// 	int count;
// 	int number;
// 	Tuple(int count,int number){
// 		this.count = count;
// 		this.number = number;
// 	}
// }
import java.util.*;
public class LookAndSay {
	public String lookAndSay(int[] a) {
		// Your code goes here
		String result ="";
		if(a.length != 0){
		ArrayList<String> obj = new ArrayList<String>();
		int j = 0;
		for(int i = j; i < a.length; i=j){
			int count = 0;
			for(j = i ; j < a.length; j++){
			   if(a[i] == a[j])
				  count= count+1;
				else
				  break;
			}
         System.out.println(a[i]);
         System.out.println(count);
         String s="";
         if(j != a.length){
			   s = "(" + count + ", " + a[i] +"), ";
			// obj.add(s);
         }
         else {
            s = "(" + count + ", " + a[i] +")";
         }
			result += s;
			
		}
		return '['+ result + ']';
	}
	else {
	    return '['+ result + ']';
	}
}
	// public static void main(String[] args){
	// 	  LookAndSay object = new LookAndSay();
	// 	  int[] arr ={3,3,8,-10,-10,-10};
	// 	  System.out.println(object.lookAndSay(arr));
	// }
}