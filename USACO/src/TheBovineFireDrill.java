
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheBovineFireDrill {
	// 1 -> 2 -> 4-> 3-> 1 ->

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int cows = scan.nextInt();
		ArrayList<Integer> alreadyMoved = new ArrayList<Integer>();
		int currentPos = 1;
		boolean starting = false;


		for (int i = 0; i < 250; i++) {
			if(currentPos*2 < cows) {
			currentPos += currentPos;
			}else {
			currentPos = (currentPos+currentPos)%cows ;
			}
		
		//	System.out.println(currentPos%cows);
			alreadyMoved.add(currentPos % cows);
			starting = true;
			if (currentPos % cows == 1 && starting == true) {
				System.out.println(alreadyMoved.get(i -1));
				System.exit(0);
			}
				if(currentPos *2 == cows) {
				System.out.println(cows);
				System.exit(0);
			}
		//	System.out.println(alreadyMoved);
			if(alreadyMoved.contains((currentPos*2)%cows) ) {
		//		System.out.println("this");

				System.out.println(alreadyMoved.get(alreadyMoved.size()-1));
				System.exit(0);
			}
			

		}

	}
}