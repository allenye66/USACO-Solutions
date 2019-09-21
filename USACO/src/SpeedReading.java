import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpeedReading {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int pages = scan.nextInt();
		int cows = scan.nextInt();
		int[][] arr = new int[cows][3];
		for (int i = 0; i < cows; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < cows; i++) {
			
			int x = minutes(pages, arr[i][0], arr[i][1], arr[i][ 2]);
			System.out.println(x);
		}
	
		/*for (int x = 0; x < cows; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(arr[x][y]);
			}

			System.out.println();
		}
		*/
	}
	public static int minutes(int p, int speed, int maxtime, int rest) {
		int counter = 0;
		int x = 0;
		while(speed*maxtime<p){
			p = p-speed*maxtime;
			x++;
		}
		while(p>0){
			p -= speed;
			counter++;
		}
		return counter  + x*rest + x*maxtime;
	}
	


}
