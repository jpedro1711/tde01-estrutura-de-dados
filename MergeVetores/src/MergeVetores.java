public class MergeVetores {
    public MergeVetores() {
    }

    public int[] merge(int[] vet1, int[]vet2) {
        int[] vetor3 = new int[vet1.length + vet2.length];
        int indiceContinuar = 0;
        for (int i = 0; i < vet1.length; i++) {
            vetor3[i] = vet1[i];
            indiceContinuar++;
        }

        int indiceVet2 = 0;
        for (int j = indiceContinuar; j < vetor3.length; j++) {
            vetor3[j] = vet2[indiceVet2];
            indiceVet2++;
        }

        for (int i = 0; i < vetor3.length; i++) {
            int menor;
            int posMenor;
            for (int j = i + 1; j < vetor3.length; j++) {
                if (vetor3[i] > vetor3[j]) {
                    menor = vetor3[j];
                    posMenor = j;
                    vetor3[posMenor] = vetor3[i];
                    vetor3[i] = menor;
                }
            }
        }

        return vetor3;
    }
}
