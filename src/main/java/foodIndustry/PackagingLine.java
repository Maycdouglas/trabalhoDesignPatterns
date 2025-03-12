package foodIndustry;

public class PackagingLine {

    public String packBatch(FoodBatch batch) throws CloneNotSupportedException {

        Packaging packaging = Packaging.getInstance().clone();
        packaging.setProductName(batch.getFood().getName());
        packaging.setIdBatch(batch.getIdBatch());

        PackagingTechniqueStrategy strategy = batch.getStrategy();
        return strategy.packBatch(batch);
    }

}
