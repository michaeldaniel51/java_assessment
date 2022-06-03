public class ComputeTheSumOfAnInteger {

    public static void main(String[] args) {
        System.out.println(sumofdigit(5));

    }

    static int sumofdigit(int digit){
        int firstnum;
        int secondnum;
        int sum;

            firstnum = digit % 10;
            secondnum = digit / 10;

            sum = firstnum + secondnum;
            return sum;


//         int sum = 0;
//        while(digit != 0){
//            sum += digit % 10;
//            digit /= 10;
//        }
//        return sum;

    }





}
