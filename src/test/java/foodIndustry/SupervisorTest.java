package foodIndustry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {

    FoodBatch foodBatch;
    Supervisor supervisor;
    Boolean statusOperation;

    @BeforeEach
    public void setUp() throws CloneNotSupportedException {
        Biscuit biscuit = new Biscuit();
        foodBatch = new FoodBatch(123, biscuit);
        statusOperation = foodBatch.pack();
        supervisor = new Supervisor("João", "S1234");
    }

    @Test
    void deveNotificarUmSupervisor(){
        supervisor.supervise(foodBatch);
        statusOperation = foodBatch.reanalyze();
        assertEquals("O lote 123 foi enviado para reanálise!",supervisor.getLastNotification());
    }

    @Test
    void deveNotificarSupervisores(){
        Supervisor supervisor2 = new Supervisor("Maria", "S4321");
        supervisor.supervise(foodBatch);
        supervisor2.supervise(foodBatch);
        statusOperation = foodBatch.reanalyze();
        assertEquals("O lote 123 foi enviado para reanálise!", supervisor.getLastNotification());
        assertEquals("O lote 123 foi enviado para reanálise!", supervisor2.getLastNotification());
    }

    @Test
    void naoDeveNotificarSupervisor(){
        statusOperation = foodBatch.reanalyze();
        assertNull(supervisor.getLastNotification());
    }

    @Test
    void deveNotificarSupervisorLote123(){
        Supervisor supervisor2 = new Supervisor("Maria", "S4321");
        Snack snack = new Snack();
        FoodBatch foodBatch2 = new FoodBatch(321,snack);
        supervisor.supervise(foodBatch);
        supervisor2.supervise(foodBatch2);
        statusOperation = foodBatch.reanalyze();
        assertEquals("O lote 123 foi enviado para reanálise!",supervisor.getLastNotification());
        assertNull(supervisor2.getLastNotification());
    }

}