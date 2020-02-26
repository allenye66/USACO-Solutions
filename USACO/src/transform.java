import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;



public class transform {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("breedflip.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("breedflip.out"));

		int n = scan.nextInt();
		String s1 = scan.next();
		String s2 = scan.next();
		if(s1.equals(s2)) {
			System.out.println(0);
			System.exit(0);
		}
		//System.out.println(s2);
		ArrayList<Integer> nonMatching = new ArrayList<Integer>();
		for(int i =0 ;i < n; i ++) {
			if(!(s1.charAt(i) + "").equals(s2.charAt(i) +"")) {
				nonMatching.add(i);
			}
		}
		//System.out.println(nonMatching);
		
		boolean currentlyConsecutive = false;
		int counter = 0;
		for(int i =0; i < nonMatching.size()-1; i ++) {
			if(nonMatching.get(i+1) == nonMatching.get(i) + 1) {
				currentlyConsecutive = true;
			}else {
				currentlyConsecutive = false;
			}
			
			if(!currentlyConsecutive) {
				counter ++;
			}
			
			
			
			
		}
		
		pw.print(counter+1);
		pw.close();
		
		
	}
}
