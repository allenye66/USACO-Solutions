	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class SuperprimeRib {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int wantedLength = scan.nextInt();
		recursion(wantedLength, 0 );
	}
	public static void recursion(int n, int answer) {
		
		if(n==0) {
		    
			if(isPrime(answer))
			    
			    System.out.println(answer);
			return;
		}

		for(int i =1; i < 10; i ++) {
		    if(isPrime(answer)){

			    recursion(n-1, 10 * answer + i);
	    	}
		}
    }
	public static boolean isPrime(int n) {
	   
		if(n==1){
		    return false;
		}
		for (int i = 2; i < n/2+1; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}



}
	
	



