package exemploMetodos;

public class ExemploMetodoComRetorno {

    // chamada dos METODOS criados
    public static void main(String[] args) {

        System.out.println(primeiroMetodo());
        System.out.println(segundoMetodo());
        System.out.println(terceiroMetodo());
        System.out.println(quartoMetodo());
        System.out.println(quintoMetodo());
    }

    // Criação dos METODOS
    public static String primeiroMetodo() {
        String mensagem = "primeiro Metodo";
        return mensagem;
    }

    public static int segundoMetodo() {
        return 4;
    }

    public static double terceiroMetodo() {
        return 4.3;
    }

    public static boolean quartoMetodo() {
        return true;
    }

    public static String quintoMetodo() {
        return "quinto Metodo";
    }
}
