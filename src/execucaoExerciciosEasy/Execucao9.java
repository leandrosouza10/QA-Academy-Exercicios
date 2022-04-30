package execucaoExerciciosEasy;

import javax.swing.JOptionPane;
import easy.Exercicio9;

public class Execucao9 {
    public static void main(String[] args) {
        
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número: ");
        int numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        Exercicio9 exercicio9 = new Exercicio9();
        exercicio9.tabuada(numeroDigitado);

    }    
}
