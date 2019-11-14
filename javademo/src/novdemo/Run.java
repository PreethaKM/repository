package novdemo;
import java.util.Scanner;
public class Run {
	public static void main(String args[]) 
	{
		int runs,fours,sixes,y,z;
		double x,percentage;
		Scanner input = new Scanner(System.in);
		System.out.println("Total runs");
		runs = input.nextInt();
		System.out.println("No. of fours");
		fours = input.nextInt();
		System.out.println("No. of sixes");
		sixes = input.nextInt();
		x=runs-((4*fours)+(6*sixes));
		//System.out.println("Runs scored between wickets:"+y);
		percentage=(x*100)/runs;
		System.out.println("Percentage scored:"+percentage);
	}
	}
