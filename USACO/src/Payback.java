
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Payback {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int cows = scan.nextInt();
		int debt = 0;
		int sum = 0;
		int next;
		int comeback = -1;
		int steps = 0;
		boolean ooga = false;
		for(int i =0 ; i < cows; i ++) {
			next = scan.nextInt();
			steps++;
			if(next >= 0) {
				sum += next;
			}else {
				debt -= next;
			}
			if(!ooga) {
				comeback = i;
				ooga = true;
			}
			if(sum >= debt) {
				sum -= debt;
				steps = steps + (i-comeback)*2;
				ooga = false;
				debt = 0;

			}
			
		//	System.out.println("After calculation: ");
		//	System.out.println("sum: " + sum);
		//	System.out.println("debt: " + debt);
		}
			
	
		System.out.println(steps);
	}
}
