public class Envio {
    public static double calcularCostoEnvio(double monto) {
        return calcularCostoEnvio(monto, false);
    }
    public static double calcularCostoEnvio(double monto, boolean esPremium) {
        if (esPremium) {
            return 0.0;
        }
        if (monto < 500) {
            return 100.0;
        } else if (monto < 1000.0) {
            return 50.0;
        } else {
            return 0.0;
        }
    }
}