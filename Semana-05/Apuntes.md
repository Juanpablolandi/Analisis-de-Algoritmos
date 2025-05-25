# 🗓️ Semana 05
### Temas tratados
- Notación Theta (Θ)
- Ejemplos de Notación Theta
- Notación Asintótica Condicional
### Notación Theta (Θ)
La Notación Theta (Θ) se utiliza para describir un límite ajustado (tight bound) en el crecimiento del tiempo de ejecución o el uso de recursos de un algoritmo. A diferencia de la Notación Big O (O), que solo proporciona una cota superior, y la Notación Big Omega (Ω), que da una cota inferior, la Notación Theta combina ambas. Esto significa que Θ indica que el crecimiento del algoritmo es exactamente proporcional a una función dada. Es la notación más precisa para describir la eficiencia asintótica de un algoritmo, ya que define tanto su comportamiento mínimo como máximo.

### Ejemplos de Notación Theta:
Θ(1) → Operaciones de Tiempo Constante: El tiempo de ejecución es fijo y no depende del tamaño de la entrada. Un ejemplo es el acceso directo a un elemento en un arreglo usando su índice.

Θ(n) → Tiempo Lineal: El tiempo de ejecución crece linealmente con el tamaño de la entrada n. Esto se observa al recorrer una lista completa de n elementos, ya que requiere n pasos.

Θ(nlogn) → Tiempo "Lineal-Logarítmico": Esta es la eficiencia característica de muchos algoritmos de ordenamiento óptimos basados en comparaciones, como Merge Sort y Heap Sort, que logran un equilibrio eficiente entre la división y la combinación de datos.

Θ(n 2) → Tiempo Cuadrático: El tiempo de ejecución crece de forma cuadrática con el tamaño de la entrada n. Un ejemplo clásico es el algoritmo Bubble Sort en el peor caso, donde cada elemento podría necesitar ser comparado con todos los demás en cada pasada.

### Notación Asintótica Condicional
La Notación Asintótica Condicional se refiere al estudio del comportamiento de un algoritmo bajo restricciones o supuestos específicos en la entrada, que afectan su complejidad temporal o espacial. A diferencia de las notaciones asintóticas estándar que consideran el comportamiento general, este enfoque introduce condiciones particulares que modifican la cota asintótica.

Por ejemplo, un algoritmo que usualmente es O(n 2) podría convertirse en O(n) si la entrada ya está casi ordenada, o si ciertos valores no se repiten. Este tipo de análisis es útil para entender el rendimiento de un algoritmo en escenarios del mundo real donde las entradas no siempre se ajustan al "caso peor" general. Permite una evaluación más granular y específica del algoritmo en contextos definidos.
