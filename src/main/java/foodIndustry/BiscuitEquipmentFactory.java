package foodIndustry;

public class BiscuitEquipmentFactory implements IEquipmentFactory {

    @Override
    public IMixer createMixer() {
        return new BiscuitMixer();
    }

    @Override
    public IOven createOven() {
        return new BiscuitOven();
    }
}
