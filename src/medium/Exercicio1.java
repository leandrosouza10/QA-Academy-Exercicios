package medium;

public class Exercicio1 {
    public static void main(String[] args) {
        int i=0;

        while(i<=100){
            
            if (i % 2 ==0){
                System.out.println("O número " + i + " é par");
            }else{
                System.out.println("O número "+ i + " é impar");
            }
         i++;
        }

    }
    
}
