package foodIndustry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagingLineTest {

    PackagingLine packagingLine;
    Biscuit biscuit;
    FoodBatch batch;

    @BeforeEach
    public void setUp(){
        packagingLine = new PackagingLine();
        biscuit = new Biscuit();
        batch = new FoodBatch(1, biscuit);
    }

    @Test
    public void deveRetornarLoteEmpacotadoComTecnicaVacuo() {
        batch.setStrategy(VacuumPackaging.getInstance());
        assertEquals("Lote 1 empacotado com técnica de embalagem a vácuo.", packagingLine.packBatch(batch));
    }

    @Test
    public void deveRetornarLoteEmpacotadoComTecnicaAtmosferaModificada() {
        batch.setStrategy(ModifiedAtmospherePackaging.getInstance());
        assertEquals("Lote 1 empacotado com técnica de embalagem com Atmosfera Modificada.", packagingLine.packBatch(batch));
    }

    @Test
    public void deveRetornarLoteEmpacotadoComTecnicaTradicional() {
        assertEquals("Lote 1 empacotado com técnica de embalagem tradicional.", packagingLine.packBatch(batch));
    }

}