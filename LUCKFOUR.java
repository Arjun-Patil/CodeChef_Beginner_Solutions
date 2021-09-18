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
		int a, count;
		for(int i = 0; i < n; i++){
		    count = 0;
		    a = sc.nextInt();
		    String str = Integer.toString(a);
		    for(int j = 0; j < str.length(); j++){
		        if(Character.getNumericValue(str.charAt(j)) == 4){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
