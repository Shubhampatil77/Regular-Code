package LabManualDemo;

interface customer
{
	int amt=5;					//public,static,final
	void purchase();			//public,abstract
}
class seller implements customer
{
	
	public void purchase()
	{
			//amt =7;  (final)
		System.out.println("Cuastomer needs  "+amt+"  kg rice"	);
}
}
public class Interfaceonlinedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c=new seller();
		c.purchase();
		System.out.println(customer.amt);//Static so it can be called interfa
	}									//it can not depents up on classSD f ff;;
	

}
