package foodIndustry;

public class ChocolateEquipmentFactory implements IEquipmentFactory {

    @Override
    public IMixer createMixer() {
        return new ChocolateMixer();
    }

    @Override
    public IOven createOven() {
        return new ChocolateOven();
    }
}
