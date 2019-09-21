	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class EscapingTheFarm {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int max = 0;
	static ArrayList<Integer> booga = new ArrayList<Integer>();
	static ArrayList<Integer> ooga = new ArrayList<Integer>();
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int digits = scan.nextInt();
		
		for(int i =0 ; i < digits; i ++) {
			int c = scan.nextInt();
			arr.add(c);
		}

		//System.out.println(arr);
		for(int i =1 ; i < digits; i ++) {
			recursion(i, 0, 0);
		}
		
		//System.out.println(booga);
		//System.out.println(ooga);
		int bax = 0;
		int bint = 0;
		for(int i =0 ; i < booga.size(); i ++) {
			if(booga.get(i)>bax) {
				bax = booga.get(i);
				bint = i;
			}
		}
		//System.out.println(bax);
		System.out.println(ooga.get(bint));
	}
	public static void recursion(int n, int answer, int j) {
		
		if(n==0) {
			booga.add(answer);
			ooga.add(j);
			return;
		}
		for(int i =0 ; i < arr.size(); i ++) {
			if (!String.valueOf(answer).contains(""+arr.get(i))) {
				if(wontSpill(answer , arr.get(i)))
					recursion(n-1, answer+ arr.get(i), j + 1);
			}	
		}
    }
	static boolean wontSpill(int a, int b) {
		String first = "" + a;
		String second = "" + b;
		if(first.length()> second.length()) {
			for(int i = 0 ; i < second.length(); i ++) {
				int n1 =Integer.parseInt("" + first.charAt(first.length() - i-1));
				int n2=Integer.parseInt("" + second.charAt(second.length() - i-1));	
			//	System.out.println(n1 + " " + n2 + " " + i);
				if(n1 +n2 >= 10) {
					return false;
				}
				
			}
		}else {
			for(int i = 0 ; i < first.length(); i ++) {
				int n1 =Integer.parseInt("" + first.charAt(first.length() - i-1));
				int n2=Integer.parseInt("" + second.charAt(second.length() - i-1));	
			//	System.out.println(n1 + " " + n2 + " " + i);
				if(n1 +n2 >= 10) {
					return false;
				}
				
			}
		}
		return true;
	}
	
	
	static int digitAtIndex(int number, int index) {
		String s = "" + number;
		int d = Integer.parseInt("" +s.charAt(index));
		return d;
	}
	


	
}
	
	

