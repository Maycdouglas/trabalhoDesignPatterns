package foodIndustry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagingTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Packaging packaging = Packaging.getInstance();

        Packaging packagingClone = packaging.clone();
        packagingClone.setIdBatch(2);
        packagingClone.setProductName("Snack");

        assertEquals("Embalagem produto nome do produto, lote 0", packaging.toString());
        assertEquals("Embalagem produto Snack, lote 2", packagingClone.toString());
    }

}