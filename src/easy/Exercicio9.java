package easy;

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        
        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        for(i =1 ; i <=10 ; i++){
         System.out.println(numero + " X " + i + " = " + numero * i);

        }

        // while (i <= 10) {
        //     System.out.println(numero + " X " + i + " = " + numero * i);
        //     i++;
        // }

    }

    
}
