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


