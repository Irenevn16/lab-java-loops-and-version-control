public class Task2lab2 {
    //Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.
    public static void main(String[] args) {
        int[] numbers = {875, 145, 26, 99};

        int smallest = Integer.MAX_VALUE;//se inicializa con el valor máx para un int asegurando que el número sea menor
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) { //Recorre cada elemento del array numbers uno por uno, y asigna cada valor a la variable nueva number.
            if (number < smallest) { /*si el num es más pequeño que el smallest inicializado al MAX VALUE, primero cambia el antiguo valor de smallest a secondS,
                y luego asigna a smallest el num que esta recorriendo, así con todos mientras se cumpla la condición*/
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {//el num recorrido no es el smallest pero si menor a secondS
                secondSmallest = number;
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("second smallest = " + secondSmallest);
    }


}
