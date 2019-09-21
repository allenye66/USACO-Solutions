
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
import java.io.InputStreamReader;


public class FrogsPath {
	static String trail;
	static int count = 0;
	static ArrayList<Long> possibleWays = new ArrayList<Long>();

	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(buff.readLine());
		trail = st.nextToken();
	//	System.out.println(trail);
		dfs(0);
		System.out.println(count);
		buff.close();
	}
	public static void dfs(int playerIndex) {
		if(playerIndex == trail.length() -1) {
			count++;
			return;
		}
		if( trail.charAt(playerIndex+1) != '#') {
			dfs(playerIndex+1);
		}
		if(playerIndex +  2 < trail.length()  && trail.charAt(playerIndex+2) != '#') {
			dfs(playerIndex+2);
		}
		
	}
	/*	recursion(s.length(), 0);
		System.out.println(possibleWays);
		int counter = 0;
		for (int i = 0; i < possibleWays.size(); i++) {
			if (pathWorks("" + possibleWays.get(i))) {
				System.out.println(possibleWays.get(i));
				counter++;
			}
		}
		System.out.println(counter);

	}

	public static void recursion(int n, long answer) {

		if (n == 0) {
			
			 * String str = "" + answer; if(str.length() == s.length()) {
			 * if(!s.contains("1")) { possibleWays.add(answer);
			 * 
			 * } }
			 
			possibleWays.add(answer);

			return;
		}
		for (int i = 0; i < 2; i++) {

			recursion(n - 1, 10 * answer + i);

		}
	}

	public static boolean pathWorks(String possiblePath) {
		System.out.println("taking in path: " + possiblePath);
		// 0 = s, 1 = j  takes in 0 
		int playerIndex = 0;
		int i = 0;
		while (playerIndex < s.length()) { //s.length is 9
			
			if(playerIndex >= possiblePath.length()) {
				System.out.println("path does not work");

				return false;
			}
			if (possiblePath.charAt(i) == '0') {
				int temp = playerIndex + 1;
				if(temp >= s.length()|| s.charAt(temp) == '#') {
					System.out.println("path does not work");

					return false;
				}
				playerIndex = temp;
				
			} else if (possiblePath.charAt(i) == '1') {
				int temp = playerIndex + 2;
				if(temp >= s.length()|| s.charAt(temp) == '#') {
					System.out.println("path does not work");

					return false;
				}
				playerIndex = temp;
			}
			i++;
			System.out.println("iteration: " + i);
		}
		return true;
	}*/

}
