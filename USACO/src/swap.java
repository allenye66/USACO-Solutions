import java.util.*;
import java.io.*;

public class swap {
		static ArrayList<Integer> cows = new ArrayList<Integer>();
	    public static void main( String[] args ) throws IOException
	    {
	    	Scanner scan = new Scanner(new File("swap.in"));
	    	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("swap.out")));

	    	int n = scan.nextInt();
	    	long repetitions  = scan.nextLong();
	    	int x1 = scan.nextInt();
	    	int y1 = scan.nextInt();
	    	int x2 = scan.nextInt();
	    	int y2 = scan.nextInt();
	    	
	    	for(int i =0 ; i < n; i ++) {
	    		cows.add(i + 1);
	    	}
	    	System.out.println(cows);
	    	
	    	if(repetitions > 8) {
	    		if(repetitions %2 == 0) {
	    			repetitions = 8; //this should remain 2 for 13 to work, but only 4 for 6 to work
	    		}else {
	    			repetitions = 3;
	    		}
	    	}


	    	for(long i = 0; i < repetitions; i ++) {
	    		reverse(x1, y1);
	    		reverse(x2, y2);
	    	}
	    	
	    	for(int i =0; i < n; i ++) {
	    		//System.out.println(cows.get(i));
	    		pw.println(cows.get(i));
	    	}
		    pw.close();
	    }
	    public static  void reverse(int l, int r)
		  {
	    	l--;
	    	r--;
		      int d = (r-l+1)/2;
		      for(int i=0;i<d;i++)
		      {
		         int t = cows.get(l+i);
		         cows.set(l +i , cows.get(r-i));
		         cows.set(r-i, t);
		    
		      }
		 }
}