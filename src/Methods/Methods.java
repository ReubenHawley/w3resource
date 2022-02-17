package Methods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Methods {
    public static String Capitalise(String input) {
        String output = "";
        if (input != null) {
            output = input.substring(0, 1).toUpperCase() + input.substring(1);
        } else {
            return output;
        }
        return output;
    }

    public static void printDateTime() {

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy-HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Current date and time: ");
        sb.append(Capitalise(dt.getDayOfWeek().toString().toLowerCase()));
        sb.append(' ');
        sb.append(Capitalise(dt.getMonth().toString().toLowerCase()));
        sb.append(' ');
        sb.append(dt.getDayOfMonth());
        sb.append(", ");
        sb.append(dt.getYear());
        sb.append(' ');
        sb.append(dt.getHour());
        sb.append(':');
        sb.append(dt.getMinute());
        sb.append(':');
        sb.append(dt.getSecond());
        System.out.println(sb);
    }

    public static int[] findPrimes(int range) {
        ArrayList<Integer> primesList = new ArrayList<>();
        primesList.add(1);

        int temp = 0;
        for (int i = 1; i < range; i++) {
            for (int j = 1; j < i; j++) {
                if (i == 1 || i % j == 0) {
                    if (temp == j) {
                        primesList.add(i - 1);
                    }
                    temp = j;
                }
            }
        }
        int[] primes = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primes[i] = primesList.get(i);
        }
        return primes;
    }


    public static void findTwinPrimeNumbers(int range) {
        int[] primes = findPrimes(range);
        for (int i = 0; i < primes.length; i++) {
            if(i>1){
//                System.out.println(primes[i]-2);
                if((primes[i]-2)==primes[i-1]){
                    System.out.println("("+primes[i-1]+","+primes[i]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        printDateTime();
        findTwinPrimeNumbers(100);


    }
}
