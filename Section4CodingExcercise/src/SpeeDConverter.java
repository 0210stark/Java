public class SpeeDConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42d));
    }
    public static  long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return  -1;
        return (int) (kilometersPerHour/0.621371d );
    }
}
