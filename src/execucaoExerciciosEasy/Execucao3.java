package execucaoExerciciosEasy;

import javax.swing.JOptionPane;


import easy. Exercicio3;

public class Execucao3 {
    public static void main(String[] args) {

        Exercicio3 exercicio3 = new Exercicio3(); // instanciando a classe Exercicio 3 easy

       String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
       String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");
       
       System.out.println(exercicio3.valoresTrocados(primeiroValor, segundoValor));//faço a chamada e o valor
        
            
    }
    
}
