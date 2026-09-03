//8. Write a program in Java to reverse any String without using StringBuffer?

public class ReverseString {
    public static void main(String[] args) {
        String str = "SHYAM";
	    System.out.println(revStr1(str));
	    System.out.println(revStr2(str));
	    System.out.println(revStr3(str));
	    System.out.println(revStr4(str));
	}
	//Using Recursion Time: O(n²) and Space: O(n)
	static String revStr4(String str){
	    if(str.isEmpty()){
	        return str;
	    }
	   return revStr4(str.substring(1)) + str.charAt(0);
	}
	//converting to char array Time: O(n) and Space: O(n)
	static String revStr1(String str){
	    char[] c = str.toCharArray();
	    int start = 0;
	    int end = c.length - 1;
	    while(start < end){
	        char temp = c[start];
	        c[start] = c[end];
	        c[end] = temp;
	        start++;
	        end--;
	    }
	    return new String(c);
	}
	//Without Converting to Char Array Time: O(n²)
	static String revStr2(String str){
	    String s = "";
	    for(int i = str.length() - 1; i >= 0; i--){
	        s = s + str.charAt(i);
	    }
	    return s;
	}
	//using StringBuffer and StringBuilder Time: O(n) and Space: O(n)
	static String revStr3(String str){
	    //String reversed = new StringBuffer(str).reverse().toString();
	    String reversed = new StringBuilder(str).reverse().toString();
	    return reversed;
    }
}
