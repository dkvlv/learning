import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x == 0) {
            System.out.println(x + "! = 1");
        } else {
            int y = 1;
            for (int z = 1; z <= x; z++) {
                y = y * z;
            }
            System.out.println(x + "! = " + y);
        }
    }
}
