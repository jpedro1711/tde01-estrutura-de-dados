public class Main {
    public static void main(String[] args) {

        System.out.println("EXECUÇÃO PILHA ENCADEADA");
        PilhaEncadeada p = new PilhaEncadeada();
        p.insere(1);
        p.insere(2);

        p.imprime();

        p.remove();

        p.imprime();

        p.insere(5);

        p.imprime();

        p.remove();
        p.remove();

        p.imprime();

        System.out.println("=================================================");
    }
}