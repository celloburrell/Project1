import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        String[] courses = new String[3];
        int[] hours = new int[3];
        int[] scores = new int[3];
        char[] letterGrade = new char[3];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Course: ");
            courses[i] = in.nextLine();
            System.out.println("Credit hours: ");
            hours[i] = Integer.parseInt(in.nextLine());
            System.out.println("Score: ");
            scores[i] = Integer.parseInt(in.nextLine());
            System.out.println();
            if(scores[i] > 89)
            {
                letterGrade[i] = 'A';
            }
            else if(scores[i] > 79)
            {
                letterGrade[i] = 'B';
            }
            else if(scores[i] > 69)
            {
                letterGrade[i] = 'C';
            }
            else if(scores[i] > 59)
            {
                letterGrade[i] = 'D';
            }
            else
            {
                letterGrade[i] = 'F';
            }
        }

        System.out.printf("%6s %6s %6s %s\n", "Course", "Hours", "Score", "Grade");
        for(int i = 0; i < 3; i++)
        {
            System.out.printf("%6s %6d %6d %3c\n",courses[i], hours[i], scores[i], letterGrade[i]);
        }

    }
}
