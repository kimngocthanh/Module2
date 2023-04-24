package ss17.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String idProduct;
    private String nameProduct;
    private double priceProduct;
    private String manufacturedGoods;
    private String describe;

    public Product(){

    }

    public Product(String idProduct, String nameProduct, double priceProduct, String manufacturedGoods, String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.manufacturedGoods = manufacturedGoods;
        this.describe = describe;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturedGoods() {
        return manufacturedGoods;
    }

    public void setManufacturedGoods(String manufacturedGoods) {
        this.manufacturedGoods = manufacturedGoods;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", manufacturedGoods='" + manufacturedGoods + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
