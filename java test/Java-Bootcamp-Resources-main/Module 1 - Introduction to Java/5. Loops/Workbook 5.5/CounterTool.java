import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // See detailed instructions on Learn the Part.
        System.out.print("1. Pick a number to count by: ");
        int steps = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int begin = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int end = scan.nextInt();

        for (int i = begin; i <= end; i += steps) {
            System.out.print(i+" ");
        }

        scan.close();
    }
}
