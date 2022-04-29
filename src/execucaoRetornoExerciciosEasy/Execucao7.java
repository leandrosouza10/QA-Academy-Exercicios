package execucaoRetornoExerciciosEasy;

import javax.swing.JOptionPane;

import easy.Exercicio7;

public class Execucao7 {
    public static void main(String[] args) {
        
        String salarioBase = JOptionPane.showInputDialog("Digite o valor do seu salário: R$ ");
        double salario = Double.parseDouble(salarioBase);
        Exercicio7 exercicio7 = new Exercicio7();
        System.out.println("O valor do Inss para o salário R$ " + salario + " será de R$ " + exercicio7.calculaInss(salario));

    }
    
}
