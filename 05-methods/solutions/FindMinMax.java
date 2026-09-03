//1. Write a Program to find the Maximum and Minimum of the Given Three Numbers. 
public class FindMinMax {
    public static void main(String[] args) {
        int n1, n2, n3;
	    n1 = 21;
	    n2 = 16;
	    n3 = 92;
	    System.out.println(findMax(n1, n2, n3));
	    System.out.println(findMin(n1, n2, n3));
 
	}
	//to find min among three numbers
	static int findMin(int n1, int n2, int n3){
	    int min = n1;
	    if(n2 < min){
	        min = n2;
	    }
	    if(n3 < min){
	        min = n3;
	    }
	    return min;
	}
	//to find max among three numbers
	static int findMax(int n1, int n2, int n3){
	    int max = n1;
	    if(n2 > max){
	        max = n2;
	    }
	    if(n3 > max){
	        max = n3;
	    }
	    return max;
    }    
}
