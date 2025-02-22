package org.example;

public class AreaCalculator {
    public static void main(String[] args) {

        //linea para generar un conflicto
      
        System.out.println("Calculadora de área para diferentes figuras.");

        double base = 4;
        double altura = 2;
        // llamada al metodo triangleArea y guardo el valor devuelto por el método.
        double resultadoAreaTriangulo = triangleArea(base, altura);
        System.out.println("Resultado del area del triangulo: " + resultadoAreaTriangulo);

        double length = 5.0;
        double width = 10.0;
        System.out.println("El área del rectángulo es: " + rectangleArea(length, width));
    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // AlumnoB: Alisson Espin
    public static double triangleArea(double base, double altura) {
        double operacion = (base * altura) / 2;
        return operacion;
    }

    //AlumnoA:SaraDoral
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

}
