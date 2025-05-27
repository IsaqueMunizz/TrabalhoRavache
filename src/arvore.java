import java.util.LinkedList;
import java.util.Queue;

public class arvore {

    No raiz;

    public int contarNos(No node) {
        if (node == null) return 0;
        return 1 + contarNos(node.esquerda) + contarNos(node.direita);
    }

    public void buscaPreOrdem(No node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            buscaPreOrdem(node.esquerda);
            buscaPreOrdem(node.direita);
        }
    }

    public void BuscaEmOrdem(No node) {
        if (node != null) {
            BuscaEmOrdem(node.esquerda);
            System.out.print(node.valor + " ");
            BuscaEmOrdem(node.direita);
        }
    }

    public void buscarEmNivel() {
        if (raiz == null) ;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");

            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }
}

