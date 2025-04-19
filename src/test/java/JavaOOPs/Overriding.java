package JavaOOPs;
 public class Overriding {
	void run()
	{
		System.out.println("Vehical is running");
	}
}
 class Bike extends Overriding
{
	void run()
	{
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bike obj2= new Bike();
    obj2.run();
	}

}
