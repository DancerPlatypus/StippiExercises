public class SumOddNum {
    public int Sum (int n){

        int oddSum = 0;
        if(n>0){
            for(int i = 1; i <=n; i+= 2){
                oddSum = oddSum + i;
            }
            /*while (i <= n ){
                oddSum = oddSum + i;
                i = i +2;
            }*/
        } else {
            System.out.println("n dev'essere un numero intero positivo!");
        }
        return oddSum;
    }
}
