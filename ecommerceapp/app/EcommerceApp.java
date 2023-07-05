package com.xworkz.ecommerceapp.app;

import com.xworkz.ecommerceapp.customer.Customer;

public interface EcommerceApp {
    boolean addCustomerDetails(Customer customer);

    void getCustomerDetails();

    String getCustomerNameById(int id);
    boolean updateEmailIdByCustomerId(int existingId, String updatedEmailId);
    long getContactNoByCustomerName(String existingName);
    boolean updateCustomerNameByCustomerId(int existingId, String updatedName);
    String getEmailIdByCustomerName(String customerName);
}
