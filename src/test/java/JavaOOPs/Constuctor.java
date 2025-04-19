package JavaOOPs;

public class Constuctor {
String name;
int i;
Constuctor()
{
	System.out.println("This is default Constructor");
}
Constuctor (String str, int id)
{
	name=str;
	i=id;
	System.out.println("This is parameterized Constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor con= new Constuctor();
		
		System.out.println("Name:" +con.name);
		System.out.println("Id:" +con.i);
		
		Constuctor con1= new Constuctor("Sana", 4);
		System.out.println("Name:" +con1.name);
		System.out.println("Id:" +con1.i);
	}

}
