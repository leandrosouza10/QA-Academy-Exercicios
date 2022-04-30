package execucaoExerciciosEasy;
import javax.swing.JOptionPane;
import easy.Exercicio8;

public class Execucao8 {
    public static void main(String[] args) {
       String baseSalario = JOptionPane.showInputDialog("Informe o valor do seu salário: R$ ");
       double salario = Double.parseDouble(baseSalario);
       Exercicio8 exercicio8 = new Exercicio8();
       System.out.println("O imposto de renda será de R$ " + exercicio8.calculaImpostoDeRenda(salario)) ;
        double ir = exercicio8.calculaImpostoDeRenda(salario);
       System.out.println("O salário liquido será de R$ " + exercicio8.calculaSalarioLiquido(salario,ir));
       
    }    
}
