public class Main {
    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("EXECUÇÃO MERGE COM VETORES");
        MergeVetores funcaoMergeComVetores = new MergeVetores();

        int[] vetor1 = new int[4];
        vetor1[0] = 12;
        vetor1[1] = 35;
        vetor1[2] = 52;
        vetor1[3] = 64;

        int[] vetor2 = new int[5];

        vetor2[0] = 5;
        vetor2[1] = 15;
        vetor2[2] = 23;
        vetor2[3] = 55;
        vetor2[4] = 75;

        int[] resultado = funcaoMergeComVetores.merge(vetor1, vetor2);

        System.out.println("RESULTADO VETOR ORDENADO COM MERGE");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        System.out.println("==========================================");
    }
}