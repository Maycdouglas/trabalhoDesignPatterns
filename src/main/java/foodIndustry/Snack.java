package foodIndustry;

public class Snack implements IProcessedFood {

    private String name = "Salgadinho";
    private double pricePerUnit = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String addToBatch(){
        return "Salgadinho adicionado ao lote.";
    }

    @Override
    public String accept(IFoodVisitor visitor) {
        return visitor.visit(this);
    }
}
