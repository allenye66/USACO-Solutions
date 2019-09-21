	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   

public class RobotWorld {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int commands = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int j = 1;
		while(scan.hasNext()) {
			String s = scan.nextLine();
			//System.out.println(s);
			if(s.equals("ADD")){
				stack.push(j);
				j ++;
			}else if(stack.size() > 0) {
				stack.pop();
			}
		}
		System.out.println(stack.size());
		for(int i = 0; i < stack.size(); i ++) {
			System.out.println(stack.get(i));
		}
		//System.out.println(stack);
		
	}
}
