package easy;
/*
    Faça um algoritmo para ler três numeros inteiros,
    armazenar em variáveis, e exibir a soma, a subtração, 
    multiplicação e a média dos três 
*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int n1, n2, n3, soma, subtracao, multiplicacao, media;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        soma = n1 + n2 + n3;
        subtracao = n1 - n2 - n3;
        multiplicacao = n1 * n2 * n3;
        media = soma / 3;

        System.out.println("Valor da soma: " + soma);
        System.out.println("Valor da subtração: " + subtracao);
        System.out.println("Valor da multiplicação: " + multiplicacao);
        System.out.println("Valor da média: " + media);

    }

}
