public class ComputeTwoPointsOnTheSurfaceOfTheEarth {

    public static void main(String[] args) {

    distance(25,35,52.5,35.5);
    }

    static void distance(double lat1,double lon1,double lat2,double lon2){
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthradius = 6371.01;
        System.out.println(earthradius *
                Math.acos(Math.sin(lat1)
                        *Math.sin(lat2)
                        + Math.cos(lat1)
                        *Math.cos(lat2)
                        *Math.cos(lon1-lon2))+ "km");
    }




}
