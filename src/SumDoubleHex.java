public class SumDoubleHex {
    public static void main(String[] args) {

        double sum = 0.0;

        for (String arg : args) {

            String[] parts = arg.split("\\p{javaWhitespace}+");

            for (String part : parts) {

                if (part.isEmpty()) {
                    continue;
                }

                if (part.toLowerCase().startsWith("0x")) {

                    if (part.toLowerCase().contains("p")) {
                        sum += Double.parseDouble(part);
                    } else {
                        sum += Long.parseLong(part.substring(2), 16);
                    }

                } else {
                    sum += Double.parseDouble(part);
                }
            }
        }

        System.out.println(sum);
    }
}