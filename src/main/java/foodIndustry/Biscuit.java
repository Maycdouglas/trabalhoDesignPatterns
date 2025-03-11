package foodIndustry;

public class Biscuit  implements IProcessedFood {

    private String name = "Biscoito";
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
        return "Biscoito adicionado ao lote.";
    }

    @Override
    public String accept(IFoodVisitor visitor) {
        return visitor.visit(this);
    }
}
