import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        //nanotime
        long inicio = System.nanoTime();

        //declaração de variáveis
        Scanner input = new Scanner(System.in);
        String texto;
        String textoInvertido = "";
        boolean palindromo = false;

        String acentuados = "áàãâäéèêëíìîïóòõôöúùûüçñ";
        String nAcentuados = "aaaaaeeeeiiiiooooouuuucn";

        //entrada do usuário
        System.out.println("Digite o texto: ");
        texto = input.nextLine();

        //tratando acentuação
        for(int i = 0; i < texto.length(); i++){
            for(int j = 0; j < acentuados.length(); j++){
                if(texto.charAt(i) == acentuados.charAt(j)){
                    texto = texto.replace(texto.charAt(i), nAcentuados.charAt(j));
                }
            }
            
        }
        //tornando a String minuscula e sem espaços
        texto = texto.toLowerCase().replace(" ", "");

        //inserção de texto de forma invertida a outra variavel
        for(int i = texto.length() - 1; i >= 0; i--){
            textoInvertido += texto.charAt(i);
        }

        //comparação e verificação se é palíndromo ou não
        if(texto.equals(textoInvertido)){
            palindromo = true;
        }

        //Saída do programa
        if(palindromo){
            System.out.println("É um palíndromo!");
        } 
        else{
            System.out.println("Não é um palíndromo!");
        }

        //nanotime
        long fim = System.nanoTime();
        long duracao = (fim - inicio)/1000000000;
        System.out.println(duracao);



    }
}
