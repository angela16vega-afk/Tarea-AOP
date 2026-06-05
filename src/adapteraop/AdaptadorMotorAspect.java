package adapteraop;

public aspect AdaptadorMotorAspect {
    
    // 1. Interceptamos el punto de ejecución donde se llama a encender() de la interfaz Motor
    pointcut ejecutarEncender(Motor motor) : 
        execution(void Motor.encender()) && target(motor);

    // 2. Usamos un "Around" advice para cambiar por completo el comportamiento predeterminado
    void around(Motor motor): ejecutarEncender(motor) {
       
        MotorElectrico motorElectrico = new MotorElectrico();
        
        // Desviamos el flujo hacia el método de la clase adaptada
        motorElectrico.conectar();
    }
}
