import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rng = new Random();
        int dice = 1;
        while(dice <= 50) {
            if (dice < 50) {
                System.out.println(dice + " - Better luck next time");
            }
            else {
                System.out.println(dice + " - Bingo!");
                break;
            }
            dice = rng.nextInt(51);
        }
    }
}
