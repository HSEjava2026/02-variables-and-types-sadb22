public class Sum {
    public static void main(String[] args) {

        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (String arg : args) {
            for (int i = 0; i < arg.length(); i++) {
                char c = arg.charAt(i);

                if (Character.isDigit(c) || c == '-') {
                    number.append(c);
                } else {
                    if (number.length() > 0) {
                        sum += Integer.parseInt(number.toString());
                        number.setLength(0);
                    }
                }
            }

            if (number.length() > 0) {
                sum += Integer.parseInt(number.toString());
                number.setLength(0);
            }
        }

        System.out.println(sum);
    }
}