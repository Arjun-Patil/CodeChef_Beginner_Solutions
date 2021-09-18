/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
        
    static int distance(int x, int y, int x1, int y1){
        return (x-x1)*(x-x1) + (y-y1)*(y-y1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x,y,x1,y1,x2,y2,cnt,r;
		for(int i = 0; i < n; i++){
		    r = sc.nextInt();
		    x= sc.nextInt();
		    y= sc.nextInt();
		    x1= sc.nextInt();
		    y1= sc.nextInt();
		    x2= sc.nextInt();
		    y2= sc.nextInt();
		    
		    cnt=0;
		    if(distance(x,y,x1,y1)<=r*r)
		        cnt++;
		    if(distance(x1,y1,x2,y2)<=r*r)
		        cnt++;
		    if(distance(x,y,x2,y2)<=r*r)
		        cnt++;
		        
		    if(cnt>=2) System.out.println("yes");
		    else System.out.println("no");
		}
	}
}
