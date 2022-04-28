package execucaoRetornoExerciciosEasy;

import javax.swing.JOptionPane;

import easy.Exercicio5;

public class Execucao5 {
    public static void main(String[] args) {        
    
    //leitura dos numeros digitados
    String primeiroDigitado = JOptionPane.showInputDialog("Digite o primeiro número: ");
    String segundoDigitado = JOptionPane.showInputDialog("Digite o segundo número: ");
    String terceiroDigitado = JOptionPane.showInputDialog("Digite o terceiro número: ");
    
    //Realiza a conversão dos números para inteiro
    int primeiroNumero = Integer.parseInt(primeiroDigitado);
    int segundoNumero = Integer.parseInt(segundoDigitado);
    int terceiroNumero = Integer.parseInt(terceiroDigitado);

    //Instancia a classe Exercicio5
    Exercicio5 exercicio5 = new Exercicio5();
    //Realiza a chamada para as operações 
    System.out.println("O valor da soma é: " + exercicio5.soma(primeiroNumero, segundoNumero, terceiroNumero));
    System.out.println("O valor da subtração é: " + exercicio5.subtracao(primeiroNumero, segundoNumero, terceiroNumero));
    System.out.println("O valor da multiplicação é: " + exercicio5.multiplicacao(primeiroNumero, segundoNumero, terceiroNumero));
    int soma = exercicio5.soma(primeiroNumero, segundoNumero, terceiroNumero);
    System.out.println("A media será: " + exercicio5.media(soma));

    }
    
       
        
}    

