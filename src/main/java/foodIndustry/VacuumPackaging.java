package foodIndustry;

public class VacuumPackaging implements PackagingTechniqueStrategy {

    private VacuumPackaging() {}

    private static VacuumPackaging instance = new VacuumPackaging();

    public static VacuumPackaging getInstance() {
        return instance;
    }

    @Override
    public String packBatch(FoodBatch batch) {
        return "Lote " + batch.getIdBatch() + " empacotado com técnica de embalagem a vácuo.";
    }
}
