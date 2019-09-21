
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GoldilocksAndTheNCows {
	static int cows;
	static int cold;
	static int average;
	static int warm;
	static int[][] ranges;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		cows = scan.nextInt();
		cold = scan.nextInt();
		average = scan.nextInt();
		warm = scan.nextInt();
		ranges = new int[cows][2];
		ArrayList<Long> innerRanges = new ArrayList<Long>();
		for(int i =0 ; i < cows ; i ++) {
			for(int j =0 ; j < 2 ; j ++) {
				int n = scan.nextInt();
				ranges[i][j] = n;
				innerRanges.add((long)n);
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < innerRanges.size(); i ++) {
			int temp = 0;
			for(int j = 0 ; j < cows ; j ++) {
				int inner = ranges[j][0];
				int outer = ranges[j][1];
				long currentTemp = innerRanges.get(i);
				if(currentTemp >= inner &&currentTemp  <= outer) {
					temp += average;
				}else if(currentTemp  < inner){
					temp += cold;
				}else if(currentTemp  > outer) {
					temp += warm;
				}
				if(temp > max) {
					max = temp;
				}
				
			}
		}
		System.out.println(max);	
	}
	

}