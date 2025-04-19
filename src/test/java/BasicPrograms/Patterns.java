package BasicPrograms;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i, j, row=6;
    
  //1st program : Right Triangle Star Pattern
//    for (i=0;i<row;i++)
//     { 
//    for (j=0;j<=i;j++)
//    {
//    System.out.print("* ");
//    }
//    System.out.println(); 
//     }
    
//    2nd program: Left Triangle Star Pattern
//    for(i=0;i<row;i++)
//    {
//    	for(j=2*(row-i);j>=0;j--)
//    	{
//    		System.out.print(" ");
//    		
//    	}
//    	for(j=0;j<=i;j++)
//    	{
//    		System.out.print("* ");
//    	}
//    	System.out.println();
//    }
//     
//	}
//
//}
 //rd program: Pyramid Star Pattern
    
    for (i=0;i<row;i++)
    {
    	for (j=row-i;j>1;j--)
    	{
    		System.out.print(" ");
    	}
    	for (j=0;j<=i;j++)
    	{
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	}
}