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
		int a, b, sum, count, flag;
		for(int i = 0; i<n; i++){
		    a = sc.nextInt();
		    b = sc.nextInt();
		    sum = a+b+1;
		    count = 0;
		    
		    for(int k = sum; sum > 0; sum++){
		        flag = 1;
    		    for(int j = 2; j<=sum/2; j++){
    		        if(sum%j==0){
    		            flag = 0;
    		            break;
    		        }
    		    }
    		    if(flag == 0)
    		        count++;
    		    else{
    		        count++;
    		        break;
    		    }
		    }
		    System.out.println(count);
		}
	}
}
