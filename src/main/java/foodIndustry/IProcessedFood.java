package foodIndustry;

public interface IProcessedFood {

    String getName();
    String addToBatch();
    String accept(IFoodVisitor visitor);
}
