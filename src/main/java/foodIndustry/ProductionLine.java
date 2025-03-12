package foodIndustry;

public abstract class ProductionLine {

    protected IMixer mixer;
    protected IOven oven;

    public ProductionLine(IEquipmentFactory factory) {
        this.mixer = factory.createMixer();
        this.oven = factory.createOven();
    }

    public String startProduction() {

        String resultOperation;

        resultOperation =  mixIngredients();
        resultOperation = resultOperation + "\n" + cook();

        return resultOperation + "\n Produção de " + getProductType() + " concluída!";
    }

    protected abstract String getProductType();

    protected String mixIngredients() {

        return mixer.mix();
    }

    protected String cook() {
        return oven.bake();
    }

}
