public class Main {
    public static void main(String[] args) {

        System.out.println("EXECUÇÃO MERGE COM LISTA ENCADEADA");

        MergeLista mergeDinamicoLista = new MergeLista();

        ListaEncadeada l1 = new ListaEncadeada();
        l1.adicionar(12);
        l1.adicionar(35);
        l1.adicionar(52);
        l1.adicionar(64);

        ListaEncadeada l2 = new ListaEncadeada();
        l2.adicionar(5);
        l2.adicionar(15);
        l2.adicionar(23);
        l2.adicionar(55);
        l2.adicionar(75);

        ListaEncadeada resultadoMergeDinamico = mergeDinamicoLista.mergeDinamico(l1, l2);
        System.out.println("Resultado do merge dinâmico");
        resultadoMergeDinamico.imprime();
    }
}