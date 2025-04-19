package BasicPrograms;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 143;
		int r,sum=0,temp;
        temp=a;
        while(a>0)
        {
        	r=a%10;
        	sum=(sum*10)+r;
        	a=a/10;
        	}
        if (temp==sum)
        {
        	System.out.println("Number is palindrome");
        }
        else
        {
        	System.out.println("Number is not palindrome");
        }
	}

}
