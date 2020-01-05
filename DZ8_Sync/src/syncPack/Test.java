package syncPack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Buffer b1 = new Buffer();
		Scanner s1 = new Scanner(System.in); // parser standardnog ulaza
		
		System.out.println("Number of producers: ");
		int M = s1.nextInt();
		
		System.out.println("Number of consumers: ");
		int N = s1.nextInt();
		
		for(int i = 0; i < M; i++){
			new Producer(b1, i+(i+5), i).start();
		}
		for(int i = 0; i < N; i++){
			new Consumer(b1, i+2, i).start();
		}
		
	}

}
