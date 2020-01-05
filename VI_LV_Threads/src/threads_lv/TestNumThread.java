package threads_lv;

public class TestNumThread {
	public static void main(String[] args) {
		
		FrameNumThread f1 = new FrameNumThread();
		
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		Runnable t1 = new NumThread(1000, f1.GetLabel());
		boolean flag = ((NumThread)t1).getFlagStart();
		f1.storeFlag(flag);
		new Thread(t1).start();
//		try {
//			t1.join();
//			TF_outS.setText("STOP");			
//		}
//		catch (InterruptedException e)
//		{
//			System.out.println("Error");
//		}
			
	}
}
