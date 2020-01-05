
public class Integers {
	static int x = 1000, y = 2000;
	//int z = (y - x) / 5;

	public static void main(String[] args) {
		int z = (y - x) / 5;
		for(int i = 0; i<z; i++){
			System.out.print(x+5*i+1 + " ");
			System.out.print(x+5*i+2 + " ");
			System.out.print(x+5*i+3 + " ");
			System.out.print(x+5*i+4 + " ");
			if(i<z-1)
				System.out.println(x+5*i+5);
		}
		
	}

}
