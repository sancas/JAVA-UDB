public class EstructuraCondicional02
{
	public static void main(String[] args)
	{
		int StudentsGrade = 75;
		if (StudentsGrade >= 90)
			System.out.println("Student's Grade is A");
		else if (StudentsGrade >= 80)
			System.out.println("Student's Grade is B");
		else if (StudentsGrade >= 70)
			System.out.println("Student's Grade is C");
		else if (StudentsGrade >= 60)
			System.out.println("Student's Grade is D");
		else
			System.out.println("Student's Grade is F");
	}
}