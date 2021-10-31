

public class Converter {

    public String convertToRoman(int number) {

        RomanNumeral[] values = RomanNumeral.values();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i].getArab()) {
                number -= values[i].getArab();
                result.append(values[i].getRoman());
            }
        }
        return result.toString();
    }

    public int convertToArab(String number) {
        int arabNumber = 0;
        for (int i = 0; i < number.length() - 1; i++) {

            int currentDigit = RomanNumeral.valueOf(String.valueOf(number.charAt(i))).getArab();
            int nextDigit = RomanNumeral.valueOf(String.valueOf(number.charAt(i + 1))).getArab();
            if (nextDigit > currentDigit) {
                arabNumber = arabNumber - currentDigit;
            } else {
                arabNumber = arabNumber + currentDigit;
            }
        }
        return arabNumber + RomanNumeral.valueOf(String.valueOf(number.charAt(number.length() - 1))).getArab();
    }
}



