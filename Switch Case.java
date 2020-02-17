//1 ASSIGNMENT QUESTION :2

import java.util.*;
public class Class1 {

	public static void main(String st[]) {
	    Scanner sc= new Scanner(System.in);
	    int n,i,flag=0,ch=0,r=1,min=Integer.MAX_VALUE;
	    System.out.println("PRESS 1 TO CHECK FOR PRIME\nPRESS 2 FOR FINDING SMALLEST DIGIT IN A NUMBER:");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    	System.out.println("ENTER A NUMBER:");
	    	n=sc.nextInt();
	    	for(i=2;i<=n/2;i++)
	    		{
	    			if(n%i==0)
	    			{   flag=1;
	    				break;
	    			}
	    		}
	    	if(flag==0)
	    		System.out.println("NUMBER IS PRIME");
	    	else
	    		System.out.println("NUMBER IS COMPOSITE");
	    break;
	    case 2:
	    	System.out.println("ENTER THE NUMBER:");
	    	n=sc.nextInt();
	    	do
	    	{
	    		r=n%10;
	    		n=n/10;
	    		if(r<min)
	    		{min=r;}
	    		
	    	}while(n%10!=0);
	    System.out.println("MINIMUM NO. :"+min);
	    break;
	    
	    default:
	    	System.out.println("INVALD INPUT");
	    	 break;
	    }
	sc.close();
	}
}
