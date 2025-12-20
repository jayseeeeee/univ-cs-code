public class Loops {
    public static void main(String[] args) {
        // do while loop
        int i = 0;
        do {
            System.out.println(++i);
        } while(i < 5);

        // while loop
        int j = 0;
        while(j < 10) {
            System.out.println(j += 2);
        }

        // for loops
        for(int k = 5; k <= 50; k += 5) {
            System.out.println(k);
        }
    }
}
