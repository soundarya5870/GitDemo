package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalstr = "Hello World";
		String reversestr ="";
		
		for (int i=0;i<originalstr.length();i++)
		{
			reversestr=originalstr.charAt(i)+reversestr;
		}
		System.out.println("Reverse String is:" +reversestr);
	}

	}

