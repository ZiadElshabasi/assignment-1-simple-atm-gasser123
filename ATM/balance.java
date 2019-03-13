package ATM;

public class balance {
    private static int currentbalance;

    public static int getCurrentbalance() {
        return currentbalance;
    }

    public static void setCurrentbalance(int x,int amount) {
        if (x==1){
            currentbalance=currentbalance+amount;

        }
        if (x==2){

            currentbalance=currentbalance-amount;

        }
    }
}
