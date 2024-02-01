import java.util.Random;

class Stake {
    public int EveryDayStack;
    public int EveryGameStack;
    public int gamblerWon;
    public int gamblerLoose;
    public int totalWon;
    public int totalLost;
    public int numOfDays;

    public Stake() {
        EveryDayStack = 100;
        EveryGameStack = 1;
        gamblerLoose = 0;
        gamblerWon = 0;
        totalWon = 0;
        totalLost = 0;
        numOfDays = 20;
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

        for (int day = 1; day <= gamblerStake.numOfDays; day++) {
            int winOrLose = rand.nextInt(2);

            if (winOrLose == 1) {
                gamblerStake.gamblerWon += 1;
                gamblerStake.totalWon += gamblerStake.EveryGameStack;
                System.out.println("Day " + day + ": He Won. New stake: " + gamblerStake.gamblerWon);
            } else {
                gamblerStake.gamblerLoose -= 1;
                gamblerStake.totalLost += gamblerStake.EveryGameStack;
                System.out.println("Day " + day + ": He Lost. New stake: " + gamblerStake.gamblerLoose);
            }
        }

        System.out.println("\nAfter " + gamblerStake.numOfDays + " days:");
        System.out.println("Total Amount Won: " + gamblerStake.totalWon);
        System.out.println("Total Amount Lost: " + gamblerStake.totalLost);
    }
}
