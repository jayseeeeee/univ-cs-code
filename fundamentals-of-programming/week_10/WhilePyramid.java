public class WhilePyramid {
    public static void main(String[] args) {
        int i = 1;
        while (i<=9) {
            int j = 1;
            while (j<=i) {  
                System.out.print(j + " ");
                j+=2;
            }
            System.out.println();
            i+=2;
        }
    }
}
