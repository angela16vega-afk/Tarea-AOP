package adapterpoo;

public class Main {

    public static void main(String[] args) {

        MotorElectrico motorElectrico = new MotorElectrico();

        Motor motor = new AdaptadorMotor(motorElectrico);

        motor.encender();
    }
}