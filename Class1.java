//1 ASSIGNMENT QUESTION :3

package pro3;
import java.util.*;
public class Class1 {

	public static void main(String st[]) {
		Scanner sc = new Scanner(System.in);
		int n,o=0;
		n=sc.nextInt();
		while(n!=0)
		{
			if(n%2==1)
				o=o+1;
			n=n/2;
		}
        if(o%2==0)
        	System.out.println("IT IS A EVIL NO.");
        else
            System.out.println("IT IS NOT A EVIL NO.");
	sc.close();
	}
}
