

public class Converter {

    public String convertToRoman(int number) {

        Digit[] values = Digit.values();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i].getArab()) {
                number -= values[i].getArab();
                res.append(values[i].getRoman());
            }
        }
        return res.toString();
    }

    public int convertToArab(String number) {
        int arab = 0;
        for (int i = 0; i < number.length() - 1; i++) {

            int currentDigit = Digit.valueOf(String.valueOf(number.charAt(i))).getArab();
            int nextDigit = Digit.valueOf(String.valueOf(number.charAt(i + 1))).getArab();
            if (nextDigit > currentDigit) {
                arab = arab - currentDigit;
            } else {
                arab = arab + currentDigit;
            }
        }
        return arab + Digit.valueOf(String.valueOf(number.charAt(number.length() - 1))).getArab();
    }
}



