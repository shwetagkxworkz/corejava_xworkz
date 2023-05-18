package com.xworkz.teaapp;

public class Tea {
     String teaNames[]=new String[3];
     int i;
    public  boolean addTeaName(String teaName){

        System.out.println("calling addTeaName");
        boolean isAdded=false;
        if(teaNames!=null  && i<teaNames.length){

            teaNames[i++]=teaName;

            isAdded=true;

            System.out.println("tea name is added");
        }

        else  {
            System.out.println("teaNames reach max");
        }

        return isAdded;

    }
    public void getTeaNames(){
        for(int i=0; i<teaNames.length; i++){
            System.out.println(teaNames[i]);
        }
    }
}
