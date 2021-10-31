

public class Calculator {

    public int calculate(int firstNumber, int secondNumber, char operation) throws Exception {
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
                    throw new Exception(ExceptionMessages.OPERATION_SYMBOL_MESSAGE);
            }
        return result;
        }

    }


