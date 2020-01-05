
public class TestComplex {

	public static void main(String[] args) {
		Complex n1 = new Complex(1,3);
		//System.out.println("Value of number is: " + n1.toString());
		System.out.println("Value from getters: ");
		System.out.println(n1.getX());
		System.out.println(n1.getY());
		n1.setX(2);
		n1.setY(-1);
		System.out.println("Value from getters, after setters: ");
		System.out.println(n1.getX());
		System.out.println(n1.getY());
		System.out.println("Modulus is: " + n1.modulus());
		Complex nr = new Complex(0,0);
		nr = n1.conjugate();
		System.out.println("Conjugated number: " + nr.toString());
		Complex n2 = new Complex(2,2);
		nr = n1.sum(n2);
		System.out.println("Sum of two numbers: " + nr.toString());
		nr = n1.difference(n2);
		System.out.println("Difference of two numbers: " + nr.toString());
		nr = n1.product(n2);
		System.out.println("Product of two numbers: " + nr.toString());
		nr = n2.conjugate();
		System.out.println("Conjugated number2: " + nr.toString());
		nr = n1.quotient(n2);
		System.out.println("Quotient of two numbers: " + nr.toString());
	}

}
