
/*
Переобуваемся на лету
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Добро пожаловать в калькулятор! " +
                "Калькулятор умеет работать с арабскими и римскими цифрами. " +
                "Введите выражение:");
        Calculator calculator = new Calculator();
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        char op;
        String oper;
        while (true) {
            String exampleRead = scanner.nextLine();
            String example = exampleRead.replaceAll(" ", "");
            String[] split = example.split("[\\+\\-\\*\\/]", 2);

            if (split[0].matches("[0-9]")) {
                 oper = exampleRead.replaceAll("\\d", "").trim();
                op = oper.charAt(0);

                try {
                    a = Integer.parseInt(split[0]);
                    b = Integer.parseInt(split[1]);
                    if ((a < 1 || a > 10) || (b < 1 || b > 10)) {

                        throw new Exception("Введите число от 1 до 10 включительно");
                    }
                } catch (Exception e) {
                    throw new Exception("Введено некорректное выражение");
                }


                int result = calculator.calculate(a, b, op);

                System.out.println(result);

            } else {
                        a = converter.convertToArab(split[0]);
                        b = converter.convertToArab(split[1]);
                oper = exampleRead.replaceAll("[A-Z]", "").trim();
                op = oper.charAt(0);
                int arabResult = calculator.calculate(a, b, op);
                if(arabResult<1) {
                    throw new Exception("Результат в римских цифрах не может быть меньше одного");
                }
                String romanResult = converter.convertToRoman(arabResult);
                System.out.println(romanResult);
            }

        }
    }


}







