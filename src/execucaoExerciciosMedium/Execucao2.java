package execucaoExerciciosMedium;
import javax.swing.JOptionPane;

import medium.Exercicio2;

public class Execucao2 {
    public static void main(String[] args) {
        String valorInvestido = JOptionPane.showInputDialog("Informe o valor do investimento? R$: ");
        double valorInvestimento = Double.parseDouble(valorInvestido);
        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.calculaInvestimentoJurosCompostos(valorInvestimento);

        double valorJuros = exercicio2.calculaInvestimentoJurosCompostos(valorInvestimento);
        double valorTotal = exercicio2.calculaValorTotalDoInvestimento(valorInvestimento, valorJuros);
        System.out.println("Valor do investimento: R$ " + valorInvestimento );  
        System.out.println("Valor do juros é: R$ " + valorJuros);
        System.out.println("Valor total do investimento: R$ " + valorTotal);
       
    }
    
}