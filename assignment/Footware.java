package com.xworkz.assignment;

public class Footware {
    private int id;
    private String brand;
    private int size;
    private double price;
    private String materialType;

    public void setId(int id){
        this.id=id;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setMaterialType(String materialType){
        this.materialType=materialType;
    }

    public  int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public int getSize(){
        return size;
    }
    public double getPrice(){
        return price;
    }
    public String getMaterialType(){
        return materialType;
    }
}
