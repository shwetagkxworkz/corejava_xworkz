package com.xworkz.assignment;

public class Bank {
    private int bankId;
    private long number;
    private String branch;
    private String type;
    private String ifscCode;
    private String location;

    public void setBankId(int bankId){
        this.bankId=bankId;
    }
    public void setNumber(long number){
        this.number=number;
    }
    public void setType(String type ){
        this.type=type;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public void setIfscCode(String ifscCode){
        this.ifscCode=ifscCode;
    }
    public void setLocation(String location) {
        this.location = location;

    }
    public int getBankId(){
        return bankId;
    }
    public String getType(){
        return type;
    }
    public long getNumber(){
        return number;
    }
    public String getBranch(){
        return branch;
    }
    public String getIfscCode(){
        return ifscCode;
    }
    public String getLocation(){
        return location;
}

}
