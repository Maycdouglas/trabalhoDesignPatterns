package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateTest {
    @Test
    void deveRetornarChocolateAdicionadoAoLote(){
        IProcessedFood food = ProcessedFoodFactory.processFood("Chocolate");
        assertEquals("Chocolate adicionado ao lote.", food.addToBatch());
    }
}