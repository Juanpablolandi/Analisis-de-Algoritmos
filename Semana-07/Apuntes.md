# 🗓️ Semana 07
### Temas tratados
- Recurrencias
- Suposiciones Inteligentes (Método de Sustitución)
### Recurrencias
Una recurrencia (o relación de recurrencia) es una expresión que define una función en términos de sí misma, pero con valores de entrada más pequeños. Son especialmente útiles para describir el tiempo de ejecución de algoritmos recursivos, ya que la complejidad de estos algoritmos a menudo depende de la complejidad de las llamadas a sí mismos con entradas de menor tamaño.

El tiempo de ejecución de un algoritmo recursivo se expresa más fácilmente mediante una ecuación de recurrencia.
Una relación de recurrencia define una función a través de una expresión que incluye una o más instancias (más pequeñas) de sí misma. Por ejemplo, el factorial de n (n!) puede definirse recursivamente como n×(n−1)!.
Las ecuaciones de recurrencia son cruciales para determinar las cotas asintóticas (como O, Ω, Θ) de algoritmos que emplean la recursividad.
Solución de Recurrencias
Resolver una recurrencia implica encontrar una forma no recursiva para la función, lo que nos permite determinar su complejidad asintótica. Algunas técnicas comunes para resolver recurrencias incluyen:

### Suposiciones Inteligentes (Método de Sustitución):
Calcular los primeros valores de la recurrencia para una serie de entradas pequeñas.
Buscar una regularidad o patrón en estos valores.
Inventar una forma general (una solución candidata) basándose en el patrón observado.
Demostrar por inducción matemática (o algún otro método formal) que la forma general inventada es correcta para todos los valores.
Ecuación Característica: Esta técnica se usa para recurrencias lineales homogéneas con coeficientes constantes. Involucra la creación de una ecuación polinómica cuyas raíces ayudan a determinar la forma de la solución.
Método del Árbol de Recursión: Visualiza las llamadas recursivas como un árbol, sumando el costo de cada nivel para encontrar el costo total.
Teorema Maestro: Es un método poderoso para resolver recurrencias de la forma T(n)=aT(n/b)+f(n), que son muy comunes en algoritmos de "divide y vencerás".

[⬅️ Volver al índice](../README.md)
