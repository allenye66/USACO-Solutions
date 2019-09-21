
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RegistersInTheShop {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int registers = scan.nextInt();
		ArrayList<String> rc = new ArrayList<String>();
		ArrayList<Integer> people = new ArrayList<Integer>();
		int z = 0;
		while(scan.hasNext()) {
			if(z%2 == 0) {
				rc.add(scan.next());
				z++;
			}else {
				people.add(scan.nextInt());
				z++;
			}
		}
		//	System.out.println(rc);
		//	System.out.println(people);
		Queue<Integer> line = new LinkedList<>(); 
		List<Queue<Integer>> queues = new ArrayList<Queue<Integer>>(registers);
		for (int i = 0; i < registers; ++i) {
			queues.add(new LinkedList<Integer>());
		}
		for(int i = 0; i < people.size(); i ++) {
			if(rc.get(i).equals("C")) {
				line.add(people.get(i));
			}else {
				int whichRegister = people.get(i);
				queues.get(whichRegister-1).add(line.peek());
				line.remove();
			}
		}


		for(int i = 0 ; i < queues.size(); i ++) {
			System.out.print(queues.get(i).size() + " ");
			printOutQueue(queues.get(i));
			System.out.println();
		}
		//System.out.println(queues);

		/* System.out.println(register1);
	    System.out.println(register2);
	    System.out.println(register3);
		 */

	}
	public static void printOutQueue(Queue<Integer> queue) {
		while(!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
	}
}
