package exerciciosInstaciaDeClasse;

public class Execucao {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.nome);
        System.out.println(cachorro.idade);

        cachorro.latir();
        cachorro.pular();
        cachorro.deitar();
    }

}
