
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OneMoreThanZero {
	static ArrayList<Long> arr = new ArrayList<Long>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int wantedLength = scan.nextInt();
		recursion(wantedLength, 0 );
	//	System.out.println(arr);
	

	ArrayList<String> str = new ArrayList<String>();
	for(int i = 0 ; i < arr.size(); i ++) {
		String s = "" + arr.get(i);
		if(s.length()< wantedLength) {
			while(s.length() != wantedLength) {
				s = "0" + s;
			}
			if(s.length() == wantedLength) {
				str.add(s);
			}
		}else if(s.length() == wantedLength) {
			str.add(s);
		}
	}
//System.out.println(str);
	int neededOnes = wantedLength/2+1;
	int ooga = 0;
	for(int i =0 ; i < str.size(); i ++) {
		if(amountOfOnes(str.get(i))>= neededOnes) {
			System.out.println(str.get(i));
			ooga++;
		}
	}
	System.out.println(ooga);

}

	public static void recursion(int n, long answer) {
		if (n == 0) {
			arr.add(answer);
			return;
		}
		for (int i = 0; i < 2; i++) {
			recursion(n - 1, 10 * answer + i);
		}
	}
	public static int amountOfOnes(String s) {
		int c = 0;
		for(int i =0 ;i < s.length(); i ++) {
			char ch = s.charAt(i);
			if(ch == '1') {
				c++;
			}
		}
		return c;
	}
	

}
