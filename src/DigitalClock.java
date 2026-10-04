import java.util.Scanner;

public class DigitalClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println("h: " + h + ", m: " + m + ", s: " + s);

        scanner.close();
    }
}
