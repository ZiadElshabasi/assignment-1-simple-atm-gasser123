package ATM;

public class history{
 private static int hist[]=new int[5];
 static String type[]=new String[5];

    public static int[] getHist() {
        return hist;
    }

    public static int sethist(int i, int x){
        hist[i]=x;

        return x;
    }

}
