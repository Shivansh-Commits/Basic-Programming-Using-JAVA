//1 ASSIGNMENT QUESTION :4

import java.util.Scanner;

public class Class1 {

	public static void main(String []args) {
		int i=0,len=0,sum=0,c=0,flag=1,j=0,t=0;
		char ch[],chr[];
		int []arr=new int[10];
		
		String st="",str[]=new String[10],l="";
		str[0]="";
		Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        st=sc.nextLine();
        ch=st.toCharArray(); 
        len=st.length();
      
        if(ch[len-1]=='.' || ch[len-1]=='?' || ch[len-1]==',' || ch[len-1]=='!')
        {
        	for(i=0;i<len;i++)
            {
            	if(ch[i]!=' ')
            	{
            		
            			arr[c]=arr[c]+ch[i];
            			str[c]=str[c]+ch[i];
            	}
            	else
            	{
            		flag=1;
            		c++;
            		str[c]="";
            		continue;
            	}
            }
            System.out.println("UNSORTED SEQUENCE :");
            for(i=0;i<=c;i++)
            {
            	System.out.println(arr[i]+" "+str[i]);
            }
            //
            
            for(i=0;i<c;i++)
            {
                flag=0;
               for(j=0;j<c;j++)
               {
                   if(arr[j]>arr[j+1])
                   {flag=1;
                     t=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=t;
                     
                     l=str[j];
                     str[j]=str[j+1];
                     str[j+1]=l;
                   }
               }
               if(flag==0)//Optimization
               {
                   break;
               }
            }
            
            System.out.println("");
            System.out.println("SORTED SEQUENCE:");
            for(i=0;i<=c;i++)
            {
            	System.out.println(arr[i]+" "+str[i]);
            }
            
            System.out.println("");
            System.out.println("SORTED STRING:");
            for(i=0;i<=c;i++)
            {
            	System.out.println(str[i]);
            }
        }
        else
        {
        	System.out.println("SENTENCE SHOULD END WITH ',' '.' '?' or '!'");
        }
        
	sc.close();
	}

}
