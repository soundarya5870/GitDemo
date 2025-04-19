package JavaOOPs;
 
class A{
	float salary=40000;
	void methodA()
	
	{
		System.out.println("This is class A");
	}
}

public class inheritance extends A{
	void methodB()
	{
		System.out.println("This is class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance b =new inheritance();
		System.out.println("Calling:" +b.salary);
		System.out.println("Calling:" +b.salary);
		b.methodA();
		b.methodB();

	}

}
