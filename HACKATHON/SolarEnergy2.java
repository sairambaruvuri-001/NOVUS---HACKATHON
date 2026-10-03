import java.util.Scanner;

class SolarEnergy2 {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Morning Energy (kWh): ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter Evening Energy (kWh): ");
        double eveningEnergy = sc.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + total + " kWh");
    }
}