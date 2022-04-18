package easy;

/*
    Faça um algoritmo pra ler um número inteiro, 
    armazenar em uma variável, calcular o dobro, e exibir.
*/

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

        int numeroDigitado, resultado;
        String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um valor: ");

        numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é: " + resultado);

    }

}
