package atomicBroadcastProblem;
import java.util.concurrent.Semaphore;

public class Consumer extends Thread{
	public Semaphore[] notFull;
	public Semaphore[] notEmpty;
	public Semaphore[] mutex;
	public int index;
	public Bafer bafer;
	public Bafer num;
	public int n;
	public int blen;
	
	Consumer(Semaphore[] notFull, Semaphore[] notEmpty, Semaphore[] mutex, int index, Bafer bafer, Bafer num, int n, int blen){
		this.notFull = notFull;
		this.notEmpty = notEmpty;
		this.mutex = mutex;
		this.index = index;
		this.bafer = bafer;
		this.num = num;
		this.n = n;
		this.blen = blen;
	}	
	
	public void run(){
		while(true){
			for (int k = 0; k<blen; k++){
			try {
				//System.out.println("Potrosac "+index+" vrednost k: "+ k);
				notEmpty[k].acquire();
				try {
					mutex[k].acquire();
					System.out.println("Potrosac "+ index+" je procitao:       "+ bafer.data[k]);
					num.data[k]=num.data[k]+1;
					if (num.data[k] == n){
						notFull[k].release();
						num.data[k] = 0;
					}
				}
				catch (InterruptedException e) {
			    	  Thread.currentThread().interrupt();
			    	  break;
			    } 
			    finally { mutex[k].release(); }
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
