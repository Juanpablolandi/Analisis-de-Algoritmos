# 🗓️ Semana 14
# Algoritmos Probabilistas

## Temas Tratados

- Propósito de la unidad
- Definición de Algoritmos Probabilistas
- Análisis del Tiempo Esperado
- Ilustración con Búsqueda Aleatoria
- Exploración de Algoritmos Numéricos
- El Método de Monte Carlo
- Otras Técnicas Numéricas
- Conceptos Fundamentales

---

### Propósito de la unidad

El objetivo de esta sección es comprender la naturaleza y el funcionamiento de los algoritmos que incorporan el azar, analizar su **rendimiento promedio (tiempo esperado)**, y examinar algoritmos numéricos como el **Método de Monte Carlo**, los cuales son particularmente útiles para realizar estimaciones y simulaciones en escenarios donde las soluciones deterministas resultan ineficientes.

---

### Definición de Algoritmos Probabilistas

> Son procedimientos computacionales que incorporan la **aleatoriedad** en su lógica interna para tomar decisiones. Esto implica que, ante la misma entrada, el algoritmo podría producir **resultados o trayectorias de ejecución distintas**.

Se clasifican principalmente en dos categorías:

-   **Algoritmos Las Vegas**: Estos algoritmos siempre garantizan la obtención de una solución correcta. Sin embargo, su **tiempo de ejecución puede variar** considerablemente con cada ejecución.
-   **Algoritmos Monte Carlo**: Estos métodos ofrecen una solución con una alta probabilidad de ser correcta, pero existe una **posibilidad controlable de producir un resultado incorrecto**.

---

### Análisis del Tiempo Esperado

> El **tiempo esperado** se refiere al valor promedio del tiempo que un algoritmo probabilista requiere para completar su ejecución, considerando las variaciones inherentes a su comportamiento aleatorio.

### Ilustración con Búsqueda Aleatoria

```java
import java.util.Random; // Asegúrate de importar Random

public class BusquedaAleatoriaEjemplo {
    public int realizarBusquedaAleatoria(int[] arreglo, int valorObjetivo) {
        Random generadorAleatorio = new Random();
        int contadorIntentos = 0;
        while (true) {
            int indiceAleatorio = generadorAleatorio.nextInt(arreglo.length);
            contadorIntentos++;
            if (arreglo[indiceAleatorio] == valorObjetivo) {
                return contadorIntentos; // Retorna el número de intentos hasta encontrarlo
            }
        }
    }

    public static void main(String[] args) {
        BusquedaAleatoriaEjemplo buscador = new BusquedaAleatoriaEjemplo();
        int[] misDatos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int objetivo = 50;
        int intentosNecesarios = buscador.realizarBusquedaAleatoria(misDatos, objetivo);
        System.out.println("El elemento " + objetivo + " fue encontrado en " + intentosNecesarios + " intentos.");
    }
}
```
[⬅️ Volver al índice](../README.md)
