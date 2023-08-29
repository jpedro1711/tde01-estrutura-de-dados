public class MergeLista {
    public MergeLista() {
    }

    public ListaEncadeada mergeDinamico(ListaEncadeada lista1, ListaEncadeada lista2) {
        ListaEncadeada l3 = new ListaEncadeada();
        if (lista1 != null && lista2 != null) {
            Node l1 = lista1.getLista();
            Node l2 = lista2.getLista();

            while(l1.getProximo() != null) {
                l3.adicionar(l1.getInformacao());
                l1 = l1.getProximo();
            }

            while(l2.getProximo() != null) {
                l3.adicionar(l2.getInformacao());
                l2 = l2.getProximo();
            }

            Node inicio = l3.getLista();
            Node posterior = inicio.getProximo();

            while (inicio.getProximo() != null) {
                while (posterior.getProximo() != null) {
                    if (posterior.getInformacao() < inicio.getInformacao()) {
                        int min = posterior.getInformacao();
                        int max = inicio.getInformacao();
                        posterior.setInformacao(max);
                        inicio.setInformacao(min);
                    }
                    posterior = posterior.getProximo();
                }
                inicio = inicio.getProximo();
                posterior = inicio.getProximo();
            }
        }
        return l3;
    }
}
