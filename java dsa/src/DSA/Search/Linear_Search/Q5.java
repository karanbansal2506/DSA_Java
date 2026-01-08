package DSA.Search.Linear_Search;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {-11, 258, 3645, 87, 5246, 547};
        int EvenDigitNumbers = 0;
        for (int num :arr) {
            if (digit(num)%2 ==0){
                EvenDigitNumbers++;
            }
        }
        System.out.println(EvenDigitNumbers);
    }

    static int digitCounter(int num){
        int x =num;
//        if (num <0){
//            num = num * -1;  (to make positive but not required as i am using x!=0 instead of x>0)
//        }
        int i=0;
        while(x!=0){
            x=x/10;
            i++;
        }
        return i;
    }

    static int digit(int num){
        if (num <0){
            num = num* -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
