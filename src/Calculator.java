

public class Calculator {

    public int calculate(int firstNumber, int secondNumber, char operation) {
      int result;
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                default:
                    throw new IncorrectInputException(ExceptionMessages.OPERATION_SYMBOL_MESSAGE);
            }
        return result;
        }

    }


