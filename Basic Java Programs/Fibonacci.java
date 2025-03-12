import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            int first = 0, second = 1;
            System.out.print("Fibonacci Series: " + first + " " + second + " ");

            for (int i = 2; i < n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
