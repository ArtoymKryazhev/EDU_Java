package Lab_3;

public class Product {

    private int productID;
    private String nameotdel;
    private int productCode;
    private String name;
    private String cuntry;
    private int pretailPrice;
    private String namesource;

    public Product(int productID, String nameotdel, int productCode, String name, String cuntry, int pretailPrice, String namesource) {
        this.productID = productID;
        this.nameotdel = nameotdel;
        this.productCode = productCode;
        this.name = name;
        this.cuntry = cuntry;
        this.pretailPrice = pretailPrice;
        this.namesource = namesource;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getNameotdel() {
        return nameotdel;
    }

    public void setNameotdel(String nameotdel) {
        this.nameotdel = nameotdel;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuntry() {
        return cuntry;
    }

    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }

    public int getPretailPrice() {
        return pretailPrice;
    }

    public void setPretailPrice(int pretailPrice) {
        this.pretailPrice = pretailPrice;
    }

    public String getNamesource() {
        return namesource;
    }

    public void setNamesource(String namesource) {
        this.namesource = namesource;
    }

    @Override
    public String toString() {
        return "Product {" +
                "productID='" + productID + '\'' +
                "nameotdel='" + nameotdel + '\'' +
                ", productCode=" + productCode +
                ", name='" + name + '\'' +
                ", country='" + cuntry + '\'' +
                ", retailPrice=" + pretailPrice +
                ", namesource='" + namesource + '\'' +
                '}';
    }
}
