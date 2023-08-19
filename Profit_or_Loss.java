import java.util.Scanner;
public class porl{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x<y){
            System.out.print("Profit");
        }   
        else if(x==y){
            System.out.print("No profit and No loss");
        }
        else{
            System.out.print("Loss");
        }
        
    }
}