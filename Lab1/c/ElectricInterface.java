public interface ElectricInterface {
    
    double calcMPGe();
    void setElectricMiles(double totalElectricMiles);
    void setTotalKWh(double totalKWh);
    void setCostPerKWh(double costPerKWh);
    double getCostPerKWh();
}