
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;  


public class TheFlowerGarden {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int totalSlots = scan.nextInt();
		int flowerTypes = scan.nextInt();
		int[] arr = new int[flowerTypes * 2];
		for(int i = 0 ; i < flowerTypes*2 ; i ++) {
			arr[i] = scan.nextInt();
			
		}
		char[] ooga = new char[totalSlots];
		for(int i = 0; i < totalSlots; i ++) {
			ooga[i] = '.';
		}
		for(int j = 0; j < flowerTypes*2-1; j +=2) {
			
			for(int i =arr[j]-1  ; i < totalSlots; i+= arr[j+1]) {
				
				ooga[i] = 'X';
				//System.out.println(Arrays.toString(ooga));
			}
			
		}
		int result = 0;
		for(int i = 0; i < ooga.length; i++) {
			if(ooga[i]!='X') {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
}