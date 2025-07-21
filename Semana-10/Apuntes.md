# 🗓️ Semana 10
# Algoritmos Voraces

## Temas Tratados

- Objetivo
- Concepto de grafos dirigidos
- Uso de enfoques voraces
- Algoritmo de Dijkstra

---

### Objetivo

Profundizar en la aplicación de algoritmos voraces sobre **grafos dirigidos**, focalizándose en la determinación de las rutas más cortas desde un punto de partida hacia todos los demás nodos.

---

### Concepto de grafos dirigidos

Los **grafos dirigidos (digrafos)** consisten en un conjunto de vértices interconectados por aristas que poseen una orientación específica. Esto implica que una conexión desde el nodo $A$ hacia el nodo $B$ ($A \rightarrow B$) **no garantiza automáticamente** una conexión en sentido inverso ($B \rightarrow A$).

En el contexto de los algoritmos, esta característica direccional es fundamental para definir cómo se exploran los nodos y cómo se calculan las trayectorias.

---

### Uso de enfoques voraces

En el ámbito de los grafos dirigidos, los algoritmos de tipo voraz se emplean principalmente para identificar las **rutas de menor costo** partiendo de un nodo fuente.

### ¿Por qué son efectivos?

Los grafos dirigidos que poseen **valores de peso positivos** en sus aristas son escenarios ideales para algoritmos como **Dijkstra**. Este algoritmo voraz selecciona de manera iterativa el nodo con la distancia más reducida conocida, y subsiguientemente actualiza los costos estimados para sus nodos adyacentes, sin la necesidad de reevaluar decisiones previas.

---

### Algoritmo de Dijkstra

### Explicación detallada

### Pseudocódigo de Dijkstra

```python
Inicializar distancias_minimas[] a infinito para todos los nodos, excepto el nodo_origen (0);
Crear una estructura de cola_de_prioridad para los nodos a procesar;

Mientras la cola_de_prioridad no esté vacía:
    Extraer el nodo_actual de la cola que tenga la menor distancia_minima;
    Para cada nodo_vecino del nodo_actual que no haya sido completamente visitado:
        Calcular nueva_distancia = distancia_minima[nodo_actual] + peso_arista(nodo_actual, nodo_vecino);
        Si nueva_distancia < distancia_minima[nodo_vecino]:
            Actualizar distancia_minima[nodo_vecino] = nueva_distancia;
            Añadir nodo_vecino a la cola_de_prioridad;
```
[⬅️ Volver al índice](../README.md)
