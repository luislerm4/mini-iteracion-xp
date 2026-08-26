public class Envio_test {
    public static void main(String[] args) {
        //casos de prueba
        verificar(100.0, Envio.calcularCostoEnvio(400.0), "Pedido $400 - Envio $100");
        verificar(50.0, Envio.calcularCostoEnvio(700.0), "Pedido $700 - Envio 50$");
        verificar(0.0, Envio.calcularCostoEnvio(1200.0), "Pedido $1200 - Envio 0$");

        //casos frontera
        verificar (100.0, Envio.calcularCostoEnvio(499.99), "Frontera $499.99 - Envio 100$");
        verificar(50.0, Envio.calcularCostoEnvio(500.00), "Frontera $500.00 - Envio $50");
        verificar(50.0, Envio.calcularCostoEnvio(999.99), "Frontera $999.99 - Envio $50");
        verificar(0.0, Envio.calcularCostoEnvio(1000.00), "Frontera $1000.00 - Envio $0");

        //cliente premium
        verificar(0.0, Envio.calcularCostoEnvio(400.0, true), "Cliente Premium $400 - Envio $0");
        verificar(0.0, Envio.calcularCostoEnvio(499.99, true), "Cliente Premium $499.99 - Envio $0");

    }
    //Metodo para verificar resultados
    public static void verificar (double esperado, double obtenido, String nombrePrueba) {
            if (Math.abs(esperado - obtenido) < 0.001){
                System.out.println("Paso: " + nombrePrueba);
            } else {
                System.err.println("fallo: " +nombrePrueba + ", Esperado: " + esperado +", Obtenido: " + obtenido);
            }
        }

    }
