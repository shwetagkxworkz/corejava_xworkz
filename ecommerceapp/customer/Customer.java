package com.xworkz.ecommerceapp.customer;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer {
    private int customerId;
    private String customerName;
    private long contactNo;
    private String emailId;
}
