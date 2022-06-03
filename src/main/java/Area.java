public class Area {

    public static void main(String[] args) {

        System.out.println(" the area of a hexagon is: = " + hexagon(6));
        System.out.println(" the area of a polygon is: = " + polygon(7,6));
    }

    static double hexagon(double a) {
        return (6 * (a * a)) / (4 * Math.tan(Math.PI / 6));


    }

    static double polygon(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan(Math.PI / ns));
    }
}