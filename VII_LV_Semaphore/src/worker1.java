import java.util.concurrent.Semaphore;

public class worker1 extends Thread {
	private Semaphore s0;
	private Semaphore s1;
	private String sw;
	private int period = 100;
	
	
	public worker1(Semaphore sa, Semaphore sb, int p, String st){
		s0 = sa;
		s1 = sb;
		period = p;
		sw = st;
	}
	
	public void run(){			
			
		try{
			s0.acquire();			
			System.out.println("Worker "+sw+" started");
			// do something
			sleep(period);
			System.out.println("Worker "+sw+" finished");
		}
		catch(InterruptedException e) { return; } 
	    finally {
	    	s0.release();
	    	s1.release(); 
	    }
	}
}
