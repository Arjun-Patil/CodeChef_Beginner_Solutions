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
		int apple,mango,gold, diff, max, min;
		for(int i = 0; i<n ;i++){
		    apple = sc.nextInt();
		    mango = sc.nextInt();
		    gold = sc.nextInt();
		    if(apple>mango){
		         max = apple;
		         min = mango;
		    }
		    else{
		        max = mango;
		        min = apple;
		    }
		    for(int k = 1;k<=gold; k++){
		            if(max == min)
		                break;
		            min++;
		    }
		    System.out.println(max-min);
		
		}
	}
}
