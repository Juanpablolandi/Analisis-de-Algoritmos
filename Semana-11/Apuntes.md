# 🗓️ Semana 11
# Algoritmos Divide y Vencerás

## Temas Tratados

- Propósito
- Fundamentos de Divide y Vencerás
- Mecanismo de la búsqueda binaria
- Implementación de ejemplo en Java

---

### Propósito

Asimilar la aplicación de la estrategia **Divide y Vencerás** a través del algoritmo de **búsqueda binaria**, optimizando la eficiencia en el procesamiento de colecciones de datos ordenadas.

---

### Fundamentos de Divide y Vencerás

Esta es una metodología algorítmica fundamental que sigue una secuencia de tres fases:

1.  **Fragmentar:** El problema original se descompone en subproblemas de menor magnitud.
2.  **Conquistar:** Cada subproblema se resuelve de manera recursiva, abordándolos individualmente.
3.  **Ensamblar:** Las soluciones obtenidas de los subproblemas se integran para formar la solución global del problema inicial.

Esta técnica es particularmente útil cuando el problema puede descomponerse en porciones que mantienen una similitud estructural con el problema original.

---

### Mecanismo de la búsqueda binaria

La **búsqueda binaria** es un algoritmo eficiente para localizar un elemento específico dentro de una colección de datos que debe estar previamente **ordenada**. Opera reduciendo a la mitad el rango de búsqueda en cada iteración:

1.  Se compara el valor deseado con el elemento posicionado en el punto central del rango actual.
2.  Si la coincidencia es exacta, el elemento ha sido encontrado.
3.  Si el valor buscado es menor que el elemento central, la búsqueda continúa únicamente en la mitad izquierda del rango.
4.  Si el valor buscado es mayor, la exploración se restringe a la mitad derecha del rango.

La **complejidad temporal** de este algoritmo es notablemente eficiente, clasificándose como $O(\log n)$.

---

### Implementación de ejemplo en Java

```java
public class BusquedaBinaria {
    public static int buscarElemento(int[] arregloOrdenado, int valorBuscado) {
        int limiteInferior = 0;
        int limiteSuperior = arregloOrdenado.length - 1;

        while (limiteInferior <= limiteSuperior) {
            int puntoMedio = limiteInferior + (limiteSuperior - limiteInferior) / 2; // Evita desbordamiento para números grandes

            if (arregloOrdenado[puntoMedio] == valorBuscado) {
                return puntoMedio; // Elemento encontrado en esta posición
            } else if (arregloOrdenado[puntoMedio] < valorBuscado) {
                limiteInferior = puntoMedio + 1; // Buscar en la mitad derecha
            } else {
                limiteSuperior = puntoMedio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // El elemento no se encuentra en el arreglo
    }

    public static void main(String[] args) {
        int[] miArreglo = {2, 4, 6, 8, 10, 12, 14, 16};
        int elementoAEncontrar = 10;
        int resultadoIndice = buscarElemento(miArreglo, elementoAEncontrar);

        if (resultadoIndice != -1) {
            System.out.println("El elemento " + elementoAEncontrar + " fue hallado en el índice: " + resultadoIndice);
        } else {
            System.out.println("El elemento " + elementoAEncontrar + " no está presente en el arreglo.");
        }
    }
}
```
[⬅️ Volver al índice](../README.md)
