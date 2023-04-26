import java.util.Scanner;


/*
Create a project nestedForLoopsActivity.

Create a class TestAverage that averages the test scores for each student.
• Ask how many students there are
• Ask how many test scores there are per student
• For each student
o ask for each test score
o calculate the average test score
o print the average test score
 */

public class testAverage {
    public static void main(String[] args){
        int studentAmount,scoreAmountPerStudent,temp=0,averageTestScore,teMp=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students are in your class?");
        studentAmount=keyboard.nextInt();
        System.out.println("How many test scores per student?");
        scoreAmountPerStudent=keyboard.nextInt();

        for(int a=1; a <= studentAmount; a++)
        {
            for(int b=1; b<=scoreAmountPerStudent; b++)
            {
                System.out.println("Test score "+b+":");
                temp += keyboard.nextInt();
                teMp = temp/scoreAmountPerStudent;
            }

        }

        averageTestScore=teMp/studentAmount;
        System.out.println("Average test score for class is: "+averageTestScore);

    }

}
