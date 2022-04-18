package easy;

import javax.swing.JOptionPane;

/*
    Faça um algoritmo para ler dois valores,
    armazenar em variáveis, e exibir os valores das variáveis, trocados.
*/
public class Exercicio3 {

    public static void main(String[] args) {

        String primeiroValor, segundoValor;

        primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        segundoValor = JOptionPane.showInputDialog("Digite o  segundo valor: ");

        System.out.println("======== Valores trocados ===========");

        // valores trocados
        System.out.println("Primeiro valor digitado: " + segundoValor);
        System.out.println("Segundo valor digitado: " + primeiroValor);

    }

}
