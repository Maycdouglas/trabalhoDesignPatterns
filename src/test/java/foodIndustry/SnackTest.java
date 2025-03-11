package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {
    @Test
    void deveRetornarSalgadinhoAdicionadoAoLote(){
        IProcessedFood food = ProcessedFoodFactory.processFood("Snack");
        assertEquals("Salgadinho adicionado ao lote.", food.addToBatch());
    }
}