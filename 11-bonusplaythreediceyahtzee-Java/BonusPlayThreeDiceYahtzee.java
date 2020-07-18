// bonusPlayThreeDiceYahtzee(dice) [5pts]
// In this exercise, we will write a simplified form of the dice game Yahtzee. In this version, the 
// goal is to get 3 matching dice, and if you can't do that, then you hope to at least get 2 
// matching dice. The game is played like so:
// Roll 3 dice.
// If you do not have 3 matching dice:
// If you have 2 matching dice (a pair), keep the pair and roll one die to replace the third die.
// Otherwise, if you have no matching dice, keep the highest die and roll two dice to replace the 
// other two dice.
// Repeat step 2 one more time.
// Finally, compute your score like so:
// If you have 3 matching dice, your score is 20 + the sum of the matching dice.
// So if you have 4-4-4, your score is 20+4+4+4, or 32.
// If you only have 2 matching dice, your score is 10 + the sum of the matching dice.
// So if you have 4-4-3, your score is 10+4+4, or 18.
// If you have no matching dice, your score is the highest die.
// So if you have 4-3-2, your score is just 4.
// Our goal is to write some Python code that plays this game. It's a large task, so we will use 
// top-down design and break it up into smaller, more manageable pieces. So we'll first write some 
// helper functions that do part of the work, and then those helper functions will make our final 
// function much easier to write. 

// Also note: we will represent a hand of 3 dice as a single 3-digit integer. So the hand 4-3-2 will 
// be represented by the integer 432. With that, let's start writing some code. Be sure to write 
// your functions in the same order as given here, since later functions will make use of earlier 
// ones!

// we've made it to the last function: bonusPlayThreeDiceYahtzee(dice), the function that actually earns 
// the 2.5 bonus points! This function takes one value, the dice with all the rolls for a game of 3-Dice 
// Yahtzee. The function plays the game -- it does step1 and gets the first 3 dice (from the right), then it 
// does step2 twice (by calling playStep2, which you already wrote), and then it computes the score (by 
// calling score, which you already wrote). The function should return two values -- the resulting hand 
// and the score for that hand. For example:
// assert(bonusPlayThreeDiceYahtzee(2312413) == (432, 4))
// assert(bonusPlayThreeDiceYahtzee(2315413) == (532, 5))
// assert(bonusPlayThreeDiceYahtzee(2345413) == (443, 18))
// assert(bonusPlayThreeDiceYahtzee(2633413) == (633, 16))
// assert(bonusPlayThreeDiceYahtzee(2333413) == (333, 29))
// assert(bonusPlayThreeDiceYahtzee(2333555) == (555, 35))
import java.util.*;
public class BonusPlayThreeDiceYahtzee {
	public int[] playStep2(int hand, int dice) {  
		// Your code goes here
		ArrayList<Integer> object = new ArrayList<Integer>(); 
		int[] results = new int[2];
		int a = hand % 10;  //4
		hand = hand/10;
		int b = hand % 10;
		hand = hand /10;
		int c = hand % 10;
		hand = hand/10;
		int element;
		int element2;
		int count = 0;
		if(a!=b && b!=c && c!=a){
		 element = Math.max(a,b);
		 element2 = Math.max(c,element);
		 object.add(element2);
		 count = 2;
		 while(count!=0){
		   int val = dice%10;
		   object.add(val);
		   dice = dice /10;
		   count--;
		 }
		 Collections.sort(object);
		 int s = object.size();
		 results[0] =  object.get(s-1)*100+object.get(s-2)*10+object.get(s-s);
		 results[1] = dice;
		 return results;
		}
		else if(a==b){
		  element2 = a;
		  object.add(element2);
		  element = b;
		  object.add(element);
		}
		else if(a==c){
			element2 = a;
			object.add(element2);
			element = c;
			object.add(element);
		}
		else if(b == c){
			element2 = b;
			object.add(element2);
			element = c;
			object.add(element);
		}
		count = 1;
		while(count != 0){
			int val = dice%10;
			object.add(val);
			count--;
			dice = dice/10;
		}
		Collections.sort(object);
		 int s = object.size();
		 results[0] =  object.get(s-1)*100+object.get(s-2)*10+object.get(s-s);
		 results[1] = dice;
		 return results;
	}
	public int[] bonusPlayThreeDiceYahtzee(int dice) {
		// Your code goes here
		ArrayList<Integer> object = new ArrayList<Integer>();
		int[] result = new int[2];
		int a = dice%10;
		dice = dice/10;
		int b = dice%10;
		dice = dice/10;
		int c = dice%10;
		dice = dice/10;
		if(a==b && b==c && c==a){
			object.add(a);
			object.add(b);
			object.add(c);
			int s = object.size();
			result[0] = object.get(s-1)*100 + object.get(s-2)*10+object.get(s-s);
			result[1] = 20+a+b+c;
			return result;
		}
		object.add(a);
		object.add(b);
		object.add(c);
		Collections.sort(object);
		int s1 = object.size();
		int temp = object.get(s1-1)*100+object.get(s1-2)*10+object.get(s1-s1);
		object.remove(s1-1);
		object.remove(s1-2);
		object.remove(s1-s1);
		int[] arr =playStep2(temp,dice);
		temp = arr[0];
		a = temp%10;
		temp = temp/10;
		b = temp%10;
		temp = temp/10;
		c = temp%10;
		temp = temp/10;
		if(a==b && b==c && c==a){
			object.add(a);
			object.add(b);
			object.add(c);
			int s2 = object.size();
			result[0] = object.get(s2-1)*100 + object.get(s2-2)*10+object.get(s2-s2);
			result[1] = 20+a+b+c;
			return result;
		}
		object.add(a);
		object.add(b);
		object.add(c);
		Collections.sort(object);
		int s2 = object.size();
		 temp = object.get(s2-1)*100+object.get(s2-2)*10+object.get(s2-s2);
		object.remove(s2-1);
		object.remove(s2-2);
		object.remove(s2-s2);
		int[] arr2 = playStep2(arr[0],arr[1]);
		temp = arr2[0];
		a = temp%10;
		temp = temp/10;
		b = temp%10;
		temp = temp/10;
		c = temp%10;
		temp = temp/10;
		if(a==b && b==c && c==a){
			object.add(a);
			object.add(b);
			object.add(c);
			 s2 = object.size();
			result[0] = object.get(s2-1)*100 + object.get(s2-2)*10+object.get(s2-s2);
			result[1] = 20+a+b+c;
			return result;
		}
		if(a==b || b==c ||c==a){
			result[0] = arr2[0];
			if(a==b){
				result[1] = 10+a+b;
				return result;
			}
			else if(b==c){
				result[1] = 10+b+c;
				return result;
			}
			else{
				result[1] = 10+c+a;
				return result;
			}	
		}
		result[0] = arr2[0];
		result[1] = c;
		return result;

	}
}
