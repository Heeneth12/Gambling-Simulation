import java.util.Random;

class Stake {
    public int EveryDayStack;
    public int EveryGameStack;
    public int gamblerWon;
    public int gamblerLoose;

    public Stake() {
        EveryDayStack = 100;
        EveryGameStack = 1;
        gamblerLoose = 0;
        gamblerWon = 0;
    }

    @Override
    public String toString() {
        return "Stake [EveryDayStack=" + EveryDayStack + ", EveryGameStack=" + EveryGameStack + "]";
    }
}

public class GamblingSimulator {

    public static void main(String[] args) {
        Random rand = new Random();
        Stake gamblerStake = new Stake();

        while (gamblerStake.gamblerWon < 50 && gamblerStake.gamblerLoose > -50) {
            int winOrLose = rand.nextInt(2);

            if (winOrLose == 1) {
                gamblerStake.gamblerWon += 1;
                System.out.println("He Won. New stake: " + gamblerStake.gamblerWon);
            } else {
                gamblerStake.gamblerLoose -= 1;
                System.out.println("He Lost. New stake: " + gamblerStake.gamblerLoose);
            }
        }

        if (gamblerStake.gamblerWon >= 50) {
            System.out.println("Gambler has won 50% or more of the stack. Total days: " + gamblerStake.gamblerWon);
        } else {
            System.out.println(
                    "Gambler has lost 50% or more of the stack. Total days: " + Math.abs(gamblerStake.gamblerLoose));
        }
    }
}
