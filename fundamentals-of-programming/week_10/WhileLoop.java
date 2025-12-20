import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        
        int i = 1;
        while(i <= number) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("Bingo!");
        input.close();
    }
}