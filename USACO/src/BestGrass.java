import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BestGrass {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int row1 = row;
		String str = "";
		
		String[] strarr = new String[row];
		char[][] arr = new char[row][col];
		scan.nextLine();
		for(int i=0; i<row; i++){
			strarr[i] = scan.nextLine();
		}
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = strarr[i].charAt(j);
			}
		}
		/*for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				System.out.print(arr[x][y]);
			}

			System.out.println();
		}
		*/
		int counter = 0;
		for(int i=0; i<row; i++){
			for(int j=0; j<col-1; j++){
				if(arr[i][j] == arr[i][j+1] && arr[i][j] != '.') {
					counter++;
				}
			}
		}
		//System.out.println(counter);
		for(int i=0; i<row-1; i++){
			for(int j=0; j<col; j++){
				if(arr[i][j] == arr[i+1][j] && arr[i][j] != '.') {
					counter++;
				}
			}
		}
		int counter1 = 0;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(arr[i][j]!= '.') {
					counter1++;
				}
			}
		}
		System.out.println(counter1 - counter);
			
	
		
		
		
	/*	while (row1 != -1) {
			// System.out.println(scan.next());
			str += scan.nextLine();
			row1--;
			// System.out.println(str);
		
		}*/
	}

}
