import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;

public class triangle {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("triangles.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("triangles.out"));

		int n = scan.nextInt();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();

		ArrayList<Integer> areas = new ArrayList<Integer>();
		for(int i =0 ; i < n*2; i ++) {
			if(i%2 == 0) {
				x.add(scan.nextInt());
				
			}else {
				y.add(scan.nextInt());
			}
		}
		
		for(int i =0 ; i <n; i ++) {
			int x1 = x.get(i);
			int y1 = y.get(i);
			//System.out.print(x1 + " ");
			//System.out.println(y1);
			
			boolean hasX = false;
			boolean hasY = false;
			
			//check if x1 has another point with the same x
			for(int j = 0; j < n; j ++) {
				if(x1 == x.get(j) && j != i) {
					hasX = true;
					break;
				}
			}
			//check if x1 has another point with the same y
			for(int j = 0; j < n; j ++) {
				if(y1 == y.get(j) && j != i) {
					hasY = true;
					break;
				}
			}
		

			if(hasX == true && hasY == true) {
				//System.out.println("x1: " + x1);
				//System.out.println("y1: " + y1);
				//find largest area
				//System.out.println(x1 + ", " + y1 + " ooga booga!");
				ArrayList<Integer> correspondingX = new ArrayList<Integer>();
				ArrayList<Integer> correspondingY = new ArrayList<Integer>();
				
				for(int j = 0 ; j < n; j ++) {
					if(x1 == x.get(j)) {
						correspondingY.add(y.get(j));
					}
				}
				for(int j = 0 ; j < n; j ++) {
					if(y1 == y.get(j)) {
						correspondingX.add(x.get(j));
					}
				}
				//System.out.println(correspondingX);
				//System.out.println(correspondingY);
				
				ArrayList<Integer> xLengths = new ArrayList<Integer>();
				ArrayList<Integer> yLengths = new ArrayList<Integer>();
				for(int j = 0; j < correspondingX.size(); j ++) {
					if(Math.abs(correspondingX.get(j) - x1) != 0) {
						xLengths.add(Math.abs(correspondingX.get(j) - x1));
					}
				}
				for(int j = 0; j < correspondingY.size(); j ++) {
					if(Math.abs(correspondingY.get(j) - y1) != 0) {
						yLengths.add(Math.abs(correspondingY.get(j) - y1));
					}
				}	
				//System.out.println("x-lengths " + xLengths);

				//System.out.println("y-lengths " + yLengths);

				for(int j = 0; j < xLengths.size(); j ++) {
					for(int k = 0 ; k < yLengths.size(); k ++) {
						areas.add(xLengths.get(j)*yLengths.get(k));
					}
				}	
			}
		}
		//System.out.println(areas);
		pw.print(Collections.max(areas));
		pw.close();

		//System.out.println(x);
		//System.out.println(y);
		
		
		
		// you get a point
			//check if it is a vertex
			//if it does, find the area and add it to an array
	}
}
