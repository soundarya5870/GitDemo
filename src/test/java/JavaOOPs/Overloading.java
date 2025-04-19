package JavaOOPs;

import java.util.Scanner;

public class Overloading {

	
	int Add;
	public int Add(int a, int b)
	{
		Add= a+b;
		System.out.println("Addintion is:"+Add);
		return Add;
	}
	public int Add(int a, int b, int c)
	{
		Add= a+b+c;
		System.out.println("Addintion is:"+Add);
		return Add;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Overloading obj= new Overloading();
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter the value a:");
     int a= scan.nextInt();
     Scanner scan1= new Scanner(System.in);
     System.out.println("Enter the value b:");
     int b= scan1.nextInt();
     Scanner scan2= new Scanner(System.in);
     System.out.println("Enter the value c:");
     int c= scan1.nextInt();
     
     obj.Add(a,b);
     obj.Add(a,b,c);
	}

}
