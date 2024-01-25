import java.util.Random;

class Stake {
    public int EveryDayStack;
    public int EveryGameStack;
    public int NumOfDays;
    public int DayStackEarn;
    public int DayStack

    public int Test;

    public Stake() {
        EveryDayStack = 100;
        EveryGameStack = 1;

    }

}

    lic

    static void main(String[] args) {
        Random rand = new Random();
        
    Stake obj = new Stake();
    int WonORLoss = rand(int 2);
        for (int i= 0 i<= 100;i++){
            if ( WonORLoss == 1 ){
                obj.DayStackEarn += 1;
            }
            else{
                obj.DayStackEarn -= 1;
        

        if (obj.DayStackEarn<=50){
            System.out.println("earned Enougth Stack for the day..!");
        }else{
            System.out.println("loos Stack for the day");
        }

    public  winORlose(){
            return Math.abs(rand.nextInt());
        }

   }

