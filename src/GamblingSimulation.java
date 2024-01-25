import java.util.Random;

class Stake {
    public int EveryDayStack;
    public int EveryGameStack;
    public int NumOfDays;
    public int TotalStack;

    public Stake() {
        EveryDayStack = 100;
        EveryGameStack = 1;
        NumOfDays = 30; // Set the number of days for the simulation
        TotalStack = EveryDayStack * NumOfDays; // Initialize total stack for all days
    }
}

public class GamblingSimulation {
    public static void main(String[] args) {
        Random rand = new Random();

        Stake obj = new Stake();

        for (int day = 1; day <= obj.NumOfDays; day++) {
            int gamesPlayed = 0;
            int dayStack = obj.EveryDayStack;

            while (dayStack > 0) {
                int wonOrLoss = rand.nextInt(2);

                if (wonOrLoss == 1) {
                    dayStack += obj.EveryGameStack;
                } else {
                    dayStack -= obj.EveryGameStack;
                }

                gamesPlayed++;
            }

            System.out.println("Day " + day + ": Played " + gamesPlayed + " games. Remaining Stack: " + dayStack);
            obj.TotalStack += dayStack;
        }

    }
}
