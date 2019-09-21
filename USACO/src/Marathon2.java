	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class Marathon2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int locations = scan.nextInt();
		int[] xPos = new int[locations];
		int[] yPos = new int[locations];
		int a1 = 0;
		int a2 = 0;

		for(int i = 0 ;i < locations*2 ; i ++) {
			if(i%2 == 0) {
				xPos[a1] = scan.nextInt();
				a1++;
			}
				
			else {
				yPos[a2] = scan.nextInt();
				a2++;
			}
		}
	//	System.out.println(Arrays.toString(xPos));
	//	System.out.println(Arrays.toString(yPos));

		int distance = 0;
		for(int  i = 0; i < locations-1; i ++) {
			distance += Math.abs(xPos[i] - xPos[i+1]) +Math.abs(yPos[i] - yPos[i+1]);
		}
	//	System.out.println(distance);
		int diff = 0;
		for(int i = 1; i < locations-1; i ++) {
			diff = Math.max(diff, ( Math.abs(xPos[i+1] - xPos[i]) + Math.abs(yPos[i+1] - yPos[i]) + Math.abs(xPos[i] - xPos[i-1])  
			+ Math.abs(yPos[i] - yPos[i-1]) - (Math.abs(xPos[i - 1] - xPos[i + 1]) + Math.abs(yPos[i-1] - yPos[i + 1]))));
		}
		System.out.println(distance - diff);

	}
}
