import java.util.Scanner;

public class Main {
    public static String culc(String input) throws Exception {
        int a;
        int b;
        String operation;
        int result;

        String[] elements = input.replaceAll(" ","").split("(?<=[+\\-*/])|(?=[+\\-*/])");
        if (elements.length != 3) throw new Exception("Недопустимый формат записи");
        a = Integer.parseInt(elements[0]);
        operation = elements[1];
        b = Integer.parseInt(elements[2]);
        if (a < 1 || a > 10 || b < 1 || b > 10) throw new Exception("Недопустимое число");

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = 0; // недостижимая строка, но без нее возникает ошибка того, что переменной result может быть не присвоенно значение.
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.print("input: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("output: " + culc(scan.nextLine()));
    }
}

