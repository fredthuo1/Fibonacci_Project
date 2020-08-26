import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println("Welcome to Fibonacci Project!\n" +
                "Question number 1:\n" +
                "It will take approximately 1 minute on my machine to calculate the 50'th fibonacci number.\n" +
                "Which is: " +
                fibOne(50) );
        Instant stop = Instant.now();
        long time = Duration.between(start, stop).toSeconds();
        System.out.println("Start time: " + start +
                "\nStop time: " + stop +
                "\nTotal Time: " + time + " seconds");
        Scanner scanner = new Scanner(System.in);
        System.out.println("To try yourself. Enter the fibonacci number that you would like to be calculated: ");
        int input = scanner.nextInt();
        Instant instantStart = Instant.now();
        System.out.println("The answer to your input is: " + fibOne(input));
        Instant instantStop = Instant.now();
        long timeTaken = Duration.between(instantStart, instantStop).toSeconds();
        System.out.println("Start time: " + instantStart + "\n" +
                "Stop time: " + instantStop + "\n" +
                "Total time take: " + timeTaken + " seconds");

    }

    public static long fibOne( int n ) {
        long fib = 0;
        if ( n <= 0 ) {
            fib = 0;
        }
        else if ( n == 1 ) {
            fib = 1;
        } else {
            fib = fibOne( n-1 ) + fibOne( n-2 );
        }
        return fib;
    }
}
