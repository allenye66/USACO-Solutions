
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class BuyOneGetOneFree {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int good = scan.nextInt();
		int bad = scan.nextInt();
		int[] high = new int[good];
		int[] low = new int[bad];
		for(int i =0; i < good; i ++) {
			high[i] = scan.nextInt();
		}
		for(int i =0; i < bad; i ++) {
			low[i] = scan.nextInt();
		}
		
		
		Arrays.sort(high);
		Arrays.sort(low);
	//	System.out.println(Arrays.toString(high));

		reverse(high);
		reverse(low);

		int result = 0;
		for(int i = 0 ; i < good; i ++) {
			for(int j = 0 ; j < bad; j ++) {
				if(high[i]>low[j] && low[j]!=-1){
					low[j]=-1;
					result ++;
					break;
				}
			}
		}
		System.out.println(result+good);
		
	}
	public static void reverse(int[] array) {
		for(int i = 0; i < array.length / 2; i++)
		{
		    int temp = array[i];
		    array[i] = array[array.length - i - 1];
		    array[array.length - i - 1] = temp;
		}
		
	}
	

}
