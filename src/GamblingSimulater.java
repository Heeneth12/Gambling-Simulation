
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

public class GamblingSimulater {

    public static void main(String[] args) {

        Stake obj = new Stake();
        System.out.println(obj);

    }

}
