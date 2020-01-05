package syncPack;

public class Buffer {
	private int data;
	private boolean flag = false;
	public Buffer(){	}

	public synchronized void write(int n){
		flag = false;
		data = n;
		//System.out.println("data store: "+ n );
		flag = true;
		notify();
	}
	public int read(){
		while(!flag){
			System.out.println("T");
			try{
				wait();
			}
			catch (InterruptedException e){
				System.out.println("InterruptedException caught");
			}
			System.out.println("data read: ");
		}		
		return( data);
	}

}
