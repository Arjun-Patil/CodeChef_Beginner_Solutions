/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d,N,sum;
		for(int i = 0; i < n; i++){
		    sum=0;
		    d = sc.nextInt();
		    N = sc.nextInt();
		    for(int j = 0 ; j<d; j++){
		        N = sum(N);

		    }
		    System.out.println(N);
		}
	}
}
