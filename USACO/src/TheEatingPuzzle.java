
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   


public class TheEatingPuzzle {

	public static ArrayList<Integer> arrl = new ArrayList<Integer>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int maxCalories = scan.nextInt();
		int numberBuckets = scan.nextInt();
		int[] arr = new int[numberBuckets];
		for (int i = 0; i < numberBuckets; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		findSum(arr, 0,numberBuckets-1,0 , maxCalories);
	//	System.out.println(arrl);
		Collections.sort(arrl);
	//	System.out.println(arrl);
		
		System.out.println(arrl.get(arrl.size()-1));
		
		scan.close();

	
	}

	public static void findSum(int[] arr, int x, 
                            int y, int sum, int max ){
          
        if(x > y) {
        	if(sum <= max ) {
        	arrl.add(sum);
        	}
            return; 
        } 
        findSum(arr, x + 1, y, sum, max);
        findSum(arr, x + 1, y, sum + arr[x], max); 
        
    }


}
