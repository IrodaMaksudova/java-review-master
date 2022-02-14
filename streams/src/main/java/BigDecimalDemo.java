import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d1 = 174.56;
        double d2 = 174.26;

        System.out.println(d1 - d2);

        //instead of double, we are using BigDecimal
        BigDecimal b1 = new BigDecimal("174.56");
        BigDecimal b2 = new BigDecimal("174.26");

        //bigDecimal passes the value object way.
        // It is an object, we can't subtract them from each other like we do with doubles
        //Thus we need to use ready methods of bigDecimal, like ones below
        System.out.println(b1.subtract(b2));

        //Scaling and Routing
        BigDecimal number1 = new BigDecimal(23.12);
        //   System.out.println(number1.setScale(1));  //if we want to see 1 digit, this won't work, because rounding is necessary
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));

        //compareTo returns 1; -1; or 0
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));

        //BigDecimals are immutable, not changable

        
    }

}
