package syncPack;

public class Producer extends Thread {
	private int wait = 100;
	private Buffer buff;
	private int product = 1;
	private int mul;
	private int num;
	
	public Producer(Buffer b, int m, int n){
		buff = b;
		mul = m;
		num = n;
		wait = wait * mul;
		product = n+1;
		
	}
	
	public void run(){
		while(true){
			try {
				buff.write(product);
				//product = product + mul;
				System.out.println("Producer Thread " + num+" has stored: " + product);
				sleep (wait);
			}
			catch (InterruptedException e) {
		    	  Thread.currentThread().interrupt();
		    	  break;
		    } 
		}
	}

}
