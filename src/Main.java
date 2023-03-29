import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de boletas:");
        int cantidad = scanner.nextInt();

        CalcularPrecioBoletas calcularPrecioBoletas = new CalcularPrecioBoletas();
        try {
            double precioTotal = calcularPrecioBoletas.calcularPrecio(cantidad);
            System.out.println("El precio total a pagar es: " + precioTotal);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




