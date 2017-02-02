public class EstructuraRepetitiva02
{
	public static void main(String[] args)
	{
		long factorial = 1;
		int n = 9;
		for (int i = 1; i < n + 1; i++)
			factorial = factorial * i;
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}