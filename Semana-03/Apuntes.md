# 🗓️ Semana 03
## Temas tratados:
- Crecimiento de Funciones y Notación Asintótica
- Notación Asintótica O (Cota Superior Asintótica)
- Notación Asintótica Ω (Cota Inferior Asintótica)
- Notación Asintótica Θ (Cota Ajustada Asintótica)
- Análisis del caso promedio
- Código
### Crecimiento de Funciones y Notación Asintótica
Para evaluar la eficiencia de los algoritmos de manera teórica, nos interesa cómo su tiempo de ejecución o uso de memoria crece a medida que el tamaño de la entrada aumenta. Para esto, utilizamos la notación asintótica, que nos permite describir el comportamiento límite de las funciones.

### Notación Asintótica O (Cota Superior Asintótica)
La notación O (Big-O) proporciona una cota superior asintótica para el tiempo de ejecución (o el consumo de recursos) de un algoritmo. Si decimos que el tiempo de ejecución de un algoritmo es O(g(n)), significa que, para entradas lo suficientemente grandes, el tiempo de ejecución nunca superará un múltiplo constante de g(n). En términos formales, una función f(n) pertenece a O(g(n)) si existen constantes positivas c y n 0 tales que 0≤f(n)≤c⋅g(n) para todo n≥n 0.
Ejemplo: Si un algoritmo tiene un tiempo de ejecución T(n)=3n 
2+2n+5, diremos que T(n)∈O(n 2), porque para n lo suficientemente grande, 3n 2+2n+5 no crecerá más rápido que un múltiplo de n 2.

### Notación Asintótica Ω (Cota Inferior Asintótica)
La notación Ω (Big-Omega) proporciona una cota inferior asintótica. Si el tiempo de ejecución de un algoritmo es Ω(g(n)), significa que, para entradas lo suficientemente grandes, el tiempo de ejecución siempre será al menos un múltiplo constante de g(n). Formalmente, f(n)∈Ω(g(n)) si existen constantes positivas c y n 0 tales que 0≤c⋅g(n)≤f(n) para todo n≥n 0.

-Ejemplo: Para el mismo algoritmo con T(n)=3n 2+2n+5, también podríamos decir que T(n)∈Ω(n 2), ya que su tiempo de ejecución no será menor que un múltiplo de n 2.

### Notación Asintótica Θ (Cota Ajustada Asintótica)
La notación Θ (Theta) proporciona una cota ajustada asintótica. Si el tiempo de ejecución de un algoritmo es Θ(g(n)), significa que su tiempo de ejecución está acotado tanto superior como inferiormente por múltiplos constantes de g(n). En otras palabras, f(n) está en Θ(g(n)) si f(n)∈O(g(n)) y f(n)∈Ω(g(n)). Formalmente, existen constantes positivas c 1 ,c 2 y n 0 tales que 0 ≤c 1 ⋅g(n)≤f(n) ≤ c 2 ⋅g(n) para todo n≥n 0.
Ejemplo: Un algoritmo con T(n)=3n 2+2n+5 tiene un tiempo de ejecución de Θ(n 2), porque n 2 describe de forma precisa su tasa de crecimiento tanto por arriba como por abajo.

### Análisis del Caso Promedio
El análisis del caso promedio busca determinar el tiempo de ejecución esperado de un algoritmo, considerando la distribución probabilística de todas las posibles entradas. Este tipo de análisis puede ser más complejo que el análisis del caso peor, ya que requiere hacer suposiciones sobre la probabilidad de ocurrencia de cada tipo de entrada. Aunque proporciona una visión más realista del rendimiento típico de un algoritmo, sus resultados dependen fuertemente de la validez de estas suposiciones. A menudo, el análisis del caso promedio es más difícil de realizar matemáticamente.

### Código
```java
package mergesort;

public class MergeSort {

    // Método principal que inicia el proceso de ordenamiento
    public static void main(String[] args) {
        int[] A = {10, 9, 8, 5, 4, 3, 1, 7, 2, 6}; // Array de ejemplo con más elementos

        System.out.println("Array original:");
        imprimirArray(A);

        // Llamada al método de ordenamiento Merge Sort
        mergeSort(A, 0, A.length - 1);

        System.out.println("---");
        System.out.println("Array ordenado:");
        imprimirArray(A);
    }

    /**
     * Implementación recursiva del algoritmo Merge Sort.
     * Divide el array en dos mitades, las ordena recursivamente y luego las mezcla.
     * @param arr El array a ordenar.
     * @param p El índice inicial del sub-array.
     * @param r El índice final del sub-array.
     */
    public static void mergeSort(int[] arr, int p, int r) {
        // Caso base: si p >= r, el sub-array tiene 0 o 1 elemento, ya está ordenado
        if (p < r) {
            // Encuentra el punto medio para dividir el array
            int q = (p + r) / 2;

            // Ordena recursivamente la primera mitad
            mergeSort(arr, p, q);
            // Ordena recursivamente la segunda mitad
            mergeSort(arr, q + 1, r);

            // Mezcla las dos mitades ordenadas
            merge(arr, p, q, r);
        }
    }

    /**
     * Combina dos sub-arrays ordenados en un único array ordenado.
     * Esta es la fase de "mezcla" de Merge Sort.
     * @param arr El array original que contiene los dos sub-arrays a mezclar.
     * @param p El índice inicial del primer sub-array.
     * @param q El índice final del primer sub-array (y q+1 es el inicio del segundo).
     * @param r El índice final del segundo sub-array.
     */
    private static void merge(int[] arr, int p, int q, int r) {
        // Calcula los tamaños de los sub-arrays
        int nL = q - p + 1;
        int nR = r - q;

        // Crea arrays temporales para almacenar las mitades
        int[] L = new int[nL];
        int[] R = new int[nR];

        // Copia los datos a los arrays temporales L[] y R[]
        for (int i = 0; i < nL; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = arr[q + 1 + j];
        }

        // Índices para recorrer los arrays L, R y el array original arr
        int i = 0; // Índice inicial del primer sub-array (L)
        int j = 0; // Índice inicial del segundo sub-array (R)
        int k = p; // Índice inicial del array original (arr)

        // Compara elementos de L y R y los coloca en arr en orden
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de L[] si los hay
        while (i < nL) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de R[] si los hay
        while (j < nR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Método auxiliar para imprimir el contenido de un array.
     * @param arr El array a imprimir.
     */
    public static void imprimirArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
```
[⬅️ Volver al índice](../README.md)
