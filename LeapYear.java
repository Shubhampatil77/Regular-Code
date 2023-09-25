package Day5;

public class LeapYear {

	public static void main(String[] args) {
		int year=2017;
		if((year%400==0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.println("LeapYear");			
		}
		else
		{
			System.out.println("NOT LeapYear");

		}
		
	}

}
