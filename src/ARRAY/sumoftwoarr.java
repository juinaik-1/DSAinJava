
import java.util.Scanner;
public class sumoftwoarr {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input array arr1
        System.out.println("Enter the size of array arr1:");
        int size1 = scanner.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the elements of array arr1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        // Input array arr2
        System.out.println("Enter the size of array arr2:");
        int size2 = scanner.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of array arr2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // Initialize the output array with a size of maximum length among arr1 and arr2 plus 1 (for possible carry)
        int output[] = new int[Math.max(arr1.length, arr2.length) + 1];

        // Call the sumOfTwoArrays function to calculate the sum of arr1 and arr2 and store the result in output array
        sumOfTwoArrays(arr1, arr2, output);

        // Print the sum of arr1 and arr2
        System.out.println("Sum of arrays arr1 and arr2:");
        for (int num : output) {
            System.out.print(num + " ");
        }
        
        // Close the Scanner object
        scanner.close();
    }

    // Function to calculate the sum of two arrays and store the result in the output array
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int m = arr1.length - 1;
        int n = arr2.length - 1;
        int carry = 0;
        int x = output.length - 1; // Index to store the sum in the output array

        // Iterate through both arrays from the end
        while (m >= 0 && n >= 0) {
            int sum = arr1[m] + arr2[n] + carry;
            output[x] = sum % 10; // Store the unit place digit in the output array
            carry = sum / 10; // Update the carry for the next iteration
            m--; n--; x--; // Move to the previous indices
        }

        // Handle remaining elements in arr1 (if any)
        while (m >= 0) {
            int sum = arr1[m] + carry;
            output[x] = sum % 10;
            carry = sum / 10;
            m--; x--;
        }

        // Handle remaining elements in arr2 (if any)
        while (n >= 0) {
            int sum = arr2[n] + carry;
            output[x] = sum % 10;
            carry = sum / 10;
            n--; x--;
        }

        output[0] = carry; // Store the carry in the first index of the output array
    }
}

