package com.xworkz.assignment;

public class Country {
    private int id;
    private int code;
    private String name;
    private  int noOfStates;
    private double population;
    private String currency;
    private String capital;

    public void setId(int id){
        this.id=id;
    }
    public void setCode(int code){
        this.code=code;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setNoOfStates(int noOfStates){
        this.noOfStates=noOfStates;
    }
    public void setPopulation(double population){
        this.population=population;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }

    public int getId(){
        return id;
    }
    public int getCode(){
        return  code;
    }
    public String getName(){
        return name;
    }
    public int getNoOfStates(){
        return noOfStates;
    }
    public double getPopulation(){
        return population;
    }
    public String getCurrency(){
        return currency;
    }
    public String getCapital(){
        return capital;
    }
}
