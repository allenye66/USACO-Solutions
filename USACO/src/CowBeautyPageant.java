import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CowBeautyPageant {

	static char[][] grid;

	static int rows;
	static int cols;
	static String result;
	static int paths = 0;
	static int mostSteps;
	static boolean b = false;

	public static void dfs(int depth, int position, char c) {
		// System.out.println(depth + ", " + position);
		if (position < 0 || depth < 0 || depth + 1 > rows || position + 1 > cols || grid[depth][position] != 'X') {
			// System.out.println(fields);
			// System.out.println("new dfs");
			b = true;
			return;
		}
		
		grid[depth][position] = c;
		dfs(depth - 1, position, c);
		dfs(depth + 1, position, c);
		dfs(depth, position + 1, c);
		dfs(depth, position - 1, c);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt();
		cols = scan.nextInt();
		grid = new char[rows][cols];
		scan.nextLine();
		for (int i = 0; i < rows; i++) {
			String s = scan.nextLine();
			for (int j = 0; j < cols; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		char ch = '1';
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(grid[i][j] == 'X')
					dfs(i, j, ch ++);
				

			}
		}
		for (char[] a : grid) {
			for (char y : a) {
	//			System.out.print(y + " ");
			}
	//		System.out.println();
		}
		
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1') {
				for (int i1 = 0; i1 < rows; i1++) {
					for (int j1 = 0; j1 < cols; j1++) {
						if (grid[i1][j1] == '2') {
							int min = Math.abs(i - i1) + Math.abs(j - j1);
							if(min < max) {
								max = min;
							}
						}
					}
				}

			 	}

			}

		}
		System.out.println(max-1);
		
	}
	

}