public class OddCount {

    public int oddCount(int num, int oddNum){

            if(num < 10) {
                if (num % 2 == 1) oddNum++;
                return oddNum;
            }
            else {
                int rest = num % 10;
                num=num/10;
                if (rest % 2 == 1) oddNum++;
                oddNum = oddCount(num, oddNum);
                return oddNum;
            }
    }
}
