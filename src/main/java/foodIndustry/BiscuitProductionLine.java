package foodIndustry;

public class BiscuitProductionLine extends ProductionLine {

    public BiscuitProductionLine(IEquipmentFactory factory) {
        super(factory);
    }

    @Override
    protected String getProductType() {
        return "Biscoitos";
    }
}
