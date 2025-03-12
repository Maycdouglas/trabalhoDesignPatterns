package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionLineTest {

    @Test
    public void deveRetornarLinhaProducaoBiscoito(){
        IEquipmentFactory factory = new BiscuitEquipmentFactory();
        BiscuitProductionLine productionLine = new BiscuitProductionLine(factory);
        assertEquals("Biscoitos", productionLine.getProductType());
    }

    @Test
    public void deveRetornarLinhaProducaoSalgadinho(){
        IEquipmentFactory factory = new SnackEquipmentFactory();
        SnackProductionLine productionLine = new SnackProductionLine(factory);
        assertEquals("Salgadinhos", productionLine.getProductType());
    }

    @Test
    public void deveRetornarLinhaProducaoChocolate(){
        IEquipmentFactory factory = new ChocolateEquipmentFactory();
        ChocolateProductionLine productionLine = new ChocolateProductionLine(factory);
        assertEquals("Chocolates", productionLine.getProductType());
    }

    @Test
    public void deveRetornarProducaoBiscoitos(){
        IEquipmentFactory factory = new BiscuitEquipmentFactory();
        BiscuitProductionLine productionLine = new BiscuitProductionLine(factory);
        assertEquals("Misturando biscoito...\nAssando biscoito...\n Produção de Biscoitos concluída!", productionLine.startProduction());
    }

    @Test
    public void deveRetornarProducaoSalgadinhos(){
        IEquipmentFactory factory = new SnackEquipmentFactory();
        SnackProductionLine productionLine = new SnackProductionLine(factory);
        assertEquals("Misturando salgadinho...\nAssando salgadinho...\n Produção de Salgadinhos concluída!", productionLine.startProduction());
    }

    @Test
    public void deveRetornarProducaoChocolates(){
        IEquipmentFactory factory = new ChocolateEquipmentFactory();
        ChocolateProductionLine productionLine = new ChocolateProductionLine(factory);
        assertEquals("Misturando chocolate...\nAssando chocolate...\n Produção de Chocolates concluída!", productionLine.startProduction());
    }

}