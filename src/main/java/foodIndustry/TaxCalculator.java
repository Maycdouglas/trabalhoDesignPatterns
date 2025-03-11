package foodIndustry;

public class TaxCalculator implements IFoodVisitor {

    public String calculateTax(IProcessedFood food){
        return food.accept(this);
    }

    @Override
    public String visit(Biscuit biscuit){
        return "Imposto sobre " + biscuit.getName() + ": " + (biscuit.getPricePerUnit() * 0.05) + " (5%)";
    }

    @Override
    public String visit(Snack snack){
        return "Imposto sobre " + snack.getName() + ": " + (snack.getPricePerUnit() * 0.10) + " (10%)";
    }

    @Override
    public String visit(Chocolate chocolate){
        return "Imposto sobre " + chocolate.getName() + ": " + (chocolate.getPricePerUnit() * 0.20) + " (20%)";
    }

}
