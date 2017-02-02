import java.util.*;

public class EstructuraRepetitiva03
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		long factorial = 1;
		System.out.print("n: ");
		int n = reader.nextInt();
		int i = 1;
		while (i < n + 1)
		{
			factorial  = factorial * i;
			i++;
		}
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}