package foodIndustry;

public class SnackEquipmentFactory implements IEquipmentFactory {

    @Override
    public IMixer createMixer() {
        return new SnackMixer();
    }

    @Override
    public IOven createOven() {
        return new SnackOven();
    }
}
