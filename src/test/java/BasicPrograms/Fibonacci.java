package BasicPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 5 8 13
      int a=0, b=1, c=1;
     
      for(int i=0; i<=10; i++)
      {
    	  
    	 System.out.println("Fibbonacci series is:"+a);
    	 a=b;
    	 b=c;
    	 c=a+b;
    	  
    	  
      }
		
	}

}
