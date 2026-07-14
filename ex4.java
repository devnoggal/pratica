public class ex4 {
    public static void main(String[] args) {

        int [][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] t = new int[3][3];

        //montando matriz transposta
        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[i].length; j++){
                t[i][j] = matriz[j][i];
            }
        }
        //exibindo matriz original
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(j != 2){
                System.out.printf("%3d",matriz[i][j]);
                } else{System.out.printf("%3d\n",matriz[i][j]);}
            }
        }
        System.out.println("-------------------");
        
        //exibindo matriz transposta
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(j != 2){
                System.out.printf("%3d", t[i][j]);
                } else{System.out.printf("%3d\n",t[i][j]);}
            }
        }
    }
    
}
