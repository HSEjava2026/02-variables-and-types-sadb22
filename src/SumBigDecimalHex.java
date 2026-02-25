package ru.hse.java2026;

import java.math.BigDecimal;

public class SumBigDecimalHex {

    public static void main(String[] args) {

        BigDecimal sum = BigDecimal.ZERO;

        for (String arg : args) {

            String[] tokens = arg.split("\\s+");

            for (String token : tokens) {

                if (token.isEmpty()) continue;

                BigDecimal number;

                if (token.startsWith("0x") || token.startsWith("0X")) {

                    if (token.contains("p") || token.contains("P")) {
                        // hex floating point
                        number = BigDecimal.valueOf(Double.parseDouble(token));
                    } else {
                        // hex integer
                        number = BigDecimal.valueOf(
                                Long.parseLong(token.substring(2), 16)
                        );
                    }

                } else {
                    // decimal
                    number = new BigDecimal(token);
                }

                sum = sum.add(number);
            }
        }

        System.out.println(sum);
    }
}
