package javafundamentals;

public class F5 {
public static void main (String args[]) {
	char a=args[0].charAt(0);
	if(a>=48 && a<=57)
	{
	System.out.println("Digit");
	}
	else if((a>='a' && a<='z') || (a>='A' && a<='Z'))
	{
		System.out.print("Alphabet");
	}
	else
	{
		System.out.println("special character");
	}
	
	
	}
	
}

