public class Main {
    public static void main(String[] args) {
        double summerMaintenanceCost = 700.00;
        double fallMaintenanceCost = 400.00;
        double winterMaintenanceCost = 600.00;
        double springMaintenanceCost = 280.00;
        double yearlyMaintenanceCost = summerMaintenanceCost+fallMaintenanceCost+winterMaintenanceCost+springMaintenanceCost;
        System.out.println("The yearly maintenance cost is the sum of "+ summerMaintenanceCost + ", "+ fallMaintenanceCost+ ", "+ winterMaintenanceCost + " and "+ springMaintenanceCost + " which is "+ yearlyMaintenanceCost);
    }
}