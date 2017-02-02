public class EstructuraRepetitiva03
{
	public static void main(String[] args)
	{
		long factorial = 1;
		int n = 7;
		int i = 1;
		while (i < n + 1)
		{
			factorial  = factorial * i;
			i++;
		}
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}