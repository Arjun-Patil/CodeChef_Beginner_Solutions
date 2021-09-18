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
		sc.nextLine();
		for(int i = 0; i<n; i++){
		    StringBuilder str = new StringBuilder(sc.nextLine().toLowerCase());
		    
		    StringBuilder str1 = new StringBuilder(sc.nextLine().toLowerCase());
		    if(str.length()==str1.length()){
		        for(int j = 0;j<str.length();j++){
		            if(str.charAt(j)=='?')
		                str1.setCharAt(j,'?');
		            else if(str1.charAt(j)=='?')
		                str.setCharAt(j,'?');
		        }
		        if(str.toString().equals(str1.toString())){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }
		        
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
