public class SpeeDConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
    }
    public static  long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return  -1;
        double res =  (kilometersPerHour * 0.621371 );
        return  Math.round(res);
    }
}
