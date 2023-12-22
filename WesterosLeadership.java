BestBubbleimport java.util.Scanner;

public class BestBubble {

    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        return ascending || descending;
    }

    public static int minSwapsToBeautiful(int[] arr) {
        int n = arr.length;
        int minSwapsAsc = Integer.MAX_VALUE;
        int minSwapsDesc = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements and check the number of swaps needed for ascending order
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (isSorted(arr)) {
                    minSwapsAsc = Math.min(minSwapsAsc, j - i);
                }

                // Swap back to the original state
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Swap elements and check the number of swaps needed for descending order
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (isSorted(arr)) {
                    minSwapsDesc = Math.min(minSwapsDesc, j - i);
                }

                // Swap back to the original state
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return Math.min(minSwapsAsc, minSwapsDesc);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output
        int result = minSwapsToBeautiful(arr);
        System.out.println(result);
    }
}
