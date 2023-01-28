import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // имеет ли смысл учитывать 3, если число, делящееся на 6, делится и на 3?
        if (x % 3 == 0 && x % 6 == 0) {
            System.out.print("Число делится нацело на 3 и на 6");
        } else {
            System.out.print("Число не делится нацело на 3 и на 6");
        }
    }
}
