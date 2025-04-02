public class Task1lab2 {
    // encontrar el número más pequeño en un array
    public static int encontrarMinimo(int[] numeros) {
        int minimo = numeros[0]; // Inicializamos con el primer valor
        for (int num : numeros) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    // encontrar el número más grande en un array
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    // diferencia entre el mayor y el menor valor
    public static int diferenciaMaxMin(int[] numeros) {
        if (numeros.length < 1) {
            throw new IllegalArgumentException("El array debe tener mínimo 1 elemento.");
        }
        return encontrarMaximo(numeros) - encontrarMinimo(numeros);
    }

    // main
    public static void main(String[] args) {
        int[] numeros = {85, 4, 63, 21, 54};

        System.out.println("El número más pequeño es: " + encontrarMinimo(numeros));
        System.out.println("El número más grande es: " + encontrarMaximo(numeros));
        System.out.println("La diferencia entre el máximo y el mínimo es: " + diferenciaMaxMin(numeros));
    }
}

