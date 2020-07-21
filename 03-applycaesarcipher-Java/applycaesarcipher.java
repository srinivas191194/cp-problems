// # A Caesar Cipher is a s.charAt(i)mple cipher that works by shifting each letter in 
// # the given message by a certain number. For example, if we shift the message 
// # "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
// # Write the function applyCaesarCipher(message, shift) which shifts the given 
// # message by shift letters. You are guaranteed that message is a string, and 
// # that shift is an integer between -25 and 25. Capital letters should stay capital 
// # and lowercase letters should stay lowercase, and non-letter characters should not be changed. 
// # Note that "Z" wraps around to "A". So, for example:
// # assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
// # assert(applyCaesarCipher("zodiac", -2) == "xmbgya")
// # A happy prime is a number that is both happy and prime. 
// # Write the function nthHappyPrime(n) which takes a non-negative integer 
// # and returns the nth happy prime number (where the 0th happy prime number is 7).

public class applycaesarcipher {
	public String fun_applycaesarcipher(String msg, int shift){
		// your code goes here
		String str="";
		for(int i = 0 ; i < msg.length(); i++){
		  if(msg.charAt(i) != ' '){	
			int x =(int) msg.charAt(i);
			if(x >=65 && x <=90){
				int y = x+shift;
                if(y >=65 && y<=90){
					str+= (char) (y);
				}
				else if(y<65){
					str+= (char) (y+26);
				}
				else if(y >90){
					str += (char) (y-26);
				}

			}else{
				if(x >= 97 && x <= 122){
					int y = x +shift;
					if(y >= 97 && y <= 122){
						str +=(char) (y);
					}
					else if(y< 97){
						str +=(char) (y+26);
					}
					else if(y > 122){
						str += (char) (y-26);
					}
				}
			}
        }
        else
			  str += msg.charAt(i);
		
	}
		return str;
	}
	
	
}