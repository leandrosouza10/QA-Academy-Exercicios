package exemploMetodos;

public class ExercicioMetodosComParametro {

    // CHAMADA DOS METODOS COM RETORNO
    public static void main(String[] args) {
        System.out.println(exibirNomeIdade(33, "João"));
        System.out.println(retornarCarro("HB20"));
        System.out.println(somar(10, 10));
        System.out.println(retornarDobro(4));
        System.out.println(retornarSalario(2000.00));
        System.out.println(retornarNomeSobreNome("Pedro", "Moraes"));

        // CHAMADA DOS METODOS SEM RETORNO

        exibirNomesIdades(33,"João");
        retornarCarros("HB20");
        somarNumeros(10,10);
        retornarDobro1(4);
        retornarSalarioBase(2000.00);
        retornarNomeSobreNomes("Pedro", "Moraes");



    }

    // METODOS RETORNO COM PARAMETROS
    public static String exibirNomeIdade(int idade, String nome) {
        return "Nome " + nome + "idade " + idade;
    }

    public static String retornarCarro(String carro) {
        return "O Modelo de carro é : " + carro;

    }

    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;

    }

    public static int retornarDobro(int numero) {
        return numero * 2;
    }

    public static double retornarSalario(double salario) {
        return salario;
    }

    public static String retornarNomeSobreNome(String nome, String sobreNome) {
        return nome + " " + sobreNome;

    }

    // METODOS SEM RETORNO COM PARAMETROS

    public static void exibirNomesIdades(int idade, String nome) {
        System.out.println("Nome " + nome + "idade " + idade);
    }

    public static void retornarCarros(String carro) {
        System.out.println("O Modelo de carro é : " + carro);

    }

    public static void somarNumeros(int numero1, int numero2) {
        System.out.println(numero1 + numero2);

    }

    public static void retornarDobro1(int numero) {
        System.out.println(numero * 2);
    }

    public static void retornarSalarioBase(double salario) {
        System.out.println(2000.00);
    }

    public static void retornarNomeSobreNomes(String nome, String sobreNome) {
        System.out.println(nome + "" + sobreNome);

    }

}
