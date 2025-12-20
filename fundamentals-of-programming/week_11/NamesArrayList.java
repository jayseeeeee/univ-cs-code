import java.util.*;

public class NamesArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        while (names.size() != 6) {
            System.out.print("Please enter a name: ");
            names.add(input.nextLine());
        }  
        System.out.println(names);
        int size = names.size();
        for (int i = 1; i < size*2; i += 2) {
            System.out.print("Please enter a name: ");
            names.add(i, input.nextLine());
        }
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            names.remove(i);
        }
        System.out.println(names);
        input.close();
    }
}
