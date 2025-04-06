//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class GravityCalculator {
    public static void main (String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0; //vi
        double fallingTime = 10.0;//t
        double initialPosition = 0.0;//Xi
        double finalPosition = 0.0;//x(t) = 0.5 * at^2 + vit + xi

        finalPosition = 0.5 * (-9.81 * Math.pow(fallingTime, 2) + (initialVelocity * fallingTime) + initialPosition);
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}