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
		int a,b,a1,b1,a2,b2;
		for(int i = 0; i < n; i++){
		    a=sc.nextInt();
		    b=sc.nextInt();
		    a1=sc.nextInt();
		    b1=sc.nextInt();		    
		    a2=sc.nextInt();
		    b2=sc.nextInt();
		    if((a==a1||a==b1) && (b==b1||b==a1))
		        System.out.println(1);
		    else if((a==a2||a==b2) && (b==b2||b==a2))
		        System.out.println(2);
		    else    
		        System.out.println(0);
		   
		    
		}
	}
}
