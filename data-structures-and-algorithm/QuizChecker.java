import java.util.Scanner;

public class QuizChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Please enter Quiz 1: ");
        byte quiz1 = input.nextByte();
        
        System.out.print("Please enter Quiz 2: ");
        byte quiz2 = input.nextByte();
        
        System.out.print("Please enter Quiz 3: ");
        byte quiz3 = input.nextByte();
        
        int average = (quiz1 + quiz2 + quiz3) / 3;
        
        String remark = "";
        String status = "";        
        if (average >= 60 && average <= 100) {
            status = "PASSED";
            if (average >= 85) {
                remark = "ADVANCE";
            } else {
                remark = "AVERAGE";
            }
        } else if (average >= 0 && average <= 59) {
            status = "FAILED";
            if (average >= 40) {
                remark = "FAIR";
            }
            else {
                remark = "POOR";
            }
        } else {
            System.out.println("Error: Invalid number.");
        }
        if (remark.isEmpty() || status.isEmpty()) {

        }
        else {
            System.out.println("Quiz Average: " + average + "\nStatus: " + status + "\nRemark: " + remark);
        }
        input.close();
    }
}