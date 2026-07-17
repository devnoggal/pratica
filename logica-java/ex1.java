import java.util.Scanner;
public class ex1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("1: ");
        n1 = input.nextInt();

        System.out.print("2: ");
        n2 = input.nextInt();

        for(int i = n1 + 1; i < n2; i ++){
            boolean primo = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
                
            } if(primo){
                System.out.println(i + " é primo");
            };
        }
    }
}