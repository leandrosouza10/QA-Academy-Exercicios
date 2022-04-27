package execucaoRetornoExerciciosEasy;

import javax.swing.JOptionPane;

import easy.Exercicio4;

public class Execucao4 {
    public static void main(String[] args) {
    String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número: ");
    int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
    Exercicio4 exercicio4 =  new Exercicio4();
    System.out.println("O dobro de " + numeroDigitado + " = " + exercicio4.calcularDobro(numeroDigitado));  

        
    }
    
}
