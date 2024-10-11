import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        for (int t = 0; t < N; t++) {
            String line = input.nextLine().toLowerCase();
            int[] freq = new int[26];

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    freq[c - 'a']++;
                }
            }

            int maxFreq = 0;
            for (int f : freq) {
                if (f > maxFreq) {
                    maxFreq = f;
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (freq[i] == maxFreq) {
                    result.append((char) (i + 'a'));
                }
            }

            System.out.println(result.toString());
        }
    }
}
