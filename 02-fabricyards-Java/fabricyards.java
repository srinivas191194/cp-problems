import javax.lang.model.util.ElementScanner14;

// # fabricyards(inches)
// # Fabric must be purchased in whole yards, so purchasing just 1 inch 
// # of fabric requires purchasing 1 entire yard. With this in mind, 
// # write the function fabricYards(inches) that takes the number of 
// # inches of fabric desired, and returns the smallest number of whole 
// # yards of fabric that must be purchased.

// # fabricexcess(inches)
// # Write the function fabricExcess(inches) that takes the number of 
// # inches of fabric desired and returns the number of inches of excess 
// # fabric that must be purchased (as purchases must be in whole yards)
// # . Hint: you may want to use fabricYards, which you just wrote!

import java.util.*;
class fabricyards {
	public int fun_fabricyards(int inches){
		// your code goes here
		if(inches < 36)
		  return 1;
		else if(inches % 36 !=0)
			return inches/36 +1;
		else	
		   return inches /36;
	}

	public int fun_fabricexcess(int inches){
		// your code goes here
		if(inches == 0)
		 return 0;
		int x = fun_fabricexcess(inches);
		return (36*x -inches);
	}
}