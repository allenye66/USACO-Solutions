/*	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class diningb {

	//ways to do it
		//change all 2 to 1
		//change all 1 to 2
		//sort and compare how many are different
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int digits = scan.nextInt();
		ArrayList<Integer> cows = new ArrayList<Integer>();
		for(int i =0 ; i < digits; i ++) {
			cows.add(scan.nextInt());
		}
		int counter =0;
		
	//	System.out.println(firstTwo(cows));
	//	System.out.println(lastOne(cows));
		

		
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		// all 1 or 2
		if(firstTwo(cows) == -1 || lastOne(cows) == -1 ) {
			System.out.println(0);
			System.exit(0);
		}
		// 2 1 1 1 2 2 1
		// 1 1 1 2 2 1 2 1 2
		
		if(firstTwo(cows) < lastOne(cows)+1 ) {
			for(int i = firstTwo(cows); i < lastOne(cows)+1; i ++) {
				unsorted.add(cows.get(i));
			}
			int twos = numberOfTwos(unsorted);
			int ones = numberOfOnes(unsorted);
			System.out.println(twos);
			System.out.println(ones);
			if(twos> ones) {
				counter = ones;
				//System.out.println(ones);
				//System.exit(0);
			}else {
				counter = twos;
				//System.out.println(twos);
				//System.exit(0);
			}

		}
		System.out.println(unsorted);

		
		
		//do the reverse and see if its less than counter
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(cows);
		Collections.sort(a);
		int z = 0;
		for(int i =0 ; i < a.size(); i ++) {
			if(a.get(i) != cows.get(i)) {
				z++;
			}
		}
		System.out.println(z);
		System.out.println(counter);


		
		if(z < counter) {
			System.out.println(z);
		}else {
			System.out.println(counter);
		}
	
	
	
	}
	public static int numberOfTwos(ArrayList<Integer> asdf) {
		int twoCounter = 0;
			for(int i =0 ; i < asdf.size(); i ++) {
			if(asdf.get(i) == 2) {
				twoCounter ++;
			}
		}
			return twoCounter;
	}
	public static int numberOfOnes(ArrayList<Integer> asdf) {
		int oneCounter = 0;
			for(int i =0 ; i < asdf.size(); i ++) {
			if(asdf.get(i) == 1) {
				oneCounter ++;
			}
		}
			return oneCounter;
	}
	public static int firstTwo(ArrayList<Integer> arr) {
		for(int i =0; i < arr.size(); i ++ ) {
			if(arr.get(i) == 2)
				return i;
		}
		return -1;
	}
	public static int lastOne(ArrayList<Integer> arr) {
		//for(int i = arr.size()-1; i >= 0; i -- ) {
		int pos = -1;
		for(int i =0; i < arr.size(); i ++ ) {
			if(arr.get(i) == 1)
				pos = i;
		}
		return pos;
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class diningb {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int digits = scan.nextInt();
		ArrayList<Integer> cows = new ArrayList<Integer>();
		for(int i =0 ; i < digits; i ++) {
			cows.add(scan.nextInt());
		}
		
		ArrayList<Integer> prefixSums = new ArrayList<Integer>();
		prefixSums.add(cows.get(0));
		for( int i = 1; i < digits; ++i ) {
	            prefixSums.add( prefixSums.get(i-1) + cows.get(i)); 
	    } 
		System.out.println(prefixSums);
		
		int[] oneCounter = new int[digits];
		int[] twoCounter = new int[digits];
		
		for(int i =0 ; i < digits; i ++) {
			oneCounter[i] = numberOfOnes(cows, 0, i +1 );
		}
		
		System.out.println(Arrays.toString(oneCounter));
		for(int i =0 ; i < digits; i ++) {
			twoCounter[digits - 1 - i] = numberOfTwos(cows, 0 , i+1 );
		}
		System.out.println(Arrays.toString(twoCounter));
		int[] sum = new int[digits];
		for(int i =0 ; i < digits; i ++) {
			sum[i] = twoCounter[i] + oneCounter[i];
		}
		System.out.println(Arrays.toString(sum));


	}
	public static int numberOfTwos(ArrayList<Integer> asdf, int starting, int ending) {
		int twoCounter = 0;
			for(int i = starting ; i < ending; i ++) {
			if(asdf.get(i) == 2) {
				twoCounter ++;
			}
		}
			return twoCounter;
	}
	public static int numberOfOnes(ArrayList<Integer> asdf, int starting, int ending) {
		int oneCounter = 0;
			for(int i =starting ; i < ending; i ++) {
			if(asdf.get(i) == 1) {
				oneCounter ++;
			}
		}
			return oneCounter;
	}
}
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class DiningCows {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int digits = scan.nextInt();
		ArrayList<Integer> cows = new ArrayList<Integer>();
		for(int i =0 ; i < digits; i ++) {
			cows.add(scan.nextInt());
		}
		int numberOfOnes = 0;
		for(int i =0 ; i < digits; i ++) {
			if(cows.get(i) ==1 ) {
				numberOfOnes ++;
			}
		}
		int twos = 0;
		for(int i =0 ; i < digits; i ++) {
			if(cows.get(i) == 2 ) {
				twos ++;
			}
		}
		if(numberOfOnes ==  digits || twos == digits){
		    System.out.println(0);
		    System.exit(0);
		}
		int numberOfTwos = 0;
		int z = Integer.MAX_VALUE;
		for(int i =0 ; i < digits; i ++) {
			if(cows.get(i) == 2) {
				numberOfTwos++;
			}
			if(cows.get(i) == 1) {
				numberOfOnes--;
			}
			int combined = numberOfOnes+ numberOfTwos;
			z = Math.min(combined,z );
		}
		
		System.out.println(z);
	}
}