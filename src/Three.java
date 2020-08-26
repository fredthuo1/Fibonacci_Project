import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Project! We will do multiple things in this project.");
        Instant instantStart = Instant.now();
        System.out.println("First! We will calculate the 10,000'th fibonacci number:\n" +
                "Which is: " + fibThree( 10000 ));
        Instant instantEnd = Instant.now();
        System.out.println("The number has: " + String.valueOf(fibThree( 10000 )).length() + " digits.");
        long time = Duration.between( instantStart, instantEnd ).toMillis();
        System.out.println("Start time: " + instantStart + "\n" +
                "Stop time: " + instantEnd + "\n" +
                "Total time: " + time + " milliseconds");
        System.out.println("Try the program for yourself!\n" +
                "Enter the fibonacci number you would like to be calculate: ");
        Scanner scanner = new Scanner(System.in);
        String in = "";
        int input = 0;
        in = scanner.nextLine();
        if( in.isEmpty() ) {
            System.out.println("Nothing was input so we will pass in the default value: 100");
            input = 100;
        } else {
            input = Integer.valueOf(in);
        }
        Instant instant = Instant.now();
        System.out.println("The output of your input is: " + fibThree( input ));
        Instant instant1 = Instant.now();
        long timeTaken = Duration.between( instant, instant1 ).toMillis();
        System.out.println( "And it started calculating at: " + instantStart + "\n" +
                "And it ended the calculation at: " + instantEnd + "\n" +
                "Time taken: " + timeTaken + " milliseconds");
    }

    public static BigInteger fibThree(int n ) {
        BigInteger[] bigIntegers = new BigInteger[100000];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;

        for ( int i = 2; i <= n; i++ ) {
            bigIntegers[i] = bigIntegers[ i - 1 ].add( bigIntegers[ i - 2 ] );
        }

        return bigIntegers[n];
    }
}
