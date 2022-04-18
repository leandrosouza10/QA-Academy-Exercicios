package easy;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {

        double salario, ir;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário: R$ "));
        if (salario >= 0 && salario <= 1903.98) {
            System.out.println("Isento de imposto renda:");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.80;
            System.out.println("O valor do imposto de renda será: R$ " + ir);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.80;
            System.out.println("O valor do imposto de renda será: R$ " + ir);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario * 0.225) - 636.13;
            System.out.println("O valor do imposto de renda será: R$ " + ir);
        } else if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
            System.out.println("O valor do imposto de renda será: R$ " + ir);

        }

    }

}
