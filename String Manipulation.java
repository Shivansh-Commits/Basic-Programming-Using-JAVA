//1 ASSIGNMENT QUESTION :1

import java.util.*;
public class Class1 {
	
	public static void main(String st[]) {
	String str=st[0];
	int i,lt,vowel=0,conso=0;
	char ch[];
	String upp="";String lw="";String dg="";String sp="";
	Scanner sr = new Scanner(System.in);
	lt=str.length();	
	ch=str.toCharArray();
	for(i=0;i<lt;i++)
	{
		if(Character.isLowerCase(ch[i]))
		{
			lw=lw+ch[i];
			switch(Character.toUpperCase(ch[i]))
			{
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				vowel=vowel+1;
				break;
			default:
				conso=conso+1;
			}
		}
		else if(Character.isUpperCase(ch[i]))
		{
			upp=upp+ch[i];
			switch(ch[i])
			{
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				vowel=vowel+1;
				break;
			default:
				conso=conso+1;
			}
		}
		else if(Character.isDigit(ch[i]))
		{
			dg=dg+ch[i];
		}
		else
		{
			sp=sp+ch[i];	
		}
	}
	System.out.println("UPPER CASE ALPHABETS :"+upp.length());
	System.out.println("LOWER CASE ALPHABETS :"+lw.length());
	System.out.println("SPECIAL CHARACTERS :"+sp.length());
	System.out.println("DIGITS :"+dg.length());
	System.out.println("VOWELS :"+vowel);
	System.out.println("CONSONENT :"+conso);
	System.out.println("\nSTRING IN THE GIVEN ORDER:"+dg+upp+lw+sp);
	sr.close();
	}
}
