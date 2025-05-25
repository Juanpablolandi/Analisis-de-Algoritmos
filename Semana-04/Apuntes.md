# 🗓️ Semana 04
### Temas tratados:
- Notación Asintótica
- Notación para "El Orden de"
- Ejemplos Comunes de Notación Big O:
### Notación Asintótica
La notación asintótica es un conjunto de herramientas matemáticas fundamentales que nos permiten describir el comportamiento de una función a medida que su entrada crece indefinidamente (tiende a infinito). Su propósito principal es evaluar la eficiencia de un algoritmo para entradas muy grandes, lo que permite comparar diferentes algoritmos de una manera más precisa e independiente del hardware o de la implementación específica.

### Notación para "El Orden de"
Para describir el "orden de" la eficiencia de un algoritmo, se utiliza comúnmente la Notación Big O (también conocida como notación O-grande). Esta notación matemática se usa específicamente para establecer el límite superior del tiempo o el espacio (memoria) que un algoritmo necesita para ejecutarse, a medida que el tamaño de la entrada crece. En esencia, nos dice qué tan rápido "empeora" el rendimiento de un algoritmo en su peor escenario a medida que el problema se hace más grande.

### Ejemplos Comunes de Notación Big O:
O(1) → Tiempo Constante: El tiempo de ejecución es independiente del tamaño de la entrada. Un ejemplo es acceder a un elemento en un array por su índice.

O(logn) → Tiempo Logarítmico: El tiempo de ejecución crece muy lentamente a medida que la entrada aumenta. Esto se ve en algoritmos que dividen el problema en mitades repetidamente, como la búsqueda binaria.

O(n) → Tiempo Lineal: El tiempo de ejecución crece de forma directamente proporcional al tamaño de la entrada. Un ejemplo es recorrer todos los elementos de una lista.

O(nlogn) → Tiempo "Lineal-Logarítmico": Esta es una categoría de eficiencia muy deseable para muchos algoritmos de ordenamiento eficientes, como Merge Sort o Quick Sort, que combinan divisiones logarítmicas con operaciones lineales.

O(n 2) → Tiempo Cuadrático: El tiempo de ejecución crece de forma cuadrática con el tamaño de la entrada. Esto es común en algoritmos que implican bucles anidados, como Bubble Sort o la búsqueda de pares en una lista.

O(2 n) → Tiempo Exponencial: El tiempo de ejecución crece de forma extremadamente rápida con la entrada. Este nivel de complejidad suele asociarse con problemas que son inherentemente difíciles de resolver por fuerza bruta, como algunas soluciones al problema de las Torres de Hanoi o el problema del viajante.
