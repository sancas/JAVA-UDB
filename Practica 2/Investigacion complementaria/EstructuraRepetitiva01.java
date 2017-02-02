import java.util.*;

public class EstructuraRepetitiva01 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		long factorial = 1;
		int i = 1;
		System.out.print("n: ");
		int n = reader.nextInt();
		do {
			factorial = factorial * i;
			i++;
		} while (i < n + 1);
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}