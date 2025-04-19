package JavaOOPs;

public class Super {
  String color= "White";
}
class Animal extends Super
{
	String color= "Black";
	void method1()
	{
		System.out.println("Color is:"+color);
		System.out.println("Color is:"+super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal objs= new Animal();
    objs.method1();
	}

}
