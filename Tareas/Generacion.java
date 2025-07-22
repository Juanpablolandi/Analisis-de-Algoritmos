public class Generacion {
    public static void main(String[] args) {
        int numElementos = 100;
        long valorInicialSemilla = 12345L; // Usamos 'L' para indicar que es un long literal

        double[] secuenciaAleatoria = obtenerSecuenciaPseudoaleatoria(valorInicialSemilla, numElementos);

        System.out.println("Los primeros 10 números pseudoaleatorios generados son:");
        for (int i = 0; i < Math.min(10, secuenciaAleatoria.length); i++) { // Aseguramos no exceder el tamaño del array
            System.out.println(secuenciaAleatoria[i]);
        }
    }

    public static double[] obtenerSecuenciaPseudoaleatoria(long semilla, int cantidadNumeros) {
        // Parámetros del generador congruencial lineal (valores comunes de Numerical Recipes)
        long multiplicador = 1664525L;
        long incremento = 1013904223L;
        long modulo = (long) Math.pow(2, 32); // Usamos Math.pow y luego casteamos a long

        double[] serieResultante = new double[cantidadNumeros];
        long estadoActual = semilla; // El estado interno del generador

        for (int i = 0; i < cantidadNumeros; i++) {
            estadoActual = (multiplicador * estadoActual + incremento) % modulo;
            // Normalizamos el valor a un rango entre 0 y 1 (exclusivo en 1)
            serieResultante[i] = (double) estadoActual / modulo;
        }

        return serieResultante;
    }
}
