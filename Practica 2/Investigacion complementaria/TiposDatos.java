import java.util.*;

public class TiposDatos{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("var01: ");
		int var01 = reader.nextInt();
		System.out.print("var02: ");
		long var02 = reader.nextLong();
		System.out.print("var03: ");
		float var03 = reader.nextFloat();
		System.out.print("var04: ");
		double var04 = reader.nextDouble();

		System.out.print("var05: ");
		char var05 = reader.next().charAt(0); //Se asigna a var05 un valor constante Unicode
		System.out.print("var06: ");
		char var06 = reader.next().charAt(0); //Se asigna a var06 un calor constante caracter
		System.out.print("var07: ");
		boolean var07 = reader.nextBoolean();

		System.out.println("var01 = " + var01);
		System.out.println("var02 = " + var02);
		System.out.println("var03 = " + var03);
		System.out.println("var04 = " + var04);
		System.out.println("var05 = " + var05);
		System.out.println("var06 = " + var06);
		System.out.println("var07 = " + var07);
	}
}