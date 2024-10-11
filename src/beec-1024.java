import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder encrypted = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    encrypted.append((char) (c + 3));
                } else {
                    encrypted.append(c);
                }
            }

            encrypted.reverse();

            int length = encrypted.length();
            for (int j = length / 2; j < length; j++) {
                encrypted.setCharAt(j, (char) (encrypted.charAt(j) - 1));
            }

            System.out.println(encrypted.toString());
        }

        scanner.close();
    }
}
