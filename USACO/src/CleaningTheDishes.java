
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class CleaningTheDishes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int dishes = scan.nextInt();
		Stack<Integer> unwashed = new Stack<Integer>();
		Stack<Integer> washedNotDried = new Stack<Integer>();
		Stack<Integer> finished = new Stack<Integer>();

		for (int i = dishes; i > 0; i--) {
			unwashed.push(i);

		}
		// System.out.println(stack);
		ArrayList<Integer> whichCow = new ArrayList<Integer>();
		ArrayList<Integer> numberOfDishes = new ArrayList<Integer>();
		int b = 0;
		while (scan.hasNext()) {
			if (b % 2 == 0) {
				whichCow.add(scan.nextInt());
				b++;
			} else {
				numberOfDishes.add(scan.nextInt());
				b++;
			}
		}
		for (int i = 0; i < whichCow.size(); i++) {
			if (whichCow.get(i) == 1) {
				for (int k = 0; k < numberOfDishes.get(i); k++) {
					washedNotDried.push(unwashed.peek());
					// System.out.println("Unwashed: " + unwashed);
					unwashed.pop();
				}
			} else {
				for (int k = 0; k < numberOfDishes.get(i); k++) {

					finished.push(washedNotDried.peek());
					washedNotDried.pop();
				}
			}
		}		
		//System.out.println(finished);


		//System.out.println(reverse(finished));
	    
	
		while(!finished.isEmpty()) {
			System.out.println(finished.peek());
			finished.pop();
		}

	
	}
	public static Queue reverse(Stack<Integer> stack){
	    Queue<Integer> temp = new ArrayDeque<Integer>();
	    while(!stack.empty()){
	        temp.add(stack.pop());
	    }
	    return temp;
	}

}
