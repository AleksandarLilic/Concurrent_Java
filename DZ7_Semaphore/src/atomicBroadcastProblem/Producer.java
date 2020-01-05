package atomicBroadcastProblem;

import java.util.concurrent.Semaphore;

public class Producer extends Thread{
	public Semaphore[] notFull;
	public Semaphore[][] notEmpty;
	public Bafer bafer;
	public int blen;
	private int product = 67;
	Producer(Semaphore[] notFull, Semaphore[][] notEmpty, Bafer bafer, int blen){
		this.notFull = notFull;
		this.notEmpty = notEmpty;
		this.bafer = bafer;
		this.blen = blen;
	}
	
	public void run(){
		while(true){
				for (int k = 0; k<blen; k++){
					product++;
					if (product>1000)
						product = 0;					
				try {
					notFull[k].acquire();
					bafer.data[k] = product;
					System.out.println("Proizvodjac: bafer = "+ bafer.data[k]);
					for (int j = 0; j<notEmpty.length; j++){
						notEmpty[j][k].release();						
					}
				}
				catch (InterruptedException e) {
			    	  Thread.currentThread().interrupt();
			    	  break;
			    } 
			    finally {  }				
			}
		}
	}
}
