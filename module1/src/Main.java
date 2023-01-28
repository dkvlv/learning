import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double a = x + y;
        double b = x - y;
        double c = x * y;
        double d = x / y;

        System.out.println("Результат сложения: " + a);
        System.out.println("Результат вычитания: " + b);
        System.out.println("Результат умножения: " + c);
        System.out.println("Результат деления: " + d);
    }
}
