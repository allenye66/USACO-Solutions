import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//sort then compare each sub array

public class MooSick {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int songNotes = scan.nextInt();
		int[] song = new int[songNotes];
		for(int i = 0;i < songNotes; i ++) {
			song[i] = scan.nextInt();
			
		}
		int specialNumber = scan.nextInt();
		int[] special = new int[specialNumber];
		for(int i = 0;  i < specialNumber; i ++) {
			special[i] = scan.nextInt();
		}
		
		Arrays.sort(special);
		setZero(special);
		
		
	//	System.out.println("Special: " + Arrays.toString(special));
	//	System.out.println(songNotes + ", " + Arrays.toString(song) + ", " + specialNumber +  ", " + Arrays.toString(special));

		int counter = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int[] temp = new int[specialNumber];
		for(int i = 0; i < songNotes-specialNumber+1; i ++ ) {
		
			for(int j = 0; j < specialNumber; j ++ ) {
				temp[j] = song[i+j];
				
			}
			Arrays.sort(temp);
			setZero(temp);
			if (Arrays.equals(temp, special)) {
				counter ++;
				array.add(i);
				
			}
			
			
			
			//System.out.println("Individual sub-arrays: " + Arrays.toString(temp));
		}

	
		
		System.out.println(counter);
		for(int i = 0 ; i< array.size(); i ++) {
			System.out.println(array.get(i)+1);
		}
		
	}
	public static void setZero(int[] arr) {
		int z = arr[0];
		for(int i =0 ; i < arr.length; i ++) {
			arr[i] -= z;
		}
	}
	
	
}