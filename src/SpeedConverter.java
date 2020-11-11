public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHours){
        if (kilometersPerHours <0) {
            return -1;
        }else {
            return Math.round(kilometersPerHours/1.609);

        }
    }
    public static void printConversion(double kilometersPerHours){
        if (kilometersPerHours<0) {
            System.out.println("Invalid Value");
        }else {
            long milesPerHours=toMilesPerHour(kilometersPerHours);
            System.out.println(kilometersPerHours+" km/h = "+milesPerHours+" mi/h");
        }
    }
//    eND OF THE Original class body

}

class Demo{
//Hello this the Chetan
}
