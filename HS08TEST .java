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
		int amount = sc.nextInt();
		float balance = sc.nextFloat();
		if(amount%5!=0 || (amount+0.50)>balance){
		    System.out.printf("%.2f",balance);
		}
		else{
		    balance -= amount;
		    balance -= 0.50;
		    System.out.printf("%.2f",balance);
		    
		}

	}
}
