package medium;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int numeroDigitado, menorNumero = 0, i = 1;

        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            System.out.println(numeroDigitado);
            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor número digitado é: " + menorNumero);

    }

}
