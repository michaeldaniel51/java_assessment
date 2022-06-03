public class SwapTwoVariables {


    public static void main(String[] args) {


        swap(15,27);
        swap1(2,5);



    }


    static void  swap(int a,int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" after swapping = " +a+ ","+ +b);
    }

    static void swap1(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping = "+a+ "," + b);

    }






}
