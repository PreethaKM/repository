package novdemo;
import java.util.Scanner;
public class Interest {
	public static void main(String args[]) 
	{
		double x,n=0.0;
		int y,d,count=1;
		Scanner input = new Scanner(System.in);
		System.out.println("x:");
		x= input.nextDouble();
		System.out.println("y:");
		y= input.nextInt();
		System.out.println("z:");
		d= input.nextInt();
		while(n<=d)
		{
		n=x+((x*y)/100);
		if(n>=d)
			System.out.println(count);
		count++;
		x=n;
		}
	}
}
