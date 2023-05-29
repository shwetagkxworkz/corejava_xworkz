package com.xworkz.company;

public class CompanyTester {
    public static void main(String[] args) {
        Brand brand=new Brand();
        Company company=new Company(brand);
        company.brand.toName();
        
    }
}
