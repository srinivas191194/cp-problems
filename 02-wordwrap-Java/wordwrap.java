// # Write the function wordWrap(text, width) that takes a string of text (containing only lowercase letters
// #  or spaces) and a positive integer width, and returns a possibly-multiline string that matches the 
// # original string, only with line wrapping at the given width. So wordWrap("abc", 3) just returns "abc", 
// # but wordWrap("abc",2) returns a 2-line string, with "ab" on the first line and "c" on the second line. 
// # After you complete word wrapping in this way, only then: All spaces at the start and end of each 
// # resulting line should be removed, and then all remaining spaces should be converted to dashes ("-"), 
// # so they can be easily seen in the resulting string. Here are some test cases for you:
// # assert(wordWrap("  abcdefghij", 4)  ==  """\
// # abcd
// # efgh
// # ij""")

// # assert(wordWrap(" a b c de fgh ",  4)  ==  """\
// # a-b-
// # c-de
// # -fgh""")

public class wordwrap {
	public String fun_wordwrap(String s, int n){
		String temp = "";
		String result = "";
		int i;
		for( i = 0 ; i < s.length(); i++){
			if(s.charAt(i) != ' ')
			   break;
		}
		int j;
		for(j = s.length()-1; j >=0 ; j--){
			if(s.charAt(j) != ' ')
			  break;
		}
		System.out.println( i);
		System.out.println( j);
		for(int k = i ; k <= j; k++){
			if(s.charAt(k) == ' ')
			  temp += '-';
			else
			  temp += s.charAt(k);
		}
		System.out.println(temp);
		System.out.println("------------------------------------");
		int count = 0;
		for(int m = 0; m < temp.length(); m++){
			count = count+1;
			result += temp.charAt(m);
			if(count == n && m <= temp.length()-(n-1)){
			   result += '\n';
			   count = 0;
			}
			
// 			System.out.println(result);
		}
		return result;
	}
	public static void main(String[] args){
	    wordwrap obj = new wordwrap();
	    System.out.println(obj.fun_wordwrap(" a b c de fgh ",4));
	    System.out.println(obj.fun_wordwrap("  abcdefghij",4));
	}
}