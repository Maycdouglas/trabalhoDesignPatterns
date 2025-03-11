package foodIndustry;

import java.util.Observable;

public class FoodBatch extends Observable {

    private Number idBatch;
    private IProcessedFood food;
    private BatchStatus status;

    public FoodBatch(Number idBatch, IProcessedFood food) {
        this.idBatch = idBatch;
        this.food = food;
        this.status = BatchStatusUnderAnalysis.getInstance();
    }

    public BatchStatus getStatus() {
        return status;
    }

    public void setStatus(BatchStatus status) {
        this.status = status;
    }

    public Number getIdBatch() {
        return idBatch;
    }

    public IProcessedFood getFood() {
        return food;
    }

    public boolean analyze() {
        return status.analyze(this);
    }

    public boolean discard() {
        return status.discard(this);
    }

    public boolean pack() {
        return status.pack(this);
    }

    public boolean reanalyze() {

        if(status.reanalyze(this)){
            setChanged();
            notifyObservers();
            return true;
        }

        return false;
    }

    public boolean transport() {
        return status.transport(this);
    }

    public boolean confirmDelivery() {
        return status.confirmDelivery(this);
    }

    @Override
    public String toString() {
        return String.valueOf(this.getIdBatch());
    }

}
