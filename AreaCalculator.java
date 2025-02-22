package org.example;

public class AreaCalculator {
    public static void main(String[] args) {
        // linea creada para getionar el conflicto Alisson Espin
        System.out.println("Calculadora de área para diferentes figuras.");

        double base = 4;
        double altura = 2;
        // llamada al metodo triangleArea y guardo el valor devuelto por el método.
        double resultadoAreaTriangulo = triangleArea(base, altura);
        System.out.println("Resultado del area del triangulo: " + resultadoAreaTriangulo);

    }
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // AlumnoB: Alisson Espin
    public static double triangleArea(double base, double altura) {
        double operacion = (base * altura) / 2;
        return operacion;
    }

    //mensaje de prueba
}
