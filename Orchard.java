import java.util.Scanner;

public class Orchard {

    public static int countPossibilities(String trees) {
        int count = 0;
        int n = trees.length();

        for (int i = 0; i < n - 2; i++) {
            if (trees.charAt(i) != trees.charAt(i + 1) && trees.charAt(i + 1) != trees.charAt(i + 2)
                    && trees.charAt(i) != trees.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String ashokTrees = scanner.next();
        String anandTrees = scanner.next();

        // Count possibilities for Ashok and Anand
        int ashokPossibilities = countPossibilities(ashokTrees);
        int anandPossibilities = countPossibilities(anandTrees);

        // Determine the winner or draw
        if (ashokPossibilities > anandPossibilities) {
            System.out.println("Ashok");
        } else if (anandPossibilities > ashokPossibilities) {
            System.out.println("Anand");
        } else {
            System.out.println("Draw");
        }
    }
}
