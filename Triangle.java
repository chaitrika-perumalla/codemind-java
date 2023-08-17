import java.util.Scanner;

public class TriangleValidOrNot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a==b&&b==c){
            System.out.println("Equilateral triangle");
        }
        else if(a==b||a==c||b==c){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    }
}