package Multithrading;

public class Company {
	int n;

	synchronized public void produce_item() {
		this.n = n;

		System.out.println("Produced Item:" + n);
	}

	synchronized public int consume_item() {

		System.out.println("Consum Item:" + this.n);
		return this.n;

	}

}
