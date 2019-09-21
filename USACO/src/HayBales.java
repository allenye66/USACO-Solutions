	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class HayBales {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int bales = scan.nextInt();
		int[] arr = new int[bales];
		int q = 0;
		while(scan.hasNext()) {
			arr[q] = scan.nextInt();
			q++;
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int average = sum/arr.length;
		int resultdividedbytwo = 0;
		for(int i = 0; i < arr.length; i++) {
			resultdividedbytwo += Math.abs(arr[i]- average);
		}
		System.out.println(resultdividedbytwo/2);
	}
}
