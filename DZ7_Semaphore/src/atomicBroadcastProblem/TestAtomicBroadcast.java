package atomicBroadcastProblem;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class TestAtomicBroadcast {
	//public static Bafer bafer = new Bafer(0);
	//public static Bafer num = new Bafer(1); //broj potrosaca koji su preuzeli sadrzaj bafera
	public static void main(String[] args) {
		Scanner skener = new Scanner(System.in); // parser standardnog ulaza
		
		System.out.println("Unesite duzinu buffer-a: ");
		int b = skener.nextInt();
		Bafer bafer = new Bafer(b);
		Bafer num = new Bafer(b);
		
		// Unosi se broj potrosaca
		System.out.println("Unesite broj potrosaca: ");
		int n = skener.nextInt();
		
		//semafor notFull, indikacija producer-u da je bafer prazan
		Semaphore[] notFull = new Semaphore[b];
		for (int i = 0; i<b; i++)
			notFull[i] = new Semaphore(1);
		
		//niz semafora notEmpty, indikacije potrosacima da je bafer pun
		Semaphore[][] notEmpty = new Semaphore[n][b];		
		for (int i = 0; i<n; i++){
			for (int j = 0; j<b; j++){
				notEmpty[i][j] = new Semaphore(0);
			}
		}
		
		Semaphore[] mutex = new Semaphore[b];
		for(int i = 0; i<b; i++){
			mutex[i] = new Semaphore(1);
		}
		
		//pokrecemo niti proizvodjaca i n potrosaca
		new Producer(notFull, notEmpty, bafer, b).start();
		
		for (int i = 0; i<n; i++){
			new Consumer(notFull, notEmpty[i], mutex, i, bafer, num, n, b).start();
		}
	} 
}

