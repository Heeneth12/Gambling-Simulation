import java.util.Random;

class Stake {
    public int EveryDayStack;
    public int EveryGameStack;

    public Stake() {
        EveryDayStack = 100;
        EveryGameStack = 1;
    }

    @Override
    public String toString() {
        return "Stake [EveryDayStack=" + EveryDayStack + ", EveryGameStack=" + EveryGameStack + "]";
    }
}

public class GamblingSimulator {

    public static void main(String[] args) {
        Random rand = new Random();
        Stake obj = new Stake();
        int WinOrLose = rand.nextInt(2);
        // Generates either 0 or 1 randomly
        if (WinOrLose == 1) {
            System.out.println("He Won  " + WinOrLose + " stake");
        } else {
            System.out.println("He lose " + WinOrLose + " stake");

        }

    }
}