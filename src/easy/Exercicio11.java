package easy;

import javax.swing.JOptionPane;
public class Exercicio11 {
    public static void main(String[] args) {
        
        int numeroDigitado, i;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for (i =1 ; i <= 100 ; i++){

         numeroDigitado = numeroDigitado + 2;
         System.out.println(numeroDigitado);

        }
            
            // while (i <= 100){
            //     numeroDigitado = numeroDigitado + 2;
            //     System.out.println(numeroDigitado);
            //     i++;
            // }
    }
    
}
