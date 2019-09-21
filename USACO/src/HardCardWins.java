import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HardCardWins {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		int[] opponent = new int[rounds];
		int q= 0;
		while (scan.hasNext()) {
			opponent[q] = (scan.nextInt());
			q++;
		}
		int[] bessie = new int[rounds];
		int z = 0;
		for (int i = 1; i < rounds * 2+1; i++) {
			if (!contains(opponent, i)) {
		//		System.out.println(i);
				bessie[z] = i;
				z++;
			}
		}
		
	//	System.out.println(Arrays.toString(opponent));
	//	System.out.println(Arrays.toString(bessie));
		Arrays.sort(bessie);
		Arrays.sort(opponent);
		//System.out.println(opponent);
		//System.out.println(bessie);


		int result = 0;
		int ooga= 0;
		for(int i = 0 ; i < bessie.length; i ++) {
				if(bessie[i]>opponent[ooga]){
					result ++;
					ooga++;
				}
		}
			
		System.out.println(result);
	}
	public static boolean contains(int[] arr, int val) {
	      for (int n : arr) {
	         if (val == n) {
	            return true;
	         }
	      }
	      return false;
    }
  
}

