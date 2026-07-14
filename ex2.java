import java.util.Scanner;
public class ex2 {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite a posição do número desejado: ");
        n = input.nextInt();

        System.out.println(fibonacci(n));

         


    }
    public static int fibonacci(int n){
        int anterior = 0;
        int atual = 1;
        int proximo = 1;
        for(int i = 0; i < n - 2; i ++){
            proximo = atual + anterior;           
            anterior = atual;
            atual = proximo;
        } 
        return atual;
    }
}
