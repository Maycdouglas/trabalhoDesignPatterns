package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpirationCalculatorTest {

    @Test
    public void deveRetornarValidadeSobreBiscoito(){
        Biscuit biscuit = new Biscuit();

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Biscoito vence em: 20/02/2025", expirationCalculator.calculateExpiration(biscuit));
    }

    @Test
    public void deveRetornarValidadeSobreSalgadinho(){
        Snack snack = new Snack();

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Salgadinho vence em: 22/02/2025", expirationCalculator.calculateExpiration(snack));
    }

    @Test
    public void deveRetornarValidadeSobreChocolate(){
        Chocolate chocolate = new Chocolate();

        ExpirationCalculator expirationCalculator = new ExpirationCalculator();
        assertEquals("Chocolate vence em: 21/02/2025", expirationCalculator.calculateExpiration(chocolate));
    }

}