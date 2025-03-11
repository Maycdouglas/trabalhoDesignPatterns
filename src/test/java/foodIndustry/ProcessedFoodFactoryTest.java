package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessedFoodFactoryTest {
    @Test
    void deveRetornarExececaoParaAlimentoProcessadoInexistente() {
        try{
            IProcessedFood processedFood = ProcessedFoodFactory.processFood("Candy");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Alimento processado inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExececaoParaAlimentoProcessadoInvalido() {
        try{
            IProcessedFood processedFood = ProcessedFoodFactory.processFood("FrozenPizza");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Alimento processado inválido.", e.getMessage());
        }
    }
}