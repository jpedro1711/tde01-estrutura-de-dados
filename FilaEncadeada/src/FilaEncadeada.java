public class FilaEncadeada {
    private Node inicio;

    public FilaEncadeada() {
        this.inicio = null;
    }

    public void inserir(int e) {
        if (inicio == null) {
            inicio = new Node();
            inicio.setInformacao(e);
            System.out.println("Valor adicionado com sucesso a fila: " + inicio.getInformacao());
            return;
        }
        Node atual = inicio;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        atual.setProximo(new Node());
        atual.getProximo().setInformacao(e);
        System.out.println("Valor adicionado com sucesso a fila: " + atual.getProximo().getInformacao());
    }

    public void remover() {
        if (inicio == null) {
            System.out.println("Pilha vazia");
            return;
        }

        Node excluido = inicio;
        inicio = inicio.getProximo();

        System.out.println("Valor removido com sucesso da fila: " + excluido.getInformacao());

    }

    public void imprimir() {
        System.out.println("=====================================");
        if (this.inicio == null) {
            System.out.println("Lista vazia");
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