package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        double valorInvestimento, txJuros = 0.05, totalJuros,juros;
        int ano = 10;
        
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento: R$ "));
        juros = valorInvestimento * txJuros * ano ;
        totalJuros = valorInvestimento + juros;

        System.out.println("Valor investido " +  valorInvestimento);
        System.out.println("Valor dos juros " +  juros);
        System.out.println("Valor total dos juros " + totalJuros);

    }
    
}
