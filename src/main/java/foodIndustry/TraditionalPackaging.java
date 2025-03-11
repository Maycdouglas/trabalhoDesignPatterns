package foodIndustry;

public class TraditionalPackaging implements PackagingTechniqueStrategy {

    private TraditionalPackaging() {}

    private static TraditionalPackaging instance = new TraditionalPackaging();

    public static TraditionalPackaging getInstance() {
        return instance;
    }

    @Override
    public String packBatch(FoodBatch batch) {
        return "Lote " + batch.getIdBatch() + " empacotado com técnica de embalagem tradicional.";
    }

}
