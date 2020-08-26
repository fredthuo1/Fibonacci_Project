import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {
    public static void main( String[] args ) {
        Instant start = Instant.now();
        System.out.println("50th Fib number: " + fibOne(92 ));
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toSeconds();
        System.out.println("Time: " + timeElapsed + " Seconds");

        System.out.println("Second: " + fibTwo());

        Instant instantStart = Instant.now();
        System.out.println("Time1: " + instantStart);
        System.out.println("The 10,000'th fibonacci number is: " + fibThree( 10000 ));
        System.out.println("Number of digits: " + String.valueOf(fibThree( 10000 )).length());
        Instant instantEnd = Instant.now();
        System.out.println("Time2: " + instantEnd);
        long time = Duration.between( instantStart, instantEnd ).toMillis();
        System.out.println("Time it took to get 10000'th term is " + time + " ms!");
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

    public static int fibTwo() {
        BigInteger[] bigIntegers = new BigInteger[1000];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;

        for ( int i = 2; i < bigIntegers.length; i++ ) {
            bigIntegers[i] = bigIntegers[ i - 1 ].add( bigIntegers[ i - 2 ] );
        }

        ArrayList arrayList = new ArrayList();
        for ( int j = 1; j < bigIntegers.length; j++) {
            if( (bigIntegers[j].compareTo(BigInteger.valueOf(Long.MAX_VALUE))) == -1 ) {
                arrayList.add(bigIntegers[j]);
            }
        }



        return arrayList.size();
    }

    public static BigInteger fibThree( int n ) {
        BigInteger[] bigIntegers = new BigInteger[10001];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;

        for ( int i = 2; i < bigIntegers.length; i++ ) {
            bigIntegers[i] = bigIntegers[ i - 1 ].add( bigIntegers[ i - 2 ] );
        }

        return bigIntegers[10000];
    }
}
