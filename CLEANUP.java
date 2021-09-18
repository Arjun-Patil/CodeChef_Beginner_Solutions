/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i = 0; i<cases; i++){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    
		    for(int j = 0; j<m;j++){
		        arr1.add(sc.nextInt());
		    }
		    for(int k = 1; k <= n; k++){
		        arr.add(k);
		    }
		    arr.removeAll(arr1);
		    for(int o =0 ;o<arr.size();o++){
		        if(o%2==0)
		            System.out.print(arr.get(o)+" ");
		    }
		    System.out.println();
		    for(int o =0 ;o<arr.size();o++){
		        if(o%2!=0)
		            System.out.print(arr.get(o)+" ");
		    }
		    System.out.println();
		    arr.clear();
		    arr1.clear();
		}
	}
}
