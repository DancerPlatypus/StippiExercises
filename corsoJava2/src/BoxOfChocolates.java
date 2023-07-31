import java.util.Scanner;
public class BoxOfChocolates {
    public String [] nameSweets = {"Mint Sweets","Almond Chocolates","Chocolate Biscuits","Chocolate Sweets","Lollipop"};
    public int[] sweets = new int[nameSweets.length];

    public int[] boxOfChocolates() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire n° ordini");
        int order = tastiera.nextInt();

        int[] totalOrder =  {0 ,0 ,0, 0,0};
        for (int i = 0; i < order; i++) {
            System.out.println("Inserire il prossimo ordine:");
            for (int j = 0; j < totalOrder.length; j++) {
                totalOrder[j] += tastiera.nextInt();
            }
        }



        return totalOrder;
    }
    public static int[] combineOrders(int order, int[]sweets){
        int []finalOrder ;
        return null;

    }

}
