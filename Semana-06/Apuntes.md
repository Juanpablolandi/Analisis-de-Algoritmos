# 🗓️ Semana 06
### Temas tratados
- Notación Theta (Θ)
- Ejemplos de Notación Theta
- Notación Asintótica Condicional
- Análisis de las estructuras de control
- Secuencias
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

### Análisis de las estructuras de control

El análisis de algoritmos se realiza de manera sistemática, comenzando por evaluar el tiempo de ejecución de las instrucciones individuales, que generalmente está acotado por una constante. Luego, estos tiempos se combinan según las estructuras de control del programa. Algunas estructuras, como la composición secuencial (instrucciones en orden), son sencillas de analizar, mientras que otras, como los bucles mientras, requieren un enfoque más detallado.

### Secuencias

la regla de la composición secuencial se refiere al análisis del tiempo de ejecución de un algoritmo cuando las instrucciones se ejecutan una después de otra (en secuencia).

Fórmula: Si una instrucción toma tiempo T1​ y la siguiente T2, el tiempo total es la suma T1 + T2

Bucles Para (Desde)

El tiempo de un bucle depende del número de iteraciones y del tiempo de cada iteración.

Ejemplo: para i <- 1 hasta m hacer p(i)

Bucles "mientras" (While) y repetir (repeat)

Los bucles mientras se ejecutan un bloque de código mientras una condición sea verdadera.

La condición se evalúa antes de cada iteración.

Si la condición es falsa desde el inicio, el bloque no se ejecuta.

Ejemplo: mientras i ≤ m hacer

p(i)

i <- i + 1

Los bulces repetir se ejecutan un bloque de código al menos una vez y luego repite hasta que una condición sea verdadera.

La condición se evalúa después de cada iteración.

Siempre se ejecuta al menos una vez, incluso si la condición es falsa inicialmente.

Ejemplo: i ← 0

repetir

escribir("Iteración ", i)

i ← i + 1

hasta que (i ≥ 5)



Aquí tienes el análisis de las estructuras de control, presentado con el formato solicitado:

Análisis de las Estructuras de Control
El análisis de algoritmos se lleva a cabo de forma sistemática. Comenzamos evaluando el tiempo de ejecución de las instrucciones individuales, las cuales, por lo general, tienen un tiempo de ejecución que se puede acotar por una constante. Estos tiempos individuales se combinan luego según las estructuras de control del programa. Algunas estructuras, como la composición secuencial (instrucciones que se ejecutan una tras otra), son relativamente sencillas de analizar, mientras que otras, como los bucles o las condiciones, requieren un enfoque más detallado para determinar su impacto en la eficiencia general.

### Secuencias
La regla de la composición secuencial se aplica cuando las instrucciones de un algoritmo se ejecutan una después de otra, en orden consecutivo. El tiempo total de ejecución de una secuencia es simplemente la suma de los tiempos de ejecución de cada instrucción individual.

Fórmula: Si una instrucción toma un tiempo T 1 y la siguiente instrucción toma un tiempo T 2, el tiempo total para ejecutar la secuencia será T 1​ + T 2.

Bucles Para (o 'For')
El tiempo de ejecución de un bucle 'para' depende principalmente de dos factores: el número total de iteraciones que realiza y el tiempo que toma cada iteración del bloque de código dentro del bucle.

Ejemplo:
```
para i <- 1 hasta m hacer p(i) // Operación que se ejecuta en cada iteración
```
En este caso, la operación p(i) se ejecuta m veces. Si p(i) toma un tiempo constante C, entonces el tiempo total del bucle sería m×C, lo que resulta en una complejidad de O(m) o Θ(m).

Bucles Mientras ('While') y Repetir ('Repeat-Until')
Bucles "Mientras" (While)
Los bucles 'mientras' ejecutan un bloque de código mientras una condición específica sea verdadera. Es importante destacar que la condición se evalúa antes de cada iteración. Si la condición es falsa desde el inicio, el bloque de código dentro del bucle no se ejecutará ni una sola vez.

Ejemplo:
```
mientras i ≤ m hacer
    p(i) // Bloque de código
    i <- i + 1
```
En este ejemplo, p(i) y la actualización de i se ejecutarán repetidamente mientras i sea menor o igual a m. La complejidad dependerá de cuántas veces se cumpla la condición.

Bucles "Repetir" (Repeat-Until)
Los bucles 'repetir' (o 'repeat-until') se diferencian de los 'mientras' en que garantizan que el bloque de código se ejecuta al menos una vez. La condición de terminación se evalúa después de cada iteración. El bucle continúa repitiéndose hasta que la condición se vuelve verdadera.

Ejemplo:
```
i ← 0
repetir
    escribir("Iteración ", i) // Bloque de código
    i ← i + 1
hasta que (i ≥ 5)
```
En este ejemplo, la impresión y el incremento de i se ejecutarán al menos una vez y continuarán hasta que i sea mayor o igual a 5. Esto significa que se ejecutará exactamente 5 veces (para i = 0, 1, 2, 3, 4).

[⬅️ Volver al índice](../README.md)

