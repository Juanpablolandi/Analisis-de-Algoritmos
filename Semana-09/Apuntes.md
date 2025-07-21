# 🗓️ Semana 09
# Algoritmos Voraces

## Temas Tratados

- Objetivo
- Características
- Grafos No Dirigidos
- Ejemplos Clásicos

---

### Objetivo

Explorar las **características** y **aplicaciones** de los algoritmos voraces, especialmente en el contexto de **grafos no dirigidos**, reconociendo cuándo son una buena elección y cómo ofrecen soluciones óptimas o aproximadas de forma eficiente.

---

### Características

Los algoritmos voraces toman decisiones **localmente óptimas** con la esperanza de encontrar una **solución global óptima**. No retroceden ni reconsideran elecciones anteriores.

| Característica            | Descripción                                                                 |
|---------------------------|-----------------------------------------------------------------------------|
| Selección local óptima | Toma la mejor decisión disponible en ese momento                            |
| No hay retroceso       | Una vez que elige, no vuelve atrás ni corrige                               |
| Subestructura óptima   | Una solución óptima global incluye soluciones óptimas a subproblemas        |
| Eficiencia             | Suelen tener menor complejidad que otros enfoques como DP o Backtracking    |

---

### Grafos No Dirigidos

Los algoritmos voraces se aplican en grafos **no dirigidos** para construir **árboles de expansión mínima**, encontrar caminos más cortos, entre otros.

### Árbol de Expansión Mínima (MST)

### Código Kruskal

```java
// Pseudocódigo básico
OrdenarAristasPorPeso();
foreach(arista in ordenadas){
  if (!formaCiclo(arista)){
    agregarAlÁrbol(arista);
  }
}
```
[⬅️ Volver al índice](../README.md)
