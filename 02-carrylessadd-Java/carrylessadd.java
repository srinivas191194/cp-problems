// # carry less addition means a  normal addition with the carry from each column ignored. 
// # So, for example, if we carryless-ly add 8+7, we get 5 (ignore the carry). And if we add 
// # 18+27, we get 35 (still ignore the carry). With this in mind, write the function 
// # fun_carrylessadd(x, y) that takes two non-negative integers x and y and returns their 
// # carryless sum. As the paper demonstrates, fun_carrylessadd(785, 376) returns 51.

import java.lang.Math; 
public class carrylessadd {
	public int fun_carrylessadd(int x, int y) {
		int result = 0;
		int place = 1;
		while(x > 0 || y >0){
			int a = x %10;
			int b = y %10;
			int c = a+b;
			boolean flag = true;
			while(c > 0){
			   int z = c %10;
			   if(flag == true)
			     result =  z * place+result; 
			   c = c/10;
			   flag = false; 
			}
			place = place*10;
			x = x/10;
			y = y/10;
		}
		return result;
	}
}
