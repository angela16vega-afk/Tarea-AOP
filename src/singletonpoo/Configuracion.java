package singletonpoo;

public class Configuracion {

    private static Configuracion instancia;

    private Configuracion() {
        System.out.println("Instancia creada");
    }

    public static Configuracion getInstancia() {

        if (instancia == null) {
            instancia = new Configuracion();
        }

        return instancia;
    }
}