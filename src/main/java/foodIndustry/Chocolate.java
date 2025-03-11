package foodIndustry;

public class Chocolate implements IProcessedFood{

    private String name = "Chocolate";
    private double pricePerUnit = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public String addToBatch(){
        return "Chocolate adicionado ao lote.";
    }

    @Override
    public String accept(IFoodVisitor visitor) {
        return visitor.visit(this);
    }

}
