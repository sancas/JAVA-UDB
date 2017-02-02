import java.util.*;

public class SimultaneoEcuaciones {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.println("x1, y2, c1: ");
		float x1 = reader.nextFloat(), y1 = reader.nextFloat(), c1 = reader.nextFloat();
		System.out.println("x2, y2, c2: ");
		float x2 = reader.nextFloat(), y2 = reader.nextFloat(), c2 = reader.nextFloat();

		float x = (c1 * y2 - c2 * y1) / (x1 * y2 - x2 * y1);
		float y = (x1 * c2 - x2 * c1) / (x1 * y2 - x2 * y1);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}