
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
        while (true) {
            String exampleRead = scanner.nextLine();
            String example = exampleRead.replaceAll(" ", "");
            String[] split = example.split("[\\+\\-\\*\\/]", 2);

            if (split[0].matches("[0-9]")) {
                handleArab(calculator, exampleRead, split);
            } else {
                handleRoman(calculator, converter, exampleRead, split);
            }
        }
    }

    private static void handleRoman(Calculator calculator, Converter converter, String exampleRead, String[] split) throws Exception {
        int firstNumber = converter.convertToArab(split[0]);
        int secondNumber = converter.convertToArab(split[1]);
        char operation = exampleRead.replaceAll("[A-Z]", "").trim().charAt(0);

        int arabResult = calculator.calculate(firstNumber, secondNumber, operation);
        if (arabResult < 1) {
            throw new Exception("Результат в римских цифрах не может быть меньше одного");
        }
        String romanResult = converter.convertToRoman(arabResult);
        System.out.println(romanResult);
    }

    private static void handleArab(Calculator calculator, String exampleRead, String[] split) throws Exception {
        int firstNumber;
        int secondNumber;
        char operation = exampleRead.replaceAll("\\d", "").trim().charAt(0);

        try {
            firstNumber = Integer.parseInt(split[0]);
            secondNumber = Integer.parseInt(split[1]);
            if ((firstNumber < 1 || firstNumber > 10) || (secondNumber < 1 || secondNumber > 10)) {
                throw new Exception("Введите число от 1 до 10 включительно");
            }
        } catch (Exception e) {
            throw new Exception("Введено некорректное выражение");
        }

        int result = calculator.calculate(firstNumber, secondNumber, operation);
        System.out.println(result);
    }


}







