import java.util.concurrent.Semaphore;

public class test_worker {

	public static void main(String[] args) {
		int t = 1000;
		System.out.println("Starting workers...");
		
		Semaphore sn = new Semaphore(0);
		Semaphore sd = new Semaphore(1);
		Semaphore s1 = new Semaphore(0);
		Semaphore s2 = new Semaphore(0);
		Semaphore s3 = new Semaphore(0);
		Semaphore s4 = new Semaphore(0);
		Semaphore s5 = new Semaphore(0);
		Semaphore s6 = new Semaphore(0);
		worker0 wa = new worker0(sd, s1, s2, t, "A");
		worker3 wb = new worker3(s1, s3, t, "B");
		worker1 wc = new worker1(s2, s4, t, "C");
		worker1 wd = new worker1(s3, s5, t, "D");
		worker2 we = new worker2(s3, s4, s6, t, "E");
		worker2 wf = new worker2(s5, s6, sn, t, "F");
		
		wf.start();
		we.start();
		wd.start();
		wc.start();		
		wb.start();
		wa.start();
		try{
			sn.acquire();
			System.out.println("Workers finished successfully");
			System.out.println();
		}
		catch (InterruptedException e){
			System.out.println("Workers interrupted");
		}

	}

}
