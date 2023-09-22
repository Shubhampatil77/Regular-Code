package Multithrading;

public class Mythread1 implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of i is " + i);
			try {
				Thread.sleep(2000);
			}
			
			catch(Exception e) {
				
			}
		}

	}
	public static void main(String args[]) {
		Mythread1 t1=new Mythread1();
		
		Thread thr=new Thread(t1);
		
		
		//object of another therad
		
		Mythread2 t2=new Mythread2();
		
			thr.start();
			t2.start();
	}

}
