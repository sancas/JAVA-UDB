import java.util.*;

public class PromedioAlumno{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = reader.nextLine();
		System.out.print("\nNota1: ");
		float nota1 = reader.nextFloat();
		System.out.print("\nNota2: ");
		float nota2 = reader.nextFloat();
		System.out.print("\nNota3: ");
		float nota3 = reader.nextFloat();

		float promedio = (nota1 + nota2 + nota3)/3;

		System.out.print("El promedio de " + nombre + " es: " + promedio);
	}
}