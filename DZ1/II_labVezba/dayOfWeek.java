
public class dayOfWeek {

	public static void main(String[] args) {
		int d, m, g, g0, m0, x, dan;
		d = Integer.parseInt(args[0]);
		m = Integer.parseInt(args[1]);
		g = Integer.parseInt(args[2]);
		g0 = g - (14 - m) / 12;
		x = g0 + g0 /4 - g0 / 100 + g0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		dan = (d + x + (31*m0)/12) % 7;
		
		switch (dan){
		case 0:
			System.out.println("Izabrani datum je Nedelja");
			break;
		case 1:
			System.out.println("Izabrani datum je Ponedeljak");
			break;
		case 2:
			System.out.println("Izabrani datum je Utorak");
			break;
		case 3:
			System.out.println("Izabrani datum je Sreda");
			break;
		case 4:
			System.out.println("Izabrani datum je Cetvrtak");
			break;
		case 5:
			System.out.println("Izabrani datum je Petak");
			break;
		case 6:
			System.out.println("Izabrani datum je Subota");
			break;
		}
	}
}
