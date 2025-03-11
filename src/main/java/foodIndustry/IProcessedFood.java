package foodIndustry;

public interface IProcessedFood {
    String addToBatch();
    String accept(IFoodVisitor visitor);
}
