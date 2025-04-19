package JavaOOPs;

public class MutableClass {
    private String name;
    MutableClass(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String StdName)
    {
    	this.name=StdName;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutableClass obj= new MutableClass("Mutable Class");
		System.out.println(obj.getName());
		obj.setName("Soundarya");
		System.out.println(obj.getName());
		
		

	}

}
