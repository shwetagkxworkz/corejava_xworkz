package com.xworkz.country;

public class CountryTester {
    public static void main(String[] args) {
        States state=new States();
        Country country=new Country(state);
        country.state.toTax();
    }
}
