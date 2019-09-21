
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CowHopscotch {
	
static char[][] grid;
static int rows;
static int cols;
static int traversals = 0;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt();
		cols = scan.nextInt();
		grid = new char[rows][cols];
		scan.nextLine();
	    for(int i = 0; i < rows; i++) {
	      String s = scan.nextLine();
	      for(int j = 0; j < cols; j++) {
	        grid[i][j] = s.charAt(j);
	      }
	    }
	//	System.out.println(Arrays.deepToString(grid));
		dfs(0, 0);
		System.out.println(traversals);
		
	}	

	public static void dfs(int depth, int position) {
		 if(depth == rows-1 && position == cols-1) {
			 traversals++;
	      return;
	    }
		 for(int i = depth+1 ; i < rows; i ++) {
	        for(int j = position+1 ; j < cols; j ++) {
	        	if(grid[depth][position] != grid[i][j]) {
	        		dfs(i, j);
	        }
	      }
	    }
	  }
	


}