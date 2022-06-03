public class AreaOfARectangle {



    public static void main(String[] args) {


        double width = 5.6;
        double height = 8.5;

        double perimeter = 2*(height + width);
        double area = width * height;

        System.out.printf("perimeter is 2*(%.1f + %.1f) = %.2f \n", height,width,perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n",width,height,area);

    }










}
