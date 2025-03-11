package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {
    @Test
    void deveRetornarBiscoitoAdicionadoAoLote(){
        IProcessedFood food = ProcessedFoodFactory.processFood("Biscuit");
        assertEquals("Biscoito adicionado ao lote.", food.addToBatch());
    }
}