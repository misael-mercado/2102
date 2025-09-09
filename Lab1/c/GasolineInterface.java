public interface GasolineInterface {
    
    double calcGasMPG();
    void setMilesFromGas(double miles);
    void setGallonsFromGas(double gallons);
    void setCostPerGallon(double costPerGallon);
    double getCostPerGallon();
}