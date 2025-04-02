public class Task3lab2 {

    public static void main(String[] args) {
        //definimos las variables predeterminadas
        double x = 5.0;
        double y = 7.0;

        //calculamos cada parte
        double xCuadrado = Math.pow(x, 2); //elevao al cuadrado
        double parentesis = Math.pow((((4 * y) / 5) - x), 2);
        //sumamos
        double result =  xCuadrado + parentesis;

        System.out.println("El resultado de la expresión es: "+ result);
    }
}
