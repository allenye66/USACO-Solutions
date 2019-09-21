
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   


public class CowPals {


	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int serial = scan.nextInt();
		
	  	while(serial != serialSum(serialSum(serial))) {
	  		serial ++;
	  		if(serialSum(serialSum(serial)) == serialSum(serial)) {
	  			serial ++;
	  		}
	  	}
	  	
		System.out.print(serialSum(serialSum(serial)));
		System.out.println(" " + serialSum(serial));
		
		
		scan.close();
	
		

	
	}
	public static int serialSum(int s) {

		int sum = 0;
		for (int i = 1; i < s; i++) {
			if (s % i == 0){
				sum += i;
			}
		}
		return sum;
	}



}
