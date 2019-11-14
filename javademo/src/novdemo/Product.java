package novdemo;
import java.util.Scanner;
public class Product {
	public static void main(String args[]) {
		int size,mul=0,elements,value=1;
		int a[] = new int[5];
		//int b[]= new int[20];
		Scanner input = new Scanner(System.in);
		System.out.println("size of the array:");
		size = input.nextInt();
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			a[i] = input.nextInt();
		}
		
		
		int total=0;  
		   for(int i=0;i<a.length;i++){  
		     mul=value*a[i];  
		   }  
		  System.out.println("value: "+ mul);  

	}

}
