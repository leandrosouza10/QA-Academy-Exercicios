package execucaoExerciciosMedium;
import javax.swing.JOptionPane;

import medium.Exercicio6;

public class Execucao6 {
    public static void main(String[] args) {
        String fatorialDigitadoStg = JOptionPane.showInputDialog("Digite um número para calcular o fatorial: ");
        int fatorial = Integer.parseInt(fatorialDigitadoStg);
        Exercicio6 exercicio6 = new Exercicio6();
        fatorial = exercicio6.calculaFatorial(fatorial);
        System.out.println("O valor do fatorial é: " + fatorial );   
    }        
}
