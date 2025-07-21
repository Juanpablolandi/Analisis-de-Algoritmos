# 🗓️ Semana 12
# Algoritmos Divide y Vencerás

## Temas Tratados

- Propósito fundamental
- Definición de "Divide y Vencerás"
- Algoritmos de Ordenación Principales
  - Merge Sort
  - Quick Sort
- Nociones Clave
- Beneficios de la Estrategia
- Fragmento de Código Ilustrativo

---

### Propósito fundamental

Este segmento busca proporcionar una comprensión profunda y práctica de los algoritmos de **ordenación** que emplean la metodología de **Divide y Vencerás**, enfatizando su rendimiento y adaptabilidad en diversas situaciones.

---

### Definición de "Divide y Vencerás"

> Esta es una paradigmática estrategia de diseño algorítmico. Su premisa se basa en la descomposición de un problema complejo en subproblemas más simples, la resolución recursiva de estos subproblemas, y finalmente, la integración de sus soluciones individuales para conformar la solución completa del problema original.

---

### Algoritmos de Ordenación Principales

### Merge Sort

> Merge Sort funciona dividiendo consistentemente un arreglo en mitades más pequeñas hasta que cada segmento contiene un único elemento. Posteriormente, estos segmentos unitarios se fusionan de forma ordenada, reconstruyendo el arreglo completo.

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // Previene desbordamiento para grandes valores
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    // Método auxiliar para combinar los subarreglos ordenados
    static void merge(int[] arr, int left, int mid, int right) {
        // Implementación de la lógica de fusión aquí
        // (Crear arreglos temporales, copiar datos, y combinar)
    }
}
```
[⬅️ Volver al índice](../README.md)
