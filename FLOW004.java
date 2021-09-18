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
		int n = sc.nextInt();
		int a, sum = 0;
		for(int i = 1; i<=n; i++){
		    a = sc.nextInt();
		    String str = Integer.toString(a);
		    sum = Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(str.length()-1));
		    System.out.println(sum);
		   
		    
		    
		}
	}
}
