package ru.hse.java2026;
public class SumDoubleHex {
    public static void main(String[] args) {

        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        if (sum == (long) sum) {
            System.out.println((long) sum);
        } else {
            System.out.println(sum);
        }
    }
}