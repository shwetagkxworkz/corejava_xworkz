package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.app.EcommerceApp;
import com.xworkz.ecommerceapp.app.FlipkartImpl;
import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.exception.ContactNoNotFoundException;
import com.xworkz.ecommerceapp.exception.CustomerNameNotFoundException;
import com.xworkz.ecommerceapp.exception.EmailIdNotFoundException;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of customer");
        int size = sc.nextInt();
        EcommerceApp app = new FlipkartImpl(size);
        for (int i = 0; i < size; i++) {
            Customer customer = new Customer();
            System.out.println("enter the customer id");
            customer.setCustomerId(sc.nextInt());
            System.out.println("enter the customer name");
            customer.setCustomerName(sc.next());
            System.out.println("enter the contact no");
            customer.setContactNo(sc.nextLong());
            System.out.println("enter the email id");
            customer.setEmailId(sc.next());

            app.addCustomerDetails(customer);
        }

        String text = null;
        do {
            System.out.println("1: get all customer details");
            System.out.println("2: get customer name by id");
            System.out.println("3: update email id by customer id");
            System.out.println("4: get contact no by customer name");
            System.out.println("5: update customer name by customer id");
            System.out.println("6: get email id by customer name");

            System.out.println("enter the option");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println(" customer details are");
                    app.getCustomerDetails();
                    break;

                case 2:
                    System.out.println("enter the existing id");
                    try {
                        app.getCustomerNameById(sc.nextInt());
                    }catch (CustomerNameNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("enter the customer id");
                    app.updateEmailIdByCustomerId(sc.nextInt(), sc.next());
                    break;

                case 4:
                    System.out.println("enter the customer name");
                    try {
                        app.getContactNoByCustomerName(sc.next());
                    }catch (ContactNoNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("enter customer id");
                    System.out.println("enter new name");
                    app.updateCustomerNameByCustomerId(sc.nextInt(), sc.next());
                  //  app.getCustomerDetails();
                    break;

                case 6:
                    System.out.println("enter customer name");
                    try {
                        app.getEmailIdByCustomerName(sc.next());
                    }catch (EmailIdNotFoundException e){
                        e.printStackTrace();
                    }
                    break;
            }
            System.out.println("do you want to continue : y/n");
            text = sc.next();


        }
        while (text.equals("y"));
    }
}
