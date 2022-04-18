package easy;

//Faça um algoritmo para ler e exibir uma palavra.

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        String palavraDigitada;
        palavraDigitada = JOptionPane.showInputDialog("Digite uma palavra! ");
        System.out.println("A palavra digitada foi: " + palavraDigitada);
    }
}
