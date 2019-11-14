package novdemo;
import java.util.Scanner;
public class Arithmetic
{
	public static void main(String args[]) 
	{
int a,b,c,count=0;
Scanner input = new Scanner(System.in);
System.out.println("a:");
a= input.nextInt();
System.out.println("b:");
b= input.nextInt();
System.out.println("c:");
c= input.nextInt();
if(a+b==c)
{
System.out.println("ADD");
count++;
}
if(a-b==c)
{
System.out.println("SUBTRACT");
count++;
}
if(a*b==c)
{
	System.out.println("MULTIPLY");
	count++;
}
if(a/b==c)
{
	System.out.println("DIVIDE");
count++;
}
if(a%b==c)
{
	System.out.println("MODULO");
	count++;
}
else
{
	if(count==0)
	System.out.println("Not possible");
	}
	}
}
