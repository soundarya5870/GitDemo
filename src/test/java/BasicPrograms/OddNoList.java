package BasicPrograms;

public class OddNoList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int a[]= {3,4,8,9,2,5};
     for(int i=0; i<a.length;i++)
     {
     if (a[i]%2!=0)
     {
     System.out.println("Odd Number" +a[i]);
	}
	}
	for(int i=0; i<a.length;i++)
	{
     if (a[i]%2==0)
     {
     System.out.println("even Number" +a[i]);
	}
	}
}
}
