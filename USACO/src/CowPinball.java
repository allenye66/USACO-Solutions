
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CowPinball {
	static int rows;
	static List<List<Integer>> list;

	static int max;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt();
		list = new ArrayList<List<Integer>>(rows); 
	    for(int i = 0; i < rows; i++)  {
	        list.add(new ArrayList<Integer>());
	    }

		for(int i = 0 ; i <rows; i ++) {
			for(int j = -1 ; j < i; j ++) {
				list.get(i).add(scan.nextInt());
			}
		}
		
		dfs(0, 0, 0);
		System.out.println(max);


	}
	public static void dfs(int depth, int position, int sum) {

		if(depth == rows ) {
			if(sum > max) {
				max = sum;
				
			}
			return;
		}	
		int n = list.get(depth).get(position);
	//	System.out.println("at depth: " + depth + " at position: " + position + " gets: " +  n);
		sum += n;
		dfs(depth + 1, position +1, sum);
		dfs(depth + 1, position , sum);

		

	}	


}