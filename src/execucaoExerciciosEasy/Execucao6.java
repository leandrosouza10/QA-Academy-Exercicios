package execucaoExerciciosEasy;

import javax.swing.JOptionPane;

import easy.Exercicio6;

public class Execucao6 {
    public static void main(String[] args) {

        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número: ");
       

        double nota1 = Double.parseDouble(primeiroNumero);
        double nota2 = Double.parseDouble(segundoNumero);

        Exercicio6 exercicio6 = new Exercicio6();
        System.out.println(exercicio6.calculaMedia(nota1, nota2));        
    }     
}
