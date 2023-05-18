package com.xworkz.chats;

public class Chats
{
    String names[]=new String[5];
    int i;
    public boolean addNames(String name){
        boolean isAdded=false;
        if(names!=null && i<names.length){
            names[i++]=name;
            isAdded=true;
        }
        else {
            System.out.println("reached max length");
        }
        return isAdded;
    }
   public void getNames(){
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
   }
}
