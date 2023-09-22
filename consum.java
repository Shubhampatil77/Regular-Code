package Multithrading;

public class consum extends Thread {
	Company c;

	consum(Company c) {
		this.c = c;
	}

	public void run() {
		int i=1;
		while(true) {
			this.c.produce_item();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			i++;	
			
		}
		
	}

}
