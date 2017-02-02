public class EstructuraRepetitiva01 
{
	public static void main(String[] args)
	{
		long factorial = 1;
		int i = 1;
		int n = 10;
		do {
			factorial = factorial * i;
			i++;
		} while (i < n + 1);
		System.out.println("Factorial de " + n + " es " + factorial);
	}
}