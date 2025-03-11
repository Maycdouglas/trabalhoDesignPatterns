package foodIndustry;

public interface IFoodVisitor {
    String visit(Biscuit biscuit);
    String visit(Snack snack);
    String visit(Chocolate chocolate);
}
