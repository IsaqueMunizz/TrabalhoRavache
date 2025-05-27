public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.raiz = new No("A");
        arvore.raiz.esquerda = new No("B");
        arvore.raiz.direita  = new No("C");
        arvore.raiz.esquerda.esquerda  = new No("D");
        arvore.raiz.esquerda.direita   = new No("E");
        arvore.raiz.direita.direita    = new No("F");

        // 1) Contar nós
        int totalNos = arvore.contarNos(arvore.raiz);
        System.out.println("Total de nós na árvore: " + totalNos);

        // 2) Percursos
        System.out.print("Pré-ordem: ");
        arvore.buscaPreOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em-ordem: ");
        arvore.buscaEmOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        System.out.println();
        arvore.buscaPosOrdem(arvore.raiz);
        System.out.println();

        // 3) Busca em nível (largura)
        System.out.println("Em nível (largura):");
        arvore.buscaEmNivel();
    }
    public class ain {
        public static void main(String[] args) {
            // Construção da árvore
            Arvore arvore = new Arvore();

            arvore.raiz = new No("A");
            arvore.raiz.esquerda = new No("B");
            arvore.raiz.direita = new No("C");
            arvore.raiz.esquerda.esquerda = new No("D");
            arvore.raiz.esquerda.direita = new No("E");
            arvore.raiz.direita.direita = new No("F");

            // 1) Contagem recursiva de nós
            int totalNosRec = arvore.contarNos(arvore.raiz);
            System.out.println("Total de nós (recursivo): " + totalNosRec);

            // 2) Contagem iterativa de nós
            int totalNosIt = arvore.contarNosIterativo();
            System.out.println("Total de nós (iterativo): " + totalNosIt);

            // 3) Contagem de nós folha (iterativo)
            int folhasIt = arvore.contarFolhasIterativo();
            System.out.println("Total de nós folha (iterativo): " + folhasIt);

            // 4) Percursos recursivos
            System.out.print("Pré-ordem (recursivo): ");
            arvore.buscaPreOrdem(arvore.raiz);
            System.out.println();

            System.out.print("Em-ordem (recursivo): ");
            arvore.buscaEmOrdem(arvore.raiz);
            System.out.println();

            System.out.print("Pós-ordem (recursivo): ");
            arvore.buscaPosOrdem(arvore.raiz);
            System.out.println();

            System.out.print("Em nível (recursivo): ");
            arvore.buscaEmNivel();
            System.out.println("\n");

            // 5) Percursos iterativos
            System.out.print("Em-ordem (iterativo): ");
            arvore.emOrdemIterativo(arvore.raiz);
            System.out.println();

            System.out.print("Pós-ordem (iterativo): ");
            arvore.posOrdemIterativo(arvore.raiz);
            System.out.println();
        }
    }

}