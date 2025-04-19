package JavaOOPs;

public class ImmutableClass {
 private final String name;
 private final int id;
 
 public ImmutableClass(String name, int id)
 {
	 this.name=name;
	 this.id=id;
 }
 public String getName()
 {
	 return name;
 }
 public int getId()
 {
	 return id;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass obj= new ImmutableClass("Soundarya", 30);
		System.out.println("Name is:" +obj.getName());
		System.out.println("Id is:" +obj.getId());

	}

}
