import java.util.*;
import java.lang.*;

public class MazeSolver {
	static char[][] grid;
	static int rows;
	static int cols;
	static String result;
	static boolean[][] visited;

	public static ArrayList<Integer> findS() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 'S') {
					arr.add(i);
					arr.add(j);
				}
			}
		}
		return arr;
	}

	// cant use dfs to check if the next point equals '.' because it wont find the
	// ending point
	public static String dfs(int depth, int position, String str) {
		String s = str;
		if (grid[depth][position] == 'F') {
			// System.out.println("PATH FOUND");
			// System.out.println(str);
			result = str;
			return result;
		}
		if (grid[depth - 1][position] != '#' && visited[depth - 1][position] == false) {
			// System.out.println("UP");
			visited[depth - 1][position] = true;

			dfs(depth - 1, position, str + "U");
		}
		if (grid[depth + 1][position] != '#' && visited[depth + 1][position] == false) {
			// System.out.println("DOWN");
			visited[depth + 1][position] = true;
			dfs(depth + 1, position, str + "D");
		}
		if (grid[depth][position + 1] != '#' && visited[depth][position + 1] == false) {
			// System.out.println("RIGHT");
			visited[depth][position + 1] = true;
			dfs(depth, position + 1, str + "R");
		}
		if (grid[depth][position - 1] != '#' && visited[depth][position - 1] == false) {
			// System.out.println("LEFT");
			visited[depth][position - 1] = true;
			dfs(depth, position - 1, str + "L");
		}
		return result;

	}

	public static String solve() {
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt();
		cols = scan.nextInt();
		grid = new char[rows][cols];
		visited = new boolean[rows][cols];

		scan.nextLine();
		for (int i = 0; i < rows; i++) {
			String s = scan.nextLine();
			for (int j = 0; j < cols; j++) {
				grid[i][j] = s.charAt(j);
				visited[i][j] = false;
			}
		}
		// System.out.println(Arrays.deepToString(visited));
		// System.out.println(Arrays.deepToString(grid));
		visited[findS().get(0)][findS().get(1)] = true;

		String s = dfs(findS().get(0), findS().get(1), "");
		return s;

	}

	public static void main(String[] args) {
		System.out.println(solve());
	}
}