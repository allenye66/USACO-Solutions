
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class GoodGrass{
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] arr = new int[row][col];
		for(int i = 0; i < row; i ++) {
			for(int j = 0 ; j < col; j ++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int a = 0, b = 0;
		int largest = 0;
		for(int i = 0; i < row-2; i ++) {
			for(int j = 0 ; j < col-2; j ++) {
				int x = arr[i][j] + arr[i][j +1] + + arr[i][j +2] +
						arr[i+1][j] + arr[i+1][j +1] + + arr[i+1][j +2] +
						arr[i+2][j] + arr[i+2][j +1] + + arr[i+2][j +2];
				if(largest < x ) {
					largest = x;
					a = i;
					b = j;
				}
			}
		
		}
		a ++;
		b++;
		System.out.println(largest);
		System.out.println(a + " " + b);
	}
	
}


