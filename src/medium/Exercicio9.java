package medium;

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        String[] nomeAlunos = new String[7];
        int[] numeracaoAlunos = new int[7];
        int i = 0;

        while (i < 7) {
            nomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            numeracaoAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do aluno: "));
            i++;
        }
        i = 0;
        while (i < 7) {
            System.out.println("Nome do aluno: " + nomeAlunos[i] + " - " + " número do aluno: " + numeracaoAlunos[i]);
            i++;

        }
    }

}
