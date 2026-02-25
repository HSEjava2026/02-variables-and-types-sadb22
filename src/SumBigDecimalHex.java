import java.math.BigDecimal;
import java.math.BigInteger;

public class SumBigDecimalHex {
    public static void main(String[] args) {

        BigDecimal sum = BigDecimal.ZERO;

        for (String arg : args) {

            String[] parts = arg.split("\\p{javaWhitespace}+");

            for (String part : parts) {

                if (part.isEmpty()) {
                    continue;
                }

                String lowerPart = part.toLowerCase();

                if (lowerPart.startsWith("0x") || lowerPart.startsWith("-0x") || lowerPart.startsWith("+0x")) {

                    String hexPart = lowerPart.replace("0x", "");

                    if (hexPart.startsWith("+")) {
                        hexPart = hexPart.substring(1);
                    }

                    if (hexPart.contains("s")) {

                        int sIndex = hexPart.indexOf('s');

                        String mantissaStr = hexPart.substring(0, sIndex);
                        String scaleStr = hexPart.substring(sIndex + 1);

                        if (mantissaStr.startsWith("+")) {
                            mantissaStr = mantissaStr.substring(1);
                        }

                        if (scaleStr.startsWith("+")) {
                            scaleStr = scaleStr.substring(1);
                        }

                        BigInteger mantissa = new BigInteger(mantissaStr, 16);
                        int scale = Integer.parseInt(scaleStr, 16);

                        sum = sum.add(new BigDecimal(mantissa, scale));

                    } else {

                        BigInteger mantissa = new BigInteger(hexPart, 16);
                        sum = sum.add(new BigDecimal(mantissa));
                    }

                } else {

                    sum = sum.add(new BigDecimal(part));

                }
            }
        }

        System.out.println(sum);
    }
}