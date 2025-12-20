import java.util.ArrayList;
import java.util.Scanner;

public class NameArray {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i <=10; i++) {
            System.out.printf("Please enter a name (%d): ", i);
            String name = input.nextLine();
            listOfNames.add(name);
        }

        System.out.println("List of names in descending order:");
        for(int i = listOfNames.size() - 1; i >= 0; i--) {
            System.out.printf("[%d]: " + listOfNames.get(i) + "%n", i+1);
        }

        input.close();
    }
}
