package foodIndustry;

import java.util.Observable;
import java.util.Observer;

public class Supervisor implements Observer {

    private String name;
    private String registration;
    private String lastNotification;

    public Supervisor(String name, String registration) {
        this.name = name;
        this.registration = registration;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    public void supervise(FoodBatch foodBatch) {
        foodBatch.addObserver(this);
    }

    public void update(Observable foodBatch, Object arg) {
        this.lastNotification = "O lote " + foodBatch.toString() + " foi enviado para reanálise!";
    }
}
