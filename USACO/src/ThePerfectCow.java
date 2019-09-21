import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ThePerfectCow {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int rowcol = scan.nextInt();
		int[][] arr = new int[rowcol][rowcol];
		for(int i =0 ; i < rowcol; i ++) {
			for(int j =0 ; j < rowcol; j ++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]); 
		}
		/*for(int i = 0; i<rowcol; i++)
		{
		    for(int j = 0; j<rowcol; j++)
		    {
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		    
		}
		*/
		
		int[] arrMedians = new int[rowcol];
		
		for(int i = 0; i < rowcol; i ++) {
		//	System.out.println("median of row " + i + " is: " + median(arr[i], rowcol));
			arrMedians[i] = median(arr[i], rowcol);
		}
		Arrays.sort(arrMedians);
		System.out.println(median(arrMedians, rowcol));
		
  
		
	}
	public static int median(int[] arr, int length) {
		if (length % 2 != 0) {
	        return arr[length / 2]; 
		}else {
	      
	        return (arr[(length - 1) / 2] +  arr[length/ 2]) / 2; 
		}
	}
}