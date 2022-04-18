package medium;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        double valorInvestido, txJuros = 0.12, total, valorJuros;
        int i = 1;

        valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do investimento? R$: "));
        total = valorInvestido;

        while (i <= 10) {
            total = (total * txJuros) + total;
            i++;
        }
        valorJuros = total - valorInvestido;

        System.out.println("Valor Investido: R$ " + valorInvestido);
        System.out.println("Valor dos juros: R$ " + valorJuros);
        System.out.println("Valor total: R$ " + total);

    }

}
