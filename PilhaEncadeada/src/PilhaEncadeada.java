public class PilhaEncadeada {
    private Node inicio;

    public PilhaEncadeada() {
        inicio = null;
    }

    public void insere(int e) {
        if (inicio == null) {
            inicio = new Node();
            inicio.setInformacao(e);
        } else {
            Node topo = inicio;
            while (topo.getProximo() != null) {
                topo = topo.getProximo();
            }
            topo.setProximo(new Node());
            topo.getProximo().setInformacao(e);
            System.out.println("Valor adicionado com sucesso a pilha: " + topo.getProximo().getInformacao());
        }
    }

    public void remove() {
        if (inicio == null) {
            System.out.println("Pilha vazia");
            return;
        }

        if (inicio.getProximo() == null) {
            System.out.println("Valor a ser excluido: " + inicio.getInformacao());
            inicio = null;
            return;
        }

        Node excluido = inicio;
        Node topo = inicio;

        while (excluido.getProximo() != null) {
            topo = excluido;
            excluido = excluido.getProximo();
        }
        System.out.println("Valor a ser excluido: " + excluido.getInformacao());
        topo.setProximo(null);
        excluido = null;
    }

    public void imprime() {
        System.out.println("=====================================");
        if (this.inicio == null) {
            System.out.println("Pilha vazia");
            return;
        }
        Node topo = inicio;
        while (topo.getProximo() != null) {
            System.out.println(topo.getInformacao());
            topo = topo.getProximo();
        }
        System.out.println(topo.getInformacao());
        System.out.println("=====================================");
    }
}
