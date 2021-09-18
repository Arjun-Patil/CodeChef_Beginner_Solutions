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
		int N = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i<N; i++){
		    int T = sc.nextInt();
		    if(x+T >= H){
		        flag = true;
		        break;
		    }
		}
		if(flag) System.out.println("Yes");
		else System.out.println("No");
	}
}
