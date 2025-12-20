import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        byte size = input.nextByte();
        System.out.println("1 - Diamond\n2 - Number");
        System.out.print("Please select from the list above: ");
        byte selection = input.nextByte();
        for(byte x = 0; x <=size; x++) {
            for(byte y = size; y > x; y--) {
                System.out.print(" ");
            }
            for(byte z = 1; z <= x; z++) {
                getDisplayOutput(selection, z);
            }
            System.out.println();
         }
        for(byte x = 1; x <=size; x++) {
            for(byte y = 1; y <= x; y++) {
                System.out.print(" ");
            }
            for(byte z = size; z >= x+1; z--) {
                getDisplayOutput(selection, size-z+1);
            }
            System.out.println();
        }
        input.close();
    }

    public static void getDisplayOutput(byte selection, int i) {
        switch (selection) {
            case 1 -> System.out.print("* ");
            case 2 -> System.out.print(i + " ");
        }
    }
}