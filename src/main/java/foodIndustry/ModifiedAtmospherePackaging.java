package foodIndustry;

public class ModifiedAtmospherePackaging implements PackagingTechniqueStrategy {

    private ModifiedAtmospherePackaging() {}

    private static ModifiedAtmospherePackaging instance = new ModifiedAtmospherePackaging();

    public static ModifiedAtmospherePackaging getInstance() {
        return instance;
    }

    @Override
    public String packBatch(FoodBatch batch) {
        return "Lote " + batch.getIdBatch() + " empacotado com técnica de embalagem com Atmosfera Modificada.";
    }

}
