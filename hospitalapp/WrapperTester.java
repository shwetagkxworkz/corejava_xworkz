package com.xworkz.hospitalapp;

public class WrapperTester {


    public static void main(String[] args) {


        int i = 89 ;
        //boxing
        Integer i1 = i ;
        Integer integer = new Integer(i);

        long phoneNumber = 8998908900L;

        // auto boxing
        Long phone2 = phoneNumber ;

        // manual  boxing
        Long phone = Long.valueOf(phoneNumber);
        Character character =  Character.valueOf('j');
        // unboxing
        char charac = character;

        // unboxing
        long phone1 = phone;

        String str = "Baba";




    }
}
