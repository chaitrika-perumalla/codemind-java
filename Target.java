import java.util.Scanner;
public class Target{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        if ( a>=10 && b>=10 && c>=10 && d>=10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}