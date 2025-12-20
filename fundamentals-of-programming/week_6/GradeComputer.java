import java.util.Scanner;

public class GradeComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first subject grade:");
        float first_grade = input.nextFloat();
        
        System.out.println("Please enter your second subject grade:");
        float second_grade = input.nextFloat();
        
        System.out.println("Please enter your third subject grade:");
        float third_grade = input.nextFloat();
        
        float average_grade = (first_grade + second_grade + third_grade) / 3;
        
        String transmuted_grade;
        
        if (average_grade >= 91) {
            transmuted_grade = "A";
        }
        else if (average_grade >= 81) {
            transmuted_grade = "B";
        }
        else if (average_grade >= 71) {
            transmuted_grade = "C";
        }
        else if (average_grade >= 61) {
            transmuted_grade = "D";
        }
        else {
            transmuted_grade = "E";
        }
        
        System.out.println(average_grade + " is equivalent to " + transmuted_grade);
        
        input.close();

    }
}
