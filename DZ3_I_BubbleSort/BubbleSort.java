
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] t;
		t = new int[args.length];
		int x = 1;
		for(int i = 0; i<args.length; i++){ //args.length
			t[i] = Integer.parseInt(args[i]);
			}
		System.out.println("Array in the beginning:");
		for(int i = 0; i<t.length; i++)
			System.out.println("Element " + i + ". of array is " + t[i]);
		
		while(x>0){
			x=0;
			for(int i = 0; i<t.length-1; i++){
				if(t[i] > t[i+1]){
					int h = t[i];
					t[i] = t[i+1];
					t[i+1] = h;
					x++;
				}									
			}
		}
		System.out.println("Sorted Array:");
		for(int i = 0; i<t.length; i++)
			System.out.println("Element " + i + ". of array is " + t[i]);
	}
}
