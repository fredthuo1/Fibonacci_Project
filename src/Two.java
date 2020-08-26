import java.math.BigInteger;
import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci project! Question number 2.\n" +
                "In this question we will find the approximate largest problem size without getting an overflow.\n" +
                "The largest long value is: " + Long.MAX_VALUE + "\n" +
                "The largest problem size is: " + fibTwo() + "\n" +
                "Whose value is: " + fibThree(fibTwo() ) );
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
        BigInteger[] bigIntegers = new BigInteger[1000];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;

        for ( int i = 2; i < bigIntegers.length; i++ ) {
            bigIntegers[i] = bigIntegers[ i - 1 ].add( bigIntegers[ i - 2 ] );
        }

        return bigIntegers[n];
    }
}
