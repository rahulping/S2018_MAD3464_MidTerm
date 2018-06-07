
public class BinaryDecimal {
        public static int convert(String input) {
        Long binary =  Long.valueOf(input).longValue();
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binary != 0)
                    {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

}
