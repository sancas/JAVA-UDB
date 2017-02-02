import java.util.*;

public class Cadenas {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Cadena 01: ");
		String cadena01 = reader.nextLine();
		System.out.print("\nCadena 02: ");
		String cadena02 = reader.nextLine();
		System.out.print("\nCadena 03: ");
		String cadena03 = reader.nextLine();
		System.out.print("\nCadena 04: ");
		String cadena04 = reader.nextLine();
		System.out.print("\nCadena 05: ");
		String cadena05 = reader.nextLine();
		System.out.print("\nCadena 06: ");
		String cadena06 = reader.nextLine();
		System.out.print("\nCadena 07: ");
		String cadena07 = reader.nextLine();

		System.out.println(cadena06);
		System.out.println(cadena07);
		String cadena08 = cadena05.substring(0,5);
		System.out.println(cadena08);
		System.out.println("Cadena 06: " + cadena06);
		System.out.println("Longitud de Cadena 06: " + cadena06.length());
		System.out.println("El caracter 4 de Cadena 06 es: " + cadena06.charAt(4));
		cadena07 = cadena07.substring(23, 36) + " - Programacion Orientada a Objetos";
		System.out.println(cadena07);

		System.out.println(cadena07 == cadena06);
		String cadena09 = cadena06.substring(11,22);
		System.out.println(cadena09.equals("Computacion"));
	}
}