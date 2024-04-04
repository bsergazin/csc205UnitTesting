/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        double outcome = add(4, 5);
        System.out.println(outcome == 9);

       
        
    }

    public static double add(double x, double y) {
        return x+y;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for(int d = 2; d <= Math.sqrt(number); d++) {
            if(number % d == 0) {
                return false;
            } 
        }
        return true;
    }
}