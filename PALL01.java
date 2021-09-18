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
		int num,rev,rem;
		for(int i = 0; i < n ; i++){
		    int a = sc.nextInt();
		    num = a;
		    rev=0;
		    while(num>0){
		        rem = num%10;
		        rev = rev*10+rem;
		        num = num/10;
		    }
		    if(rev == a)
		    System.out.println("wins");
		    else
		    System.out.println("loses");
		}
	}
}
