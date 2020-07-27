// Write the function inverseLookAndSay(a) that does the inverse of the previous problem, so that, in general:
//       inverseLookAndSay(lookAndSay(a)) == a
// Or, in particular:
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([]) == []
// inverseLookAndSay([(3,1)]) == [1,1,1]
// inverseLookAndSay([(1,-1),(1,2),(1,7)]) == [-1,2,7]
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([(2,3),(1,8),(4,3)]) == [3,3,8,3,3,3,3])

// Write the function inverseLookAndSay(a) that does the inverse of the previous problem, so that, in general:
//       inverseLookAndSay(lookAndSay(a)) == a
// Or, in particular:
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([]) == []
// inverseLookAndSay([(3,1)]) == [1,1,1]
// inverseLookAndSay([(1,-1),(1,2),(1,7)]) == [-1,2,7]
// inverseLookAndSay([(2,3),(1,8),(3,-10)]) == [3,3,8,-10,-10,-10]
// inverseLookAndSay([(2,3),(1,8),(4,3)]) == [3,3,8,3,3,3,3])
import java.util.*;
public class InverseLookAndSay {
	public int[] inverseLookAndSay(String a) {
		// Your code goes here
		if(a.length() != 0){
		ArrayList<Integer> result = new ArrayList<Integer>();
		String updated = "";
		for(int i = 0; i < a.length() ; i++){
			char z = a.charAt(i);
			if(z != '[' && z != ']' && z !=' ' && z != '(' && z != ')'){
				updated += z;
			}
			
		}
		if(updated.length() == 0)
		   return new int[0];
		System.out.println(updated);
		String[] obj = updated.split(",");
		int[]  convert = new int[obj.length];
  		System.out.println(Arrays.toString(obj));
        for(int i = 0 ; i < obj.length; i++)
		     convert[i] = Integer.parseInt(obj[i]);
		for(int i = 0 ; i < convert.length; i++)
		     System.out.println(convert[i]);
		for(int i = 0 ; i < convert.length; i=i+2){
		    int iterations = convert[i];
		    for(int j = 0; j < iterations ; j++)
		       result.add(convert[i+1]);
		}
		int[] mainresult = new int[result.size()];
		for(int i = 0 ; i < result.size(); i++)
		      mainresult[i] = result.get(i);
		// System.out.println(Arrays.toString(mainresult));  
		return mainresult;
	}
	else {
		return new int[0];
	}
	}     
	// public static void  main(String[] args){
	// 	InverseLookAndSay  obj = new InverseLookAndSay();
	// 	obj.inverseLookAndSay("[(1,1),(1,-2),(6,-17)]");
	// }
}