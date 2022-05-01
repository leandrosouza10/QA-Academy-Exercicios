package execucaoExerciciosMedium;
import javax.swing.JOptionPane;

import medium.Exercicio10;

public class Execucao10 {
    public static void main(String[] args) {
        Exercicio10 exercicio10 = new Exercicio10();
        String elementoFibonacciStg = JOptionPane.showInputDialog("Digite o elemento que você deseja exibir de Fibonacci: ");
        int elementoFibonacci = Integer.parseInt(elementoFibonacciStg); 
        int[] vetorFibonacci = exercicio10.calculoFibonacci(elementoFibonacci);
        exercicio10.imprimeVetor(vetorFibonacci);
        
    }


    
}
