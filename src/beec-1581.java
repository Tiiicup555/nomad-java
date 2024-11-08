import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfCases; i++) {
            int peopleCount = sc.nextInt();
            sc.nextLine();

            String firstLanguage = sc.nextLine();
            boolean allSameLanguage = true;

            for (int j = 1; j < peopleCount; j++) {
                String language = sc.nextLine();
                if (!language.equals(firstLanguage)) {
                    allSameLanguage = false;
                }
            }

            if (allSameLanguage) {
                System.out.println(firstLanguage);
            } else {
                System.out.println("ingles");
            }
        }

        sc.close();
    }
}