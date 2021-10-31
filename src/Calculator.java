

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
                    throw new Exception("Введите знак операции: +, -, * или /");
            }
        return result;
        }

    }


