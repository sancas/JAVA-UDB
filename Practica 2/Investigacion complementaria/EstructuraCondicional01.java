import java.util.*;

public class EstructuraCondicional01
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("TOEFLGrade: ");
		int TOEFLGrade = reader.nextInt();
		if (TOEFLGrade >= 550)
		{
			System.out.println("\"Paper Based\" TOEFL Test passed");
		}
		else
		{
			System.out.println("\"Paper Based\" TOEFL Test failed");
		}
	}
}