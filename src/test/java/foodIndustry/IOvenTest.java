package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOvenTest {
    @Test
    public void deveRetornarAssandoSalgadinho(){
        SnackOven snackOven = new SnackOven();
        assertEquals("Assando salgadinho...", snackOven.bake());
    }

    @Test
    public void deveRetornarAssandoChocolate(){
        ChocolateOven chocolateOven = new ChocolateOven();
        assertEquals("Assando chocolate...", chocolateOven.bake());
    }

    @Test
    public void deveRetornarAssandoBiscoito(){
        BiscuitOven biscuitOven = new BiscuitOven();
        assertEquals("Assando biscoito...", biscuitOven.bake());
    }
}