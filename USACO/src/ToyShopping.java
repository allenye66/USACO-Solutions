import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Object;

public class ToyShopping {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int cows = scan.nextInt();
		int[] joy = new int[cows];
		int[] price = new int[cows];

		int x = 0, y = 0;
		int z = 0;
		while(scan.hasNext()) {
			if(z%2 == 0) {
				joy[x] = scan.nextInt();
				x++;
			}else {
				price[y] = scan.nextInt();
				y++;
			}
		z++;
		}
		
	//	System.out.println(Arrays.toString(joy) + Arrays.toString(price));
		double[] ooga = new double[cows];

		for(int i =0 ; i < cows ; i ++) {
			double asdf = (double)joy[i]/price[i];
			ooga[i] = asdf;
		}
			//System.out.println(Arrays.toString(ooga));
		int[] arr = new int[3];
		double[] booga = ooga.clone();
		Arrays.sort(booga);
		double largest1 = booga[booga.length-1];
		double largest2 = booga[booga.length-2];
		double largest3 = booga[booga.length-3];
		for(int  i = 0; i < cows; i ++) {
			if(ooga[i] == largest1) {		
				arr[0] = i+1;
			}if(ooga[i] == largest2) {		
				arr[1] = i+1;
			}if(ooga[i] == largest3) {		
				arr[2] = i+1;
			}
		}
		int sum =0;
		sum += price[arr[0]-1]+price[arr[1]-1]+price[arr[2]-1];
		
		//System.out.println(Arrays.toString(arr) + sum);
		System.out.println(sum);
		for(int i =0 ; i < 3; i ++) {
			System.out.println(arr[i]);
		}
	}
}
