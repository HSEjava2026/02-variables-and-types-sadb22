package ru.hse.java2026;

public class SumCalculator {
    public static void main(String[] args){
        int sum = 0;
        for (String arg: args){
            String[] parts = arg.split(" ");
            for (String part: parts){
                if (!part.isEmpty()){
                    sum += Integer.parseInt(part);
                }
            }

        }
        System.out.println(sum);
    }
}
