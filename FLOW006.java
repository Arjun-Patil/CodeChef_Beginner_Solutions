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
		int num,sum;
		for(int i=0; i<n; i++){
		    num = sc.nextInt();
		    sum = 0;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
		    System.out.println(sum);
		}
	    
	}
}
