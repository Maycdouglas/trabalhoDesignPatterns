package foodIndustry;

public class PackagingLine {

//    private PackagingTechniqueStrategy strategy;

//    public void setStrategy(PackagingTechniqueStrategy strategy) {
//        this.strategy = strategy;
//    }

    public String packBatch(FoodBatch batch) {
        PackagingTechniqueStrategy strategy = batch.getStrategy();
        return strategy.packBatch(batch);
    }

}
