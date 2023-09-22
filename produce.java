package Multithrading;

public class produce extends Thread {
	Company c;

	produce(Company c) {
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
