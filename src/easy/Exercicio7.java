package easy;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {

        double salario, valorInss;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: R$ "));

        if(salario <=1045.00){
            valorInss = salario * 0.075;
            System.out.println("O valor a ser pago de INSS será: " + valorInss);
            
            }else if (salario >= 1045.01 && salario <= 2089.60){
                valorInss = salario * 0.09;
                System.out.println("O valor a ser pago de INSS será: " + valorInss);

                }else if (salario >= 2089.61 && salario <=3134.40){
                  valorInss = salario * 0.12;
                  System.out.println("O valor a ser pago de INSS será: " + valorInss);

                    }else if(salario >=3134.41 && salario <=6101.06){
                      valorInss = salario * 0.14;
                      System.out.println("O valor a ser pago de INSS será: " + valorInss);
         }
        
    }

}
