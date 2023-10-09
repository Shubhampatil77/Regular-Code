package LabManualDemo;

class Addtion{
	void add(int x,int y) {
		int z=x+y;
		System.out.println("Additon of Numbers"+" "+z);
	}
	void add(int x,float y)
	{
		float z=x+y;
		System.out.println("Additon of Numbers"+" "+z);		
	}
	void add(float x,int y)
	{
		float z=x+y;
		System.out.println("Additon of Numbers"+" "+z);	
	}
	void add(int x,double y,int n)
	{
		double z=x+y+n;
		System.out.println("Additon of Numbers"+" "+z);	
	}
}

public class Assignment3demo {

	public static void main(String[] args) {
		Addtion sum=new Addtion();
		sum.add(2,3);
		sum.add(2,3.3f);
		sum.add(2.0f,3);
		sum.add(2,3.0f,6);
	}

}
