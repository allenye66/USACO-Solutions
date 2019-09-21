
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LongDistanceRacing {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int distance = scan.nextInt();
		int timeUphill = scan.nextInt();
		int timeFlat = scan.nextInt();
		int timeDownhill = scan.nextInt();
		String[] trail = new String[distance];
		int q = 0;
		while(scan.hasNext()) {
			
			trail[q] = scan.next();
			q++;
		}
	//	System.out.println(Arrays.toString(trail));
		int[] segmentTimes = new int[distance];
		int[] segmentTimesBackHome = new int[distance];
		
		int ooga = 0;
		for(int i =0 ; i < distance; i ++) {
			if(trail[i].equals("u")) {
				segmentTimes[ooga] = timeUphill;
				ooga ++;
			}else if(trail[i].equals("d")) {
				segmentTimes[ooga] = timeDownhill;
				ooga ++;
			}else {
				segmentTimes[ooga] = timeFlat;
				ooga ++;
			}
		}
		int booga = 0;
		for(int i =0 ; i < distance; i ++) {
			if(trail[i].equals("u")) {
				segmentTimesBackHome[booga] = timeDownhill;
				booga ++;
			}else if(trail[i].equals("d")) {
				segmentTimesBackHome[booga] = timeUphill;
				booga ++;
			}else {
				segmentTimesBackHome[booga] = timeFlat;
				booga ++;
			}
		}
//		System.out.println(Arrays.toString(segmentTimes));
//		System.out.println(Arrays.toString(segmentTimesBackHome));
		int limit = 0;
		
		
		int i =0 ;
		while(limit < time ) {
		//	System.out.println(limit);
			limit += segmentTimes[i];
			limit += segmentTimesBackHome[i];
			i++;
			
		}
		System.out.println(i-1);
	}
}
