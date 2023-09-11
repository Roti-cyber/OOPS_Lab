import java.util.Scanner;
 class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int majorityElement = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            int currentCount = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == currentElement) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount && currentCount > n / 2) {
                majorityElement = currentElement;
                maxCount = currentCount;
            }
        }

        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("There is no majority element in the array.");
        }

        scanner.close();
    }
}
