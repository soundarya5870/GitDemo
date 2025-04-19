package BasicPrograms;

public class Prime {
  static void primenumber(int n)
  {
	  int i,flag=0;
	  if(n==0 || n==1)
	  {
		  System.out.println(n+ " Is not prime");
	  }
	  if (n==2)
	  {
		  System.out.println(n+" Is prime");
	  }
	  for(i=2;i<=n/2;i++)
	  {
		  if(n%i==0)
		  {
			  System.out.println(n+" Is not prime");
		  flag=1;
		  break;
	  }
	  }
  if(flag==0)
  {
	System.out.println(n+ " Is prime number");
  }
  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primenumber(12);
		primenumber(19);
		primenumber(7);
		primenumber(5);
		
		
	}
	
}
