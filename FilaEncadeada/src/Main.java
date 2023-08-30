public class Main {
    public static void main(String[] args) {

        System.out.println("EXECUÇÃO FILA ENCADEADA");

        FilaEncadeada f = new FilaEncadeada();

        f.inserir(1);
        f.inserir(4);
        f.inserir(3);

        f.imprimir();

        f.remover();
        f.remover();

        f.imprimir();
        System.out.println("=================================================");
    }
}