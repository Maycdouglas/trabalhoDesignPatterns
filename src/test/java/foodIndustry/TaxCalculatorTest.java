package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    public void deveRetornarImpostoSobreBiscoito(){
        Biscuit biscuit = new Biscuit();

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Biscoito: 0.5 (5%)", taxCalculator.calculateTax(biscuit));
    }

    @Test
    public void deveRetornarImpostoSobreSalgadinho(){
        Snack snack = new Snack();

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Salgadinho: 1.0 (10%)", taxCalculator.calculateTax(snack));
    }

    @Test
    public void deveRetornarImpostoSobreChocolate(){
        Chocolate chocolate = new Chocolate();

        TaxCalculator taxCalculator = new TaxCalculator();
        assertEquals("Imposto sobre Chocolate: 2.0 (20%)", taxCalculator.calculateTax(chocolate));
    }


}