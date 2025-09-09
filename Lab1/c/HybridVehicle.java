package c;

public class HybridVehicle implements ElectricInterface, GasolineInterface {
    private double totalElectricMiles;
    private double totalKWh;
    private double milesFromGas;
    private double gallonsFromGas;
    private double costPerKWh;
    private double costPerGallon;

    public HybridVehicle() {
        this.totalElectricMiles = 0.0;
        this.totalKWh = 0.0;
        this.milesFromGas = 0.0;
        this.gallonsFromGas = 0.0;
        this.costPerKWh = 0.0;
        this.costPerGallon = 0.0;
    }

    @Override
    public double calcGasMPG(){
        return milesFromGas / gallonsFromGas;
    }

    @Override
    public void setMilesFromGas(double miles){
        this.milesFromGas = miles;
    }

    @Override
    public void setGallonsFromGas(double gallons){
        this.gallonsFromGas = gallons;
    }

    @Override
    public double calcMPGe(){
        return totalElectricMiles / (totalKWh / 33.7)
    }

    @Override
    public void setElectricMiles(double totalElectricMiles){
        this.totalElectricMiles = totalElectricMiles;
    }

    @Override
    public void setTotalKWh(double totalKWh){
        this.totalKWh = totalKWh;
    }

    @Override
    public void setCostPerKWh(double costPerKWh){
        this.costPerKWh = costPerKWh;
    }

    @Override
    public double getCostPerKWh(){
        return costPerKWh;
    }

    @Override
    public void setCostPerGallon(double costPerGallon){
        this.costPerGallon = costPerGallon;
    }

    @Override
    public double getCostPerGallon(){
        return costPerGallon;
    }
}