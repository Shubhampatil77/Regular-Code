package Day5;

public class ReverseString {
	public static void main(String args[]) {
		String name = "Shubham";
		int leng = name.length();
		String rev = "";
		for (int i = leng - 1; i >= 0; i--) 
		{
				rev=rev+name.charAt(i);
		}
		System.out.println("Revrese of "+name+" is "+rev);
	}

}
