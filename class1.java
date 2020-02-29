//2 ASSIGNMENT QUESTION :2

import java.util.*;
public class class1 {

	public static void main(String[] args) {

		  int n=0,i=0,j=0,k=0,l=0,flag=1,sum=0;
		  Scanner sc=new Scanner(System.in);
		  while(true)
		  {
		   System.out.println("ENTER THE SIZE OF MATRIX:");
		   n=sc.nextInt();
		   if(n>2 && n<10)
		   { break;
		   }
		   else
		   { System.out.println("SIZE SHOULD BE MORE THAN 2 OR LESS THAN 10");
		     continue;
		   }
		  }
		  System.out.println("ENTER THE ELEMENTS OF MATRIX:");
		  int arr[][]=new int[n][n];
		  for(i=0;i<n;i++)
		  {
		   for(j=0;j<n;j++)
		   {
		    arr[i][j]=sc.nextInt();
		   }
		  }
		  
		  for(i=0;i<n;i++)
		  {
		   for(j=0;j<n;j++)
		   {
		    for(k=0;k<n;k++)
		    {
		     for(l=0;l<n;l++)
		     {
		      if(i==k && j==l)
		      {
		       continue;
		      }
		      else
		      {
		       if(arr[i][j]==arr[k][l])
		       {
		        flag=0;
		        break;
		       }
		      }
		     
		     }
		     
		     if(flag==0)
		      break; }
		    
		    if(flag==0)
		        break; }
		   
		   if(flag==0)
		    break; }
		  
		  
		  //CHECKING FOR SUM OF ROW
		  for(i=0;i<n;i++)
		  {
		   for(j=0;j<n;j++)
		   {
		    sum=sum+arr[i][j];
		   }
		   if(sum==0.5*n* ((n*n)+1) )
		   {
		    sum=0;
		    continue;
		   }
		    
		   else
		    flag=0;
		       break;
		  }
		  
		  //CHECKING FOR SUM OF COLOUM
		  for(j=0;j<n;j++)
		  {
		   for(i=0;i<n;i++)
		   {
		    sum=sum+arr[i][j];
		   }
		   if(sum==0.5*n* ((n*n)+1) )
		   {
		    sum=0;
		    continue;
		   }
		    
		   else
		    flag=0;
		       break;
		  }
		  
		  //PRINTING PRIME NO.
		  for(i=0;i<n;i++)
		  {
		     for(j=0;j<n;j++)
		     {
		     
		     }
		  }
		  
		  
		  if(flag==0)
		   System.out.println("NOT A WONDROUS MATRIX");  
		  else
		   System.out.println("YES IT IS A WONDROUS MATRIX");
		  
	 sc.close();
	}

}
