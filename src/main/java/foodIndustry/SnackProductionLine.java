package foodIndustry;

public class SnackProductionLine extends ProductionLine {
    public SnackProductionLine(IEquipmentFactory factory) {
        super(factory);
    }

    @Override
    protected String getProductType() {
        return "Salgadinhos";
    }
}
