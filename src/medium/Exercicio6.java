package medium;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        int fatorial, i;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial: "));
        i = fatorial;
        while (i > 1) {
            fatorial = fatorial * (i - 1);
            i--;
        }
        System.out.println("O valor do fatorial é: " + fatorial);
    }

}
