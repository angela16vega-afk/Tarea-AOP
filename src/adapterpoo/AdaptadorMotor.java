package adapterpoo;

public class AdaptadorMotor implements Motor {

    private MotorElectrico motor;

    public AdaptadorMotor(MotorElectrico motor) {
        this.motor = motor;
    }

    @Override
    public void encender() {
        motor.conectar();
    }
}