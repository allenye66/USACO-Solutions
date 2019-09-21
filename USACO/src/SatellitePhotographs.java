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

public class SatellitePhotographs {

	static char[][] grid;

	static int rows;
	static int cols;
	static String result;
	static boolean[][] visited;
	static int paths = 0;
	static int mostSteps;
	static int max = 0;
  static int count = 0;
	public static void dfs(int depth, int position) {
	//	System.out.println(depth + ", " + position);
		if (position  <  0 ||  depth < 0 || depth+1  > rows || position + 1 >  cols || grid[depth][position] != '*' || visited[depth][position]) {
		//	System.out.println(fields);
	//			System.out.println("new dfs");
        max = Math.max(max, count);
			return;
		}

		visited[depth][position] = true;
		count++;
		dfs(depth - 1, position);
		dfs(depth + 1, position);
		dfs(depth, position + 1);
		dfs(depth, position - 1);
		}

	

	

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		cols = scan.nextInt();
		rows = scan.nextInt();
		grid = new char[rows][cols];
		visited = new boolean[rows][cols];
		scan.nextLine();
		for(int i = 0; i < rows; i++) {
			String s = scan.nextLine();
			for(int j = 0; j < cols; j++) {
				grid[i][j] = s.charAt(j);
				visited[i][j] = false;
			}
		}
	//	System.out.println(grid[4][ 8]);
	//	System.out.println(Arrays.deepToString(grid));
	//	System.out.println(Arrays.deepToString(visited));
		visited[rows-1][0] = true;
		for(int i = 0 ; i < rows; i ++) {
			for(int j = 0 ; j < cols; j ++) {
				dfs(i, j);
        count = 0;

			}
		}
		System.out.println(max);
		
	}
	
}