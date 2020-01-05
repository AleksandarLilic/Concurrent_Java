
public class dec_to_bcd {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		String s = "0";
		int v = 1;
		while (v <= x/2)
			v = 2*v;
		int y = x;
		while (v > 0){
			if(y < v){
				s = s + 0;
			}
			else{
				s = s + 1;
				y -= v;
			}
			v = v/2;				
		}
		System.out.println(s);
	}

}
