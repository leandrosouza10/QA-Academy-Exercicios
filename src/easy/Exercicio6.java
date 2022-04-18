package easy;

import javax.swing.JOptionPane;

/*
    Faça um algoritmo para ler duas  notas,
    calcular a média. E SE a média > 5 exibir APROVADO,
    SE a média < 5 exibir REPROVADO, se média = 5 exibir EXAME.
*/

public class Exercicio6 {
    public static void main(String[] args) {

        double nota1, nota2, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

        media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.println("APROVADO, sua média foi: " + media);
        } else if (media < 5) {
            System.out.println("REPROVADO, sua média foi: " + media);
        } else {
            System.out.println("EXAME, sua média foi: " + media);

        }

    }

}
