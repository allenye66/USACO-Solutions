import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Exploration {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int minutes = scan.nextInt();
		int landmarks = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0 ; i < landmarks; i ++) {
			arr.add( scan.nextInt());
		}

		Collections.sort(arr);
	//	System.out.println(arr);
		int[] sorted = new int[landmarks];	
		for(int i = 0 ; i < landmarks; i ++) {
			//System.out.println(Arrays.toString(getClosest(arr,0)));
			sorted[i] = getClosest(arr, 0)[0];
			arr.remove(getClosest(arr, 0)[1]);
			/*for(int j= 0; j < arr.size(); j ++) {
				if(arr.get(j) ==  getClosest(arr,0)) {
					arr.remove(j);
				}
			}*/
		}
	//	System.out.println(Arrays.toString(sorted));
		int sum = 0;
		int counter = 0;
		for(int i = 0; i < sorted.length-1; i ++) {
			
				sum += Math.abs(sorted[i]-sorted[i+1]);
			
			counter++;
			if(sum >= minutes) {
				break;
			}
		}
		System.out.println(counter);
		
	}
	/*public static int getClosest(ArrayList<Integer> arr, int x) {

	    int low = 0;
	    int high = arr.size() - 1;
	    while (low < high) {
	        int mid = (low + high) / 2;
	        int d1 = Math.abs(arr.get(mid) - x);
	        int d2 = Math.abs(arr.get(mid+1) - x);
	        if (d2 <= d1){
	        low = mid+1;
	        }
	        else{
	            high = mid;
	        }
	    }
	    return arr.get(high);
	}*/
	public static int[] getClosest(ArrayList<Integer> arr, int x) {

		int[] answer = {0,0};
	    int low = 0;
	    int high = arr.size() - 1;
	    while (low < high) {
	        int mid = (low + high) / 2;
	        int d1 = Math.abs(arr.get(mid) - x);
	        int d2 = Math.abs(arr.get(mid+1) - x);
	        if (d2 <= d1){
	        low = mid+1;
	        }
	        else{
	            high = mid;
	        }
	    }
	    answer[0] = arr.get(high);
	    answer[1] = high;
	    return answer;
	}
	
}