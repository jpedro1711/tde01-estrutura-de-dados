public class ListaEncadeada {
    private Node lista;
    public ListaEncadeada() {
        lista = null;
    }

    public void adicionar(int e) {
        if (lista == null) {
            lista = new Node();
            lista.setInformacao(e);
            lista.setProximo(new Node());
        } else {
            Node atual = lista.getProximo();;
            while (atual.getProximo() != null) { // Enquando tiver mais nós
                atual = atual.getProximo(); // A proximo anda
            }
            atual.setInformacao(e);
            atual.setProximo(new Node());
        }
    }

    public void remover(int indice) {
        if (this.lista == null) {
            System.out.println("Lista vazia");
            return;
        }
        int contador = 0;
        Node anterior = lista;
        Node excluido = lista;
        if (indice == 0) {
            //anterior.setProximo(excluido.getProximo());
            excluido = lista;
            lista = lista.getProximo();
        } else {
            while (contador != indice) {
                contador++;

                anterior = excluido;
                anterior.setProximo(excluido.getProximo());
                excluido = excluido.getProximo();

            }
            anterior.setProximo(excluido.getProximo());
        }
        excluido = null;
    }
    public void imprime() {
        System.out.println("--- LISTA ENCADEADA ---");
        Node proximo;
        if (this.lista == null) {
            System.out.println("Lista vazia");
            return;
        }
        if (lista.getProximo() != null) {
            System.out.println(lista.getInformacao());
            proximo = lista.getProximo();
            while (proximo.getProximo() != null) {
                System.out.println(proximo.getInformacao());
                proximo = proximo.getProximo();
            }
            System.out.println(proximo.getProximo());
        }

    }

    public Node getLista() {
        return lista;
    }

    public void setLista(Node lista) {
        this.lista = lista;
    }
}
