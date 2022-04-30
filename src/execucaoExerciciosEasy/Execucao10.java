package execucaoExerciciosEasy;
import javax.swing.JOptionPane;

import easy.Exercicio10;

public class Execucao10 {
    public static void main(String[] args) {

     
        double valorTotal, valorDoInvestimento, valorJuros;

        valorDoInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento: R$ "));
        Exercicio10 exercicio10 = new Exercicio10();
        valorJuros = exercicio10.calcularValorJuros(valorDoInvestimento);
        valorTotal = valorJuros + valorDoInvestimento;
  

        System.out.println("Valor investido " +  valorDoInvestimento);
        System.out.println("Valor dos juros " +  valorJuros);
        System.out.println("Valor total dos juros " + valorTotal);
        
    }
    
}
