import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class TheEatingPuzzle2 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static ArrayList<Integer> big = new ArrayList<Integer>();
    static int height = 0;
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		 height = scan.nextInt();
		int digits = scan.nextInt();
		for(int i =0 ; i < digits; i ++) {
			arr.add(scan.nextInt());
		}
		for(int i = 2 ; i <= digits; i ++) {
			recursion(i, 0 , 0);
		}

		int t = 1000;
	//	System.out.println(big);
		for(int i =0 ; i < big.size(); i ++) {
			if(big.get(i) < height) {
			int g = Math.abs(big.get(i)-height);
			if(t>g) {
				t = g;
			}
			}
		}
		System.out.println(height - t);

	}
	public static void recursion(int n, int answer, int j) {
		if(n == 0) {
		    if(answer <= height){
			big.add(answer);
		    }
			return;
		}
		for(int i = j ; i < arr.size(); i ++) {
			recursion(n-1, answer+ arr.get(i), i + 1);
		    
		}
    }
}
	
	


