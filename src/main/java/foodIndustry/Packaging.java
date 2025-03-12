package foodIndustry;

public class Packaging implements Cloneable {

    private Packaging() {}

    private static Packaging instance = new Packaging();

    public static Packaging getInstance() {
        return instance;
    }

    private Number idBatch = 0;
    private String productName = "nome do produto";
    private String info = "Outras informações da emabalagem do produto";

    public Number getIdBatch() {
        return idBatch;
    }

    public void setIdBatch(Number idBatch) {
        this.idBatch = idBatch;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public Packaging clone() throws CloneNotSupportedException {
        return (Packaging) super.clone();
    }

    @Override
    public String toString(){
        return "Embalagem produto " + productName + ", lote " + idBatch;
    }

}
