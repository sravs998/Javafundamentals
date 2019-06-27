package javafundamentals;

public class F14 {
public static void main(String args[]) 
{
int count=0;
if(args.length==0)
System.out.println("please enter the value");
else {
int n=Integer.parseInt(args[0]);
if(n==1)
System.out.println("either prime nor composite");
else if(n==0)
System.out.println("either prime nor composite");
for(int i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}
}
