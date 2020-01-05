package fifoStatic;

public class ArrayFIFO {
	
	private double[] n; //array
	private final int size=50;
	private int top;
	
	public ArrayFIFO(){
		n = new double[size];
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public int numberOfElements()
	{
		return top+1;
	}
	
	public void insert(double x){
		top++;
		n[top] = x;
	}
	
	public double get(){
		if(top < 0){
			return -1;
		}
		else{
			double p = n[0];
			for(int j = 0; j<=top; j++){
				n[j] = n [j+1];
			}
			top--;
			return p;
		}
	}
	
	public String toString()
	{
		String s = "";
		for (int i = 0; i<=top; i++)
			s += n[i] + " "; 
		return s;
	}

}
