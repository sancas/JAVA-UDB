import java.util.*;

public class Constantes{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		final float pi = 3.14159265F;
		System.out.print("Radio: ");
		float radio = reader.nextFloat();
		double area;

		area = pi * radio * radio;

		System.out.println("Area circunferencia = " + area);
	}
}