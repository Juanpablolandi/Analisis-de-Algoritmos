import java.util.Arrays;

public class Dijkstra {
    private static final int DISTANCIA_INFINITA = Integer.MAX_VALUE;

    public static void calcularCaminosMasCortos(int[][] matrizAdyacencia, int nodoInicial) {
        int numNodos = matrizAdyacencia.length;
        // Almacena las distancias más cortas conocidas desde el nodo inicial a cada nodo
        int[] distanciasMinimas = new int[numNodos];
        // Registra si un nodo ya ha sido incluido en el árbol de caminos más cortos
        boolean[] nodosProcesados = new boolean[numNodos];

        // Inicializa todas las distancias como infinitas y ningún nodo como procesado
        Arrays.fill(distanciasMinimas, DISTANCIA_INFINITA);
        // La distancia al nodo inicial es 0
        distanciasMinimas[nodoInicial] = 0;

        // Itera para encontrar el camino más corto a todos los nodos
        for (int i = 0; i < numNodos - 1; i++) {
            // Selecciona el nodo con la distancia mínima que aún no ha sido procesado
            int nodoActual = encontrarNodoConMenorDistancia(distanciasMinimas, nodosProcesados);

            // Marca el nodo seleccionado como procesado
            nodosProcesados[nodoActual] = true;

            // Actualiza las distancias de los nodos adyacentes al nodo actual
            for (int v = 0; v < numNodos; v++) {
                if (!nodosProcesados[v] && matrizAdyacencia[nodoActual][v] != 0 &&
                        distanciasMinimas[nodoActual] != DISTANCIA_INFINITA &&
                        distanciasMinimas[nodoActual] + matrizAdyacencia[nodoActual][v] < distanciasMinimas[v]) {
                    distanciasMinimas[v] = distanciasMinimas[nodoActual] + matrizAdyacencia[nodoActual][v];
                }
            }
        }

        // Imprime los resultados finales
        mostrarResultados(distanciasMinimas, nodoInicial);
    }

    private static int encontrarNodoConMenorDistancia(int[] distancias, boolean[] procesado) {
        int distanciaMinimaActual = DISTANCIA_INFINITA;
        int indiceNodoMinimo = -1; // Inicializa con -1 para indicar que no se ha encontrado aún

        for (int i = 0; i < distancias.length; i++) {
            if (!procesado[i] && distancias[i] <= distanciaMinimaActual) {
                distanciaMinimaActual = distancias[i];
                indiceNodoMinimo = i;
            }
        }
        return indiceNodoMinimo;
    }

    private static void mostrarResultados(int[] distancias, int origen) {
        System.out.println("Distancias más cortas desde el nodo " + origen + ":");
        for (int i = 0; i < distancias.length; i++) {
            String distanciaStr = (distancias[i] == DISTANCIA_INFINITA) ? "INF" : String.valueOf(distancias[i]);
            System.out.println("  Al nodo " + i + ": " + distanciaStr);
        }
    }

    public static void main(String[] args) {
        int[][] grafoEjemplo = {
                {0, 2, 0, 4, 0},
                {2, 0, 5, 0, 0},
                {0, 5, 0, 8, 0},
                {4, 0, 8, 0, 3},
                {0, 0, 0, 3, 0}
        };
        calcularCaminosMasCortos(grafoEjemplo, 0);
    }
}
