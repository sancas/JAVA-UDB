import java.util.*;

public class EstructuraRepetitiva02
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		long factorial = 1;
		System.out.print("n: ");
		int n = reader.nextInt();
		for (int i = 1; i < n + 1; i++)
			factorial = factorial * i;
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}