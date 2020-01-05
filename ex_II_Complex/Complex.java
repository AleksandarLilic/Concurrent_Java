

public class Complex implements Arithmetic {

		private double x;
		private double y;
		
		public Complex(){
			x = 0;
			y = 0;
		}
		
		public Complex(double Re, double Im){
			x = Re;
			y = Im;			
		}
		
		public Complex(final Complex C){
			x = C.x;
			y = C.y;
		}
		
		public String toString(){
			if(y > 0){
				if(x == 0)
					return "i" + y;
				else // x =/= 0
					return x + " + i" + y;
			}
			
			else if (y<0){
				if(x == 0)
					return " - i" + y*(-1);
				else // x =/= 0
					return x + " - i" + y*(-1);
			}
			else{ // y=0
				if(x == 0)
					return "0";
				else // x =/= 0
					return x + "";
			}
			
		}
		
		public double getX(){
			return x;
		}
		
		public double getY(){
			return y;
		}
		
		public void setX(double Re){
			x = Re;
		}
		
		public void setY(double Im){
			y = Im;
		}
		
		public double modulus(){
			return Math.sqrt(x * x + y * y);
		}
		
		public Complex conjugate(){
			Complex D = new Complex(0,0);
			D.x = x;
			D.y = y*(-1);
			return D;
		}
		
		public Complex sum(Complex C){
			Complex D = new Complex(0,0);
			D.x = x + C.x;
			D.y = y + C.y;
			return D;
		}
		
		public Complex difference(Complex C){
			Complex D = new Complex(0,0);
			D.x = x - C.x;
			D.y = y - C.y;
			return D;
		}
		
		public Complex product(Complex C){
			Complex D = new Complex(0,0);
			D.x = x * C.x + y * C.y * (-1);
			D.y = x * C.y + y * C.x;
			return D;
		}
		
		public Complex quotient(Complex C){
			Complex D1 = new Complex(0,0);
			Complex D2 = new Complex(0,0);
			Complex C3 = new Complex(0,0);
			C3 = C.conjugate();
			D1.x = x * C3.x + y * C3.y * (-1);
			D1.y = x * C3.y + y * C3.x;
			D2.x = C.x * C3.x + C.y * C3.y * (-1);
			D1.x = D1.x / D2.x;
			D1.y = D1.y / D2.x;
			return D1;			
		}
		
}
