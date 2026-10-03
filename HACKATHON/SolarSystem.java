import java.util.Scanner;

class SolarSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Panel ID: ");
        int panelId = sc.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        double energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        int numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status: ");
        char systemStatus = sc.next().charAt(0);

        System.out.println("\n--- Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}