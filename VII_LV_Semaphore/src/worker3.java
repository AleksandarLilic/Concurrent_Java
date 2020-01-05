import java.util.concurrent.Semaphore;

public class worker3 extends Thread {
	private Semaphore s0;
	private Semaphore s1;
	//private Semaphore s2;
	private String sw;
	private int period = 100;
	
	public worker3(Semaphore sa, Semaphore sb, int p, String st){
		s0 = sa;
		s1 = sb;
		//s2 = sc;
		period = p;
		sw = st;
	}
	
	public void run(){			
			
		try{
			s0.acquire();
			//s1.acquire();			
			System.out.println("Worker "+sw+" started");
			// do something
			sleep(period);
			System.out.println("Worker "+sw+" finished");
		}
		catch(InterruptedException e) { return; } 
	    finally {
	    	s0.release();
	    	s1.release();
	    	s1.release();
	    	//s2.release();	    
	    }
	}

}
