// recusive binarySearchValues(L, v) [20 pts] [autograded]
// Write the recursive function binarySearchValues(L, v) that takes a sorted list L and a value v and returns a list 
// of tuples, (index, value), of the values that binary search must check to verify whether or not v is in L. As an 
// example, say:
//    L = ['a', 'c', 'f', 'g', 'm', 'q']
//    v = 'c'
// Binary search always searches between some lo and hi index, which initially are 0 and (len(L)-1). So here, lo=0 
// and hi=5. The first index we try, then, is mid=2 (the integer average of lo and hi). The value there is 'f', so we 
// will add (2, 'f') to our result.
// Since 'f' is not the value we are seeking, we continue, only now we are searching from lo=0 to hi=1 (not hi=2 
// because we know that index 2 was too high!).
// Now we try mid=0 (the integer average of lo and hi), and so we add (0, 'a') to our result.
// We see that 'a' is too low, so we continue, only now with lo=1 and hi=1. So we add (1, 'c') to our result. We 
// found 'c', so we're done. And so we see:
//     L = ['a', 'c', 'f', 'g', 'm', 'q']
//     v = 'c'
//     assert(binarySearchValues(L, v) == [(2,'f'), (0,'a'), (1,'c')])
// Hint: Do not slice the list L, but rather adjust the indexes into L. 

public class BinarySearchValues {
	public String binarySearchValues(char[] list, char search) {
		// Your code goes here
		String temp="";
		int high = list.length-1;
		String result = recursion(list,search,0,high,temp);
		return '[' + result + ']';
	}
	public String recursion(char[] list, char search,int low , int high, String temp ){
	       System.out.println("low " + low);
	       System.out.println("high " + high);
		   if(low > high)
			 return temp;
		   if(low != 0 && high != list.length-1)
		      temp +=',';
		   int mid = (low + high)/2;
		   if(list[mid] == search){
			   temp += "(" + mid + ',' + list[mid] +')';
			   return temp;
		   }
		   temp += "(" + mid + ',' + list[mid] +")";
		   int searchValue = (int) search;
		   System.out.println(searchValue);
		   int midValue = (int) list[mid];
		   System.out.println(midValue);
		   if(searchValue < midValue){
			   high = mid-1;
		   }
		   else{
			   low = mid + 1;
		   }
		   return recursion(list,search,low,high,temp);

	}
	public static void main(String[] args){
	    BinarySearchValues obj = new BinarySearchValues();
	    char[] arr1 = {'a','c','f','g','m','q'};
	    char element = 'f';
	    System.out.println(obj.binarySearchValues(arr1,element));
	}
}
