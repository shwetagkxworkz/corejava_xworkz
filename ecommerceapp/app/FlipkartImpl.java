package com.xworkz.ecommerceapp.app;

import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.exception.ContactNoNotFoundException;
import com.xworkz.ecommerceapp.exception.ContactNoNotFoundException;
import com.xworkz.ecommerceapp.exception.CustomerNameNotFoundException;
import com.xworkz.ecommerceapp.exception.EmailIdNotFoundException;

public class FlipkartImpl implements EcommerceApp{

    Customer customer[];
    int i;
    public FlipkartImpl(int size){
        customer=new Customer[size];
    }
    @Override
    public boolean addCustomerDetails(Customer customer) {
        System.out.println("addCustomerDetails method invoked");
        boolean isAdded=false;
        if(customer!=null){
            System.out.println("customer check completed");
            if(customer.getCustomerName()!=null && !customer.getCustomerName().isEmpty() && customer.getCustomerId()!=0){
                this.customer[i++]=customer;
                isAdded=true;
                System.out.println("customer details added successfully");
            }
        }

        return isAdded;
    }

    @Override
    public void getCustomerDetails() {
        System.out.println("getCustomerDetails method invoked");
        for (Customer customer1:
             customer) {
            System.out.println(customer1);
        }
    }

    @Override
    public String getCustomerNameById(int id) {
        String customerName=null;
        for (Customer c:customer
             ) {
            if(c.getCustomerId()==id){

                System.out.println("customer name is " +c.getCustomerName());
            }

        }
        if(customerName==null){
            CustomerNameNotFoundException exception=new CustomerNameNotFoundException(id);
            throw exception;
        }
        return customerName;
    }

    @Override
    public boolean updateEmailIdByCustomerId(int existingId, String updatedEmailId) {
        System.out.println("invoking updateEmailIdByCustomerId");
        boolean isUpadated=false;
        for (Customer c:customer
             ) {
            if (c.getCustomerId()==existingId){
                c.setEmailId(updatedEmailId);
                System.out.println(c.getCustomerName());
                System.out.println("email id is updated successfully");
                isUpadated=true;
            }
        }

        return isUpadated;
    }

    @Override
    public long getContactNoByCustomerName(String existingName) {
        System.out.println("invoking getContactNoByCustomerName method");
        long contactNo=0;
        for (Customer c:customer
             ) {
            if(c.getCustomerName().equals(existingName)){
                System.out.println("contact no is " + c.getContactNo());
            }

            else{
                ContactNoNotFoundException exception=new ContactNoNotFoundException(existingName);
                throw exception;
            }
        }
        return contactNo;
    }

    @Override
    public boolean updateCustomerNameByCustomerId(int existingId, String updatedName) {
        System.out.println("invoking updateCustomerNameByCustomerId");
        boolean isUpdated=false;
        for (Customer c:customer
             ) {
            if(c.getCustomerId()==existingId){
                c.setCustomerName(updatedName);
                System.out.println(c.getCustomerName());
                System.out.println("customer name is updated successfully");
                isUpdated=true;
            }
        }
        return isUpdated ;
    }

    @Override
    public String getEmailIdByCustomerName(String customerName) {
        String emailId=null;
        for (Customer c:customer
             ) {
            if(c.getCustomerName().equals(customerName)){
                System.out.println("email id is " +c.getEmailId());
            }
            else{
                EmailIdNotFoundException exception=new EmailIdNotFoundException(customerName);
                throw exception;
            }
        }


        return emailId;
    }
}
