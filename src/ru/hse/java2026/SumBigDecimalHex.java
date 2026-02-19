package ru.hse.java2026;

import java.math.BigDecimal;

public class SumBigDecimalHex {

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal("0");

        for (String arg : args) {

            BigDecimal number;

            if (arg.toLowerCase().startsWith("0x")) {


                String hex = arg.substring(2).toLowerCase();

                String[] parts = hex.split("s");

                int mantissa = Integer.parseInt(parts[0], 16);
                int exponent = Integer.parseInt(parts[1], 16);

                number = new BigDecimal(mantissa).scaleByPowerOfTen(-exponent);

            } else {

                number = new BigDecimal(arg);

            }

            sum = sum.add(number);
        }

        System.out.println(sum);
    }
}
