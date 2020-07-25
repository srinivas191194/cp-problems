// # Given a string str and an integer K, the task is to find the K-th most 
// # frequent character in the string. If there are multiple characters that 
// # can account as K-th the most frequent character then, print any one of them.

import java.util.*;
public class kth_occurrences {
	public char fun_kth_occurrences(String s, int n){
		int[] arr = new int[256];
		String temp = s;
		for(int i = 0; i < temp.length(); i++){
			int index = temp.charAt(i);
			arr[index] += 1;
		}
		Character result = ' ';
		int index = 0;
		for(int j = 0; j < n; j++){
		 int max_num = -9999;
// 		 System.out.println("sai");
		for(int i = 0; i < 256; i++){
            if(arr[i] > max_num){
				max_num = arr[i];
				// System.out.println(max_num);
				index = i;
				result =(char) i;
			}
		}
		arr[index] = 0;
	}
	return result;
	}
	
}

