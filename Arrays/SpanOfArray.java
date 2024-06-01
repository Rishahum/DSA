import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Initialize an array of size n
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();


        // Initialize min and max to the first element of the array
        int min = array[0];
        int max = array[0];

        System.out.println("Min value:" + min);
        // Find the min and max elements in the array
        System.out.println("Max value:" + max);

        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Calculate the span of the array
        int span = max - min;
        System.out.println("Span of the array: " + span );
        // System.out.println(span);

        // Close the scanner to avoid resource leaks
    }
}

