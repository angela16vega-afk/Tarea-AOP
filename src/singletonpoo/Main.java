package singletonpoo;

public class Main {

    public static void main(String[] args) {

        Configuracion c1 = Configuracion.getInstancia();
        Configuracion c2 = Configuracion.getInstancia();

        System.out.println(c1 == c2);
    }
}