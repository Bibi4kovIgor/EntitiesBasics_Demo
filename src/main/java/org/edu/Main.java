package org.edu;

import org.edu.entities.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
                .id(1L)
                .city("Kharkiv")
                .country("Ukraine")
                .street("Gagarina")
                .houseNumber("45")
                .build();

        Payment payment = Payment.builder()
                .id(1L)
                .IBAN("UA45456446789768400000132")
                .name("Tom")
                .build();

        Product product = Product.builder()
                .id(1L)
                .name("LapTop")
                .price(new BigDecimal("1000.22"))
                .build();

        Customer customer = Customer.builder()
                .id(1L)
                .name("Joe")
                .build();

        Seller seller = Seller.builder()
                .id(1L)
                .name("Fill")
                .accounts(List.of(payment))
                .legalAddress(address)
                .build();

        Order order = Order.builder()
                .id(1L)
                .customer(customer)
                .seller(seller)
                .products(List.of(product))
                .build();

        System.out.println(order);
    }
}