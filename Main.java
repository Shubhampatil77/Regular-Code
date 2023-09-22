package Multithrading;

public class Main {
	public static void main(String args[]) {
		Company comp=new Company();
		produce	p=new produce();
		consum c=new consum();
		p.start();
		c.start();
	}

}
