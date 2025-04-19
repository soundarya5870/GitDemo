package JavaOOPs;

abstract class AbstractClass {
	
	abstract void bike();
}
	class vehical extends AbstractClass
	{
		void bike()
		{
			System.out.println("Running safely");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    vehical obj= new vehical();
    obj.bike();
	}

}
