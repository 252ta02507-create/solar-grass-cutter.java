import java.util.Scanner;

public class SolarGrassCutter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter solar energy generated (Wh): ");
        double solarEnergy = sc.nextDouble();

        System.out.print("Enter battery capacity (Wh): ");
        double batteryCapacity = sc.nextDouble();

        System.out.print("Enter motor power (W): ");
        double motorPower = sc.nextDouble();

        System.out.print("Enter cutting time (hours): ");
        double cuttingTime = sc.nextDouble();

        // Energy required by the motor
        double energyRequired = motorPower * cuttingTime;

        // Total available energy
        double availableEnergy = Math.min(solarEnergy, batteryCapacity);

        System.out.println("\n--- Solar Grass Cutter ---");
        System.out.println("Solar Energy      : " + solarEnergy + " Wh");
        System.out.println("Battery Capacity  : " + batteryCapacity + " Wh");
        System.out.println("Motor Power       : " + motorPower + " W");
        System.out.println("Energy Required   : " + energyRequired + " Wh");

        if (availableEnergy >= energyRequired) {
            double remainingEnergy = availableEnergy - energyRequired;

            System.out.println("Status            : Grass Cutter ON");
            System.out.println("Cutting grass...");
            System.out.println("Remaining Energy  : " + remainingEnergy + " Wh");
        } else {
            System.out.println("Status            : Grass Cutter OFF");
            System.out.println("Reason            : Insufficient energy.");
        }

        sc.close();
    }
}
