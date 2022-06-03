public class CompareTwoNumbers {

    public static void main(String[] args) {

        compare(25,39);
    }
    static void compare(int a, int b){

        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a != b) {
            System.out.println(a + " != " + b);
        }
        if (a <= b) {
            System.out.println(a + " <= " + b);
        }
    }
}

