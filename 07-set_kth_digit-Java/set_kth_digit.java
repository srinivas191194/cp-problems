// # Write the function setKthDigit(n, k, d) that takes three integers -- n, k, and d 
// # where n is a possibly-negative int, k is a non-negative int, and d is a non-negative 
// # single digit (between 0 and 9 inclusive). This function returns the number n with 
// # the kth digit replaced with d. Counting starts at 0 and goes right-to-left, 
// # so the 0th digit is the rightmost digit. 

import java.util.*;
public class set_kth_digit {
    public int fun_set_kth_digit(int n, int k, int d){
        // your code goes here
        int result = n;
        int count = -1;
        int placeValue = 1;
        while(n > 0){
            int x = n %10;
            x = x*placeValue;
            count++;
            if(count == k){
               result = (d*placeValue)+(result - x); 
               return result;
            }
            placeValue = placeValue*10;
            n = n/10;
        }
        int temp =(int) Math.pow(10,k);
        if(result > 0){
          result = temp+result;
          return result;
        }
        else{
          result = -temp+result;
          return result;
        }
    }
    
}