package BasicPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1, num=5;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
       System.out.println("Factorial of 5 is:" +fact);
	}

}
