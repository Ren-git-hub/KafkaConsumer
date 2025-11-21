package com.renish.kafkaconsumer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Customers {

    private int customerId;
    private String customerName;
    private String customerPhone;

}
