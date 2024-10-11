import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while ( in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String result = solve(line);
            System.out.println(result);
        }
    }

    public static String solve(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(arr[i])) {
                if (count % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                count++;
            }
        }
        return String.valueOf(arr);
    }
}
