package foodIndustry;

public class ChocolateProductionLine extends ProductionLine {
    public ChocolateProductionLine(IEquipmentFactory factory) {
        super(factory);
    }

    @Override
    protected String getProductType() {
        return "Chocolates";
    }
}
