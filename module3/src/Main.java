import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ((Math.pow(x, y)) % 2 == 0) {
            System.out.println("Ezzzz!");
        } else {
            System.out.println("Ne chetnoe, rezultat deleniya = " + (Math.pow(x, y)) / 3 + "!");
        }
    }
}
