package ru.hse.java2026;

public class SumDoubleHex {
    public static void main(String[] args){
        double sum = 0;

        for (String arg: args){
            double number = Double.parseDouble(arg);
            sum += number;
        }
        System.out.println(sum);
    }
}
