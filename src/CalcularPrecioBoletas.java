public class CalcularPrecioBoletas {
    public double calcularPrecio(int cantidad) throws IllegalArgumentException {
        double precioUnitario = 7000.0; // Precio de una sola boleta
        double precioTotal;

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad de boletas debe ser mayor a cero");
        } else {
            precioTotal = cantidad * precioUnitario;
        }

        return precioTotal;
    }
}
