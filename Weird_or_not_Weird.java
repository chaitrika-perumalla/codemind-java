import java.util.Scanner;

public class WeirdOrNotWeird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 != 0) {
            System.out.println("weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("not weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("weird");
            } else {
                System.out.println("not weird");
            }
        }
        
        scanner.close();
    }
}