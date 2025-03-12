package foodIndustry;

public class BatchStatusUnderAnalysis extends BatchStatus {

    private BatchStatusUnderAnalysis() {}

    private static BatchStatusUnderAnalysis instance = new BatchStatusUnderAnalysis();

    public static BatchStatusUnderAnalysis getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Em análise.";
    }

    public boolean pack(FoodBatch batch) throws CloneNotSupportedException {
        PackagingLine packagingLine = new PackagingLine();
        String resultPackaging = packagingLine.packBatch(batch);

        batch.setStatus(BatchStatusPackaged.getInstance());
        return true;
    }

    public boolean discard(FoodBatch batch) {
        batch.setStatus(BatchStatusDiscarded.getInstance());
        return true;
    }


}
