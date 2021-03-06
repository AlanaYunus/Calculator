import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор! " +
                "Калькулятор умеет работать с арабскими и римскими цифрами." +
                " Для завершения работы введите Exit. " +
                "Введите выражение:");
        Calculator calculator = new Calculator();
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String exampleRead = scanner.nextLine();
            if (exampleRead.equals("Exit")) {
                break;
            }
            String example = exampleRead.replaceAll(" ", "");
            String[] split = example.split("[\\+\\-\\*\\/]", 2);
            if (split.length < 2) {
                throw new IncorrectInputException();
            }

            if (split[0].matches("[0-9]{1,2}")) {
                handleArab(calculator, exampleRead, split);
            } else {
                handleRoman(calculator, converter, exampleRead, split);
            }

        }
    }

    private static void handleRoman(Calculator calculator, Converter converter, String exampleRead, String[] split) {
        int firstNumber = converter.convertToArab(split[0]);
        int secondNumber = converter.convertToArab(split[1]);
        char operation = exampleRead.replaceAll("[A-Z]", "").trim().charAt(0);

        int arabResult = calculator.calculate(firstNumber, secondNumber, operation);
        if (arabResult < 1) {
            throw new IncorrectInputException(ExceptionMessages.ROMAN_NEGATIVE_MESSAGE);
        }
        String romanResult = converter.convertToRoman(arabResult);
        System.out.println(romanResult);
    }

    private static void handleArab(Calculator calculator, String exampleRead, String[] split) {
        int firstNumber;
        int secondNumber;
        char operation = exampleRead.replaceAll("\\d", "").trim().charAt(0);

        try {
            firstNumber = Integer.parseInt(split[0]);
            secondNumber = Integer.parseInt(split[1]);
            if ((firstNumber < 1 || firstNumber > 10) || (secondNumber < 1 || secondNumber > 10)) {
                throw new IncorrectInputException(ExceptionMessages.ONE_TO_TEN_MESSAGE);
            }
        } catch (IncorrectInputException e) {
            throw e;
        } catch (Exception e) {
            throw new IncorrectInputException();
        }

        int result = calculator.calculate(firstNumber, secondNumber, operation);
        System.out.println(result);
    }


}







