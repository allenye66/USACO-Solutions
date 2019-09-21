	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class CowCotillion {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int patterns = scan.nextInt();

		for(int i = 0; i < patterns; i ++) {
			int n = scan.nextInt();
			String str = scan.nextLine().replaceAll(" ", "");
			
			char[] arr = new char[n];
			for(int j = 0 ; j < n; j ++) {
				arr[j] = str.charAt(j);
			}
			
			
			if(ooga(arr, n)) {
				System.out.println("legal");
			}else {
				System.out.println("illegal");
			}
		}
			
		
	}
	public static boolean ooga(char[] arr, int n) {
		int counter1 = 0;
		boolean booga = false;
		int counter2 = 0;
		for(int k = 0 ; k < n; k++) {
			if(counter1 >counter2) {
				return false;
			}
			if(arr[k] == '<') {
				counter1 ++;
			}else {
				counter2++;
			}
			
		}
		if(!booga && counter1 == counter2) {
			return true;
		}else if(!booga && counter1!= counter2){
			return false;
		}
		return false;
	}
}
