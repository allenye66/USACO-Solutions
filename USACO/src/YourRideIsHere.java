
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;   

public class YourRideIsHere {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String comet = scan.nextLine().toLowerCase();
		String group = scan.nextLine().toLowerCase();
		//String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i" ,"j", "k", "l", "m" , "n", "o" , "p",  "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int comet1 = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	        map.put("a", 1);
	        map.put("b", 2);
	        map.put("c", 3);
	        map.put("d", 4);
	        map.put("e", 5);
	        map.put("f", 6);
	        map.put("g", 7);
	        map.put("h", 8);
	        map.put("i", 9);
	        map.put("j", 10);
	        map.put("k", 11);
	        map.put("l", 12);
	        map.put("m", 13);
	        map.put("n", 14);
	        map.put("o", 15);
	        map.put("p", 16);
	        map.put("q", 17);
	        map.put("r", 18);
	        map.put("s", 19);
	        map.put("t", 20);
	        map.put("u", 21);
	        map.put("v", 22);
	        map.put("w", 23);
	        map.put("x", 24);
	        map.put("y", 25);
	        map.put("z", 26);
	   for(int i = 0; i < comet.length(); i++) {
		   
		   comet1 *= (Integer)map.get(comet.substring(i, i + 1)) ;

		   
		
	   }
	   int group1 = 1;
	   for(int i = 0; i < group.length(); i++) {
		   group1 *= (Integer)map.get(group.substring(i, i + 1));
		
	   }
	 //  System.out.println(comet1 + " " +  group1);
	   int x = comet1%47;
	   int y = group1%47;
	   //System.out.println(x + " " + y);
	   if(x == y) {
		   System.out.println("GO");
		   
	   }else {
		   System.out.println("STAY");
	   }
		
	}
	
}