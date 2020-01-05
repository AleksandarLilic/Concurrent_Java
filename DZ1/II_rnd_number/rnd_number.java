
public class rnd_number {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double x = Math.random();
		x = b + (x * (a-b+1));
		System.out.println((int)x);
	}

}
