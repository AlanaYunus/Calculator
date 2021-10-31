

public class Calculator {

    public int calculate(int a, int b, char op) throws Exception {
      int res;
            switch (op) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
                default:
                    throw new Exception("Введите знак операции: +, -, * или /");
            }
        return res;
        }

    }


