import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hi Timmy! Enter the number: ");
        int num=scan.nextInt();
        System.out.println("Result!");
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
        }
        scan.close();
    }
}
