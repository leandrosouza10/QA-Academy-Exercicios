package execucaoExerciciosEasy;
import javax.swing.JOptionPane;

import easy.Exercicio11;

public class Execucao11 {
    public static void main(String[] args) {
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número inteiro: ");
        int numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        Exercicio11 exercicio11 = new Exercicio11();
        System.out.println(exercicio11.somaDois(numeroDigitado)); 
        
    }
    
}
