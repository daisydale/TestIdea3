import java.math.BigDecimal;

/**
 * Created by daisy on 2017-08-11.
 */
public class StaticTry {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("9");
        BigDecimal b = new BigDecimal("8");
      String t = a.add(b).toString();
      String tt =a.abs(b).toString();
        System.out.println(tt);
        System.out.println(a);
    }

}
