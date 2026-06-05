package adapteraop;

public class Main {
    public static void main(String[] args) {
        // El cliente solo instancia una implementación básica de la interfaz objetivo
        Motor motor = new Motor() {
            @Override
            public void encender() {
                // Dejado en blanco de forma intencional.
                // El @Around del aspecto reemplazará este bloque por completo.
            }
        };

        // Desvía el flujo hacia AdaptadorMotorAspect y ejecuta el conectar() del MotorElectrico.
        motor.encender(); 
    }
}
