
import java.util.Scanner;

class Java1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a < b) {
                int t = a;
                a = b;
                b = t;
            }

            while (b != 0) {
                int t = a;
                a = b;
                b = t % b;
            }

            System.out.println(a);
        }

        in.close();
    }
}