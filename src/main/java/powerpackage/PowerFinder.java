package powerpackage;

public class PowerFinder {

    public static void main(String[] args) {
        System.out.println(OF(2,5));
    }
    public static int OF(int number, int powerValue) {
        int result = 1;
        for (int iterate = 0; iterate<powerValue; iterate++) {
            result *= number;
        }
        return result;
    }
}
