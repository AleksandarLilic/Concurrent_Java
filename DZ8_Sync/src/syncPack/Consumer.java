package syncPack;

public class Consumer extends Thread{
	
	private int wait = 100;
	private Buffer buff;
	private int product;
	private int mul;
	private int num;
	
	public Consumer(Buffer b, int m, int n){
		buff = b;
		mul = m;
		num = n;
		wait = wait * mul;
	}
	
	public void run(){
		while(true){
			try {
				product = buff.read();
				System.out.println("Consumer " + num+" has read: " + product);
				sleep (wait);
			}
			catch (InterruptedException e) {
		    	  Thread.currentThread().interrupt();
		    	  break;
		    } 
		}
	}

}
