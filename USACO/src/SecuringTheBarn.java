
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;   

public class SecuringTheBarn {

	static ArrayList<String> arr = new ArrayList<String>();
	static ArrayList<String> results = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		int wantedLength = scan.nextInt();
		int digits = scan.nextInt();
		while(scan.hasNext()) {
			arr.add(scan.next());
		}
		Collections.sort(arr);
		recursion(wantedLength, "", 0 );
		
//		results.sort(String::compareToIgnoreCase);

		for(int i =0 ; i < results.size(); i ++) {
			System.out.println(results.get(i));
		}
	}
	public static void recursion(int length, String answer, int j) {
		if(length==0) {
			int vowels = numberOfVowels(answer);
			if(inOrder(answer) && vowels >= 1 ) 
		//	if(containsVowel(answer) && contains2Consonants(answer) && inOrder(answer)  && !results.contains(answer))
				results.add(answer);
				//System.out.println(answer);
			return;
		}
		for(int i = j ; i < arr.size(); i ++) {
			if (!String.valueOf(answer).contains(""+arr.get(i))) {
				recursion(length-1, answer+ arr.get(i),i + 1);
			}
			
		}
    }
	/*public static boolean containsVowel(String s) {
		for(int i =0 ; i < s.length(); i ++) {
			if(s.contains("a") || s.contains("e") ||s.contains("i") ||s.contains("o") ||s.contains("u") ) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean contains2Consonants(String s) {
		int counter = 0;
		for(int i =0 ; i < s.length(); i ++) {
			if(s.charAt(i) != 'a' || s.charAt(i) != 'e' ||s.charAt(i) != 'i' ||s.charAt(i) != 'o' ||s.charAt(i) != 'u') {
				counter ++;
			}
		}
		if(counter > 2) {
			return true;
		}
		return false;
	}
	*/
	public static boolean isConsonant(char s) {
		if(s == 'a' ||s == 'e' || s == 'i' || s  == 'o' || s == 'u') {
			return false;
		}
		return true;
		
	}
	public static boolean inOrder(String s) {
		
		for(int i =0  ; i < s.length()-1; i ++) {
			if((int)s.charAt(i)>(int)s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static int numberOfVowels(String s) {
		int counter = 0;
		for(int i =0 ; i < s.length(); i ++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
				counter ++;
			}
		}
		return counter;
	}


}
	
	


