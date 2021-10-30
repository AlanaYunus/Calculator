
/*
Переобуваемся на лету
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        System.out.println(converter.convertToArab("XLIII"));
        System.out.println(converter.convertToRoman(43));
        int a;
        int b;
        int res;
        char op;
        Scanner scanner = new Scanner(System.in);
        String exampleRead = scanner.nextLine();
        String example = exampleRead.replaceAll(" ", "");
        String[] split = example.split("\\D");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        String oper = exampleRead.replaceAll("\\d", "").trim();
        op = oper.charAt(0);

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
                System.out.println("Error!");
                return;
        }
        System.out.println(res);
    }


}








