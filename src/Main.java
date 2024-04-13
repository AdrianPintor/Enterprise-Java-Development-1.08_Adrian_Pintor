import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal();
        BigDecimal1();
    }
    //EXERCISE1
    private static void BigDecimal(){
    BigDecimal number1 = new BigDecimal("4.2545");
        double result = rounded(number1);
        System.out.println(result);
    }

    public static double rounded(BigDecimal number) {
        BigDecimal roundedNumber = number.setScale(2, BigDecimal.ROUND_HALF_UP);
        return roundedNumber.doubleValue();
    }
    //EXERCISE 2
    private static void BigDecimal1() {
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");

        BigDecimal result1 = invertedAndRound(number1);
        BigDecimal result2 = invertedAndRound(number2);

        System.out.println(result1);
        System.out.println(result2);
    }
    public static BigDecimal invertedAndRound (BigDecimal result){
        BigDecimal inverted = result.negate();
        BigDecimal rounded = inverted.setScale(1, BigDecimal.ROUND_HALF_UP);
        return rounded;
    }
}


