import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        Scanner sc = new Scanner(System.in);

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int foundIndex = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        }

        else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
