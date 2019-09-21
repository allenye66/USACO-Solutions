import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Bookshelf {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int cows = scan.nextInt();
		int goal = scan.nextInt();
		int[] arr = new int[cows];
		for (int i = 0; i < cows; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
	//	System.out.println(Arrays.toString(arr));

		System.out.println(sum(cows, goal, arr));
	    
	}
	public static int sum(int cows, int max, int[] arr) {
		
			for(int i=0; i<arr.length/2; i++){
			  int temp = arr[i];
			  arr[i] = arr[arr.length -i -1];
			  arr[arr.length -i -1] = temp;
			}
		    int sum = 0;

		    for (int i = 0; i < cows; i++) {
		        sum += arr[i];
		        if (sum >= max)
		            return i+1 ;
		    }
		    return 0;   
	}
}