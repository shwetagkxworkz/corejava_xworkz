package com.xworkz.assignment;

public class Cake {
    private int cakeId;
    private String color;
    private String shape;
    private String flavaour;
    private double price;

    public void setCakeId(int cakeId){
        this.cakeId=cakeId;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setShape(String shape){
        this.shape=shape;
    }
    public void setFlavaour(String flavaour){
        this.flavaour=flavaour;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public int getCakeId(){
        return cakeId;
    }
    public String getColor(){
        return color;
    }
    public String getShape(){
        return shape;
    }
    public String getFlavaour(){
        return flavaour;
    }
    public double getPrice(){
        return price;
    }
}
