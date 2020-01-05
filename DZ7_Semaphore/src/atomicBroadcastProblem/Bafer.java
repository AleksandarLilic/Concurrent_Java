package atomicBroadcastProblem;

//import java.util.concurrent.Semaphore;

//bafer je klasa koja sadrzi jedan element tipa integer
public class Bafer{
	int len;
	int[] data;
	public Bafer(int l){
		len = l;
		data = new int[l];
		for(int i = 0; i<len; i++)
			data[i] = 0;
	}
}

//Semaphore[] notFull = new Semaphore[b];